package dartagnan.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

import com.microsoft.z3.*;

import dartagnan.expression.Assert;
import dartagnan.utils.*;
import dartagnan.wmm.*;

public class Program {
	
	public String name;
	public Assert ass; 
	private List<ProgramThread> programThreads;
	public MapSSA lastMap;

	public Program (String name) {
		this.name = name;
		this.programThreads = new ArrayList<ProgramThread>();
	}
	
	public void add(ProgramThread t) {
		programThreads.add(t);
	}
	
	public String toString() {
		
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		String output = name + "\n";
		while (iter.hasNext()) {
			ProgramThread next = iter.next();
			if(next instanceof Init) {
				continue;
			}
		    output = output.concat(String.format("\nthread %d\n%s\n", iter.nextIndex(), next));
		}
        return output;
	}
	
	public Program clone() {
		List<ProgramThread> newProgramThreads = new ArrayList<ProgramThread>();
		
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
			newProgramThreads.add(t.clone());
		}
		Program newP = new Program(name);
		newP.setProgramThreads(newProgramThreads);
		return newP;
	}
	
	public void initialize() {
		initialize(1);
	}
	
	public void initialize(int steps) {
		List<ProgramThread> unrolledProgramThreads = new ArrayList<ProgramThread>();
		
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
			t = t.unroll(steps);
			unrolledProgramThreads.add(t);
		}
		programThreads = unrolledProgramThreads;
		
		Set<Location> locs = getEvents().stream().filter(e -> e instanceof MemEvent).map(e -> ((MemEvent) e).getLoc()).collect(Collectors.toSet());
		for(Location loc : locs) {
			programThreads.add(new Init(loc));
		}
	}
	
	public void compile(String target, boolean ctrl, boolean leading) {
		List<ProgramThread> compiledProgramThreads = new ArrayList<ProgramThread>();
		
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
			t = t.compile(target, ctrl, leading);
			compiledProgramThreads.add(t);
		}
		programThreads = compiledProgramThreads;

		setTId();
		setEId();
		setMainThread();
		
		// Set the thread for the registers
		iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
            t.setCondRegs(new HashSet<Register>());
            t.setLastModMap(new LastModMap());
			Set<Register> regs = t.getEvents().stream().filter(e -> e instanceof Load).map(e -> ((Load) e).getReg()).collect(Collectors.toSet());
			regs.addAll(t.getEvents().stream().filter(e -> e instanceof Store).map(e -> ((Store) e).getReg()).collect(Collectors.toSet()));
			regs.addAll(t.getEvents().stream().filter(e -> e instanceof Local).map(e -> ((Local) e).getReg()).collect(Collectors.toSet()));
			for(Register reg : regs) {
				reg.setMainThread(t.tid);
			}
		}
	}	

	public void compile(String target, boolean ctrl, boolean leading, Integer firstEid) {
		List<ProgramThread> compiledProgramThreads = new ArrayList<ProgramThread>();
		
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
			t = t.compile(target, ctrl, leading);
			compiledProgramThreads.add(t);
		}
		programThreads = compiledProgramThreads;

		setTId();
		setEId(firstEid);
		setMainThread();
		
		// Set the thread for the registers
		iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
            t.setCondRegs(new HashSet<Register>());
            t.setLastModMap(new LastModMap());
			Set<Register> regs = t.getEvents().stream().filter(e -> e instanceof Load).map(e -> ((Load) e).getReg()).collect(Collectors.toSet());
			regs.addAll(t.getEvents().stream().filter(e -> e instanceof Store).map(e -> ((Store) e).getReg()).collect(Collectors.toSet()));
			regs.addAll(t.getEvents().stream().filter(e -> e instanceof Local).map(e -> ((Local) e).getReg()).collect(Collectors.toSet()));
			for(Register reg : regs) {
				reg.setMainThread(t.tid);
			}
		}
	}	

	public void optCompile(Integer firstEId, boolean ctrl, boolean leading) {
		List<ProgramThread> compiledProgramThreads = new ArrayList<ProgramThread>();
		
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
			t = t.optCompile(ctrl, leading);
			compiledProgramThreads.add(t);
		}
		programThreads = compiledProgramThreads;
		
		setTId();
		setEId(firstEId);
		setMainThread();
		
		// Set the thread for the registers
		iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
            t.setCondRegs(new HashSet<Register>());
            t.setLastModMap(new LastModMap());
			Set<Register> regs = t.getEvents().stream().filter(e -> e instanceof Load).map(e -> ((Load) e).getReg()).collect(Collectors.toSet());
			regs.addAll(t.getEvents().stream().filter(e -> e instanceof Store).map(e -> ((Store) e).getReg()).collect(Collectors.toSet()));
			regs.addAll(t.getEvents().stream().filter(e -> e instanceof Local).map(e -> ((Local) e).getReg()).collect(Collectors.toSet()));
			for(Register reg : regs) {
				reg.setMainThread(t.tid);
			}
		}
	}
	
	public void allCompile(Integer firstEId) {
		List<ProgramThread> compiledProgramThreads = new ArrayList<ProgramThread>();
		
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
			t = t.allCompile();
			compiledProgramThreads.add(t);
		}
		programThreads = compiledProgramThreads;
		
		setTId();
		setEId(firstEId);
		setMainThread();
		
		// Set the thread for the registers
		iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
            t.setCondRegs(new HashSet<Register>());
            t.setLastModMap(new LastModMap());
			Set<Register> regs = t.getEvents().stream().filter(e -> e instanceof Load).map(e -> ((Load) e).getReg()).collect(Collectors.toSet());
			regs.addAll(t.getEvents().stream().filter(e -> e instanceof Store).map(e -> ((Store) e).getReg()).collect(Collectors.toSet()));
			regs.addAll(t.getEvents().stream().filter(e -> e instanceof Local).map(e -> ((Local) e).getReg()).collect(Collectors.toSet()));
			for(Register reg : regs) {
				reg.setMainThread(t.tid);
			}
		}
	}

	public BoolExpr encodeMM(Context ctx, String mcm) throws Z3Exception {
		BoolExpr enc = ctx.mkTrue();
		switch (mcm){
		case "sc":
			enc = ctx.mkAnd(enc, SC.encode(this, ctx));
			break;
		case "tso":
			enc = ctx.mkAnd(enc, TSO.encode(this, ctx));
			break;
		case "pso":
			enc = ctx.mkAnd(enc, PSO.encode(this, ctx));
			break;
		case "rmo":
			enc = ctx.mkAnd(enc, RMO.encode(this, ctx));
			break;
		case "alpha":
			enc = ctx.mkAnd(enc, Alpha.encode(this, ctx));
			break;
		case "power":
			enc = ctx.mkAnd(enc, Power.encode(this, ctx));
			break;
		case "arm":
			enc = ctx.mkAnd(enc, ARM.encode(this, ctx));
			break;
		default:
			System.out.println("Check encodeConsistent!");
			break;
		}
		return enc;
	}

	public BoolExpr encodeConsistent(Context ctx, String mcm) throws Z3Exception {
		BoolExpr enc = ctx.mkTrue();
		switch (mcm){
		case "sc":
			enc = ctx.mkAnd(enc, SC.Consistent(this, ctx));
			break;
		case "tso":
			enc = ctx.mkAnd(enc, TSO.Consistent(this, ctx));
			break;
		case "pso":
			enc = ctx.mkAnd(enc, PSO.Consistent(this, ctx));
			break;
		case "rmo":
			enc = ctx.mkAnd(enc, RMO.Consistent(this, ctx));
			break;
		case "alpha":
			enc = ctx.mkAnd(enc, Alpha.Consistent(this, ctx));
			break;
		case "power":
			enc = ctx.mkAnd(enc, Power.Consistent(this, ctx));
			break;
		case "arm":
			enc = ctx.mkAnd(enc, ARM.Consistent(this, ctx));
			break;
		default:
			System.out.println("Check encodeConsistent!");
			break;
		}
		return enc;
	}
	
	public BoolExpr encodeInconsistent(Context ctx, String mcm) throws Z3Exception {
		BoolExpr enc = ctx.mkTrue();
		switch (mcm) {
		case "sc":
			enc = ctx.mkAnd(enc, SC.Inconsistent(this, ctx));
			break;
		case "tso":
			enc = ctx.mkAnd(enc, TSO.Inconsistent(this, ctx));
			break;
		case "pso":
			enc = ctx.mkAnd(enc, PSO.Inconsistent(this, ctx));
			break;
		case "rmo":
			enc = ctx.mkAnd(enc, RMO.Inconsistent(this, ctx));
			break;
		case "alpha":
			enc = ctx.mkAnd(enc, Alpha.Inconsistent(this, ctx));
			break;
		case "power":
			enc = ctx.mkAnd(enc, Power.Inconsistent(this, ctx));
			break;
		case "arm":
			enc = ctx.mkAnd(enc, ARM.Inconsistent(this, ctx));
			break;
		default:
			System.out.println("Check encodeInconsistent!");
			break;
		}
		return enc;
	}
	
	public Set<Event> getEvents() {
		Set<Event> ret = new HashSet<Event>();
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ret.addAll(iter.next().getEvents());
		}
		return ret;
	}
	
	public void setMainThread() {
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
		    t.setMainThread(t.tid);
		}
	}
	
	public void setEId() {
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		Integer lastId = 1;
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
		    lastId = t.setEId(lastId);
		}
	}

	public void setEId(Integer lastId) {
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
		    lastId = t.setEId(lastId);
		}
	}

	public void setTId() {
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		Integer lastId = 1;
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
		    lastId = t.setTId(lastId);
		}
	}

	public BoolExpr encodeDF(Context ctx) throws Z3Exception {
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		MapSSA lastMap = new MapSSA();
		BoolExpr enc = ctx.mkTrue();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
			Pair<BoolExpr, MapSSA>recResult = t.encodeDF(lastMap, ctx);
		    enc = ctx.mkAnd(enc, recResult.getFirst());
		    lastMap = recResult.getSecond();
		}
		this.lastMap = lastMap;
		return enc;
	}

	public BoolExpr encodeAssertion(Context ctx) {
		return ass.encode(ctx, lastMap);
	}
	
	public BoolExpr encodeCF(Context ctx) throws Z3Exception {
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		BoolExpr enc = ctx.mkTrue();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
		    enc = ctx.mkAnd(enc, t.encodeCF(ctx));
		    // Main programThreads are active
		    enc = ctx.mkAnd(enc, ctx.mkBoolConst(t.cfVar()));
		}
		return enc;
	}
	
	public BoolExpr allExecute(Context ctx) throws Z3Exception {
		ListIterator<ProgramThread> iter = programThreads.listIterator();
		BoolExpr enc = ctx.mkTrue();
		while (iter.hasNext()) {
			ProgramThread t = iter.next();
		    enc = ctx.mkAnd(enc, t.allExecute(ctx));
		    // Main programThreads are active
		    enc = ctx.mkAnd(enc, ctx.mkBoolConst(t.cfVar()));
		}
		return enc;
	}
	
	public BoolExpr encodeDF_RF(Context ctx) throws Z3Exception {
		BoolExpr enc = ctx.mkTrue();
		Set<Event> loadEvents = getEvents().stream().filter(e -> e instanceof Load).collect(Collectors.toSet());
		for (Event r : loadEvents) {
			Set<Event> storeSameLoc = getEvents().stream().filter(w -> (w instanceof Store || w instanceof Init) && ((MemEvent) w).loc == ((Load) r).loc).collect(Collectors.toSet());
			BoolExpr sameValue = ctx.mkTrue();
			for (Event w : storeSameLoc) {
				sameValue = ctx.mkAnd(sameValue, ctx.mkImplies(Utils.edge("rf", w, r, ctx), ctx.mkEq(((MemEvent) w).ssaLoc, ((Load) r).ssaLoc)));
			}
			enc = ctx.mkAnd(enc, sameValue);
		}
		return enc;
	}

	public List<ProgramThread> getProgramThreads() {
		return this.programThreads;
	}
	
	public void setProgramThreads(List<ProgramThread> programThreads) {
		this.programThreads = programThreads;
	}

}