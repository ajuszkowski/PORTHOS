// Generated from /run/media/ael/Projects/AaltoWork/PORTHOS/dartagnan/Cmin.g4 by ANTLR 4.7

package dartagnan;
import dartagnan.program.*;
import dartagnan.expression.*;
import dartagnan.program.ProgramThread;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CminParser}.
 */
public interface CminListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CminParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(CminParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(CminParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#arith_atom}.
	 * @param ctx the parse tree
	 */
	void enterArith_atom(CminParser.Arith_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#arith_atom}.
	 * @param ctx the parse tree
	 */
	void exitArith_atom(CminParser.Arith_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#arith_comp}.
	 * @param ctx the parse tree
	 */
	void enterArith_comp(CminParser.Arith_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#arith_comp}.
	 * @param ctx the parse tree
	 */
	void exitArith_comp(CminParser.Arith_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(CminParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(CminParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#bool_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_atom(CminParser.Bool_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#bool_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_atom(CminParser.Bool_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(CminParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(CminParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(CminParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(CminParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(CminParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(CminParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(CminParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(CminParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#store}.
	 * @param ctx the parse tree
	 */
	void enterStore(CminParser.StoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#store}.
	 * @param ctx the parse tree
	 */
	void exitStore(CminParser.StoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(CminParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(CminParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(CminParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(CminParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#fence}.
	 * @param ctx the parse tree
	 */
	void enterFence(CminParser.FenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#fence}.
	 * @param ctx the parse tree
	 */
	void exitFence(CminParser.FenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#mfence}.
	 * @param ctx the parse tree
	 */
	void enterMfence(CminParser.MfenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#mfence}.
	 * @param ctx the parse tree
	 */
	void exitMfence(CminParser.MfenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#sync}.
	 * @param ctx the parse tree
	 */
	void enterSync(CminParser.SyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#sync}.
	 * @param ctx the parse tree
	 */
	void exitSync(CminParser.SyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#lwsync}.
	 * @param ctx the parse tree
	 */
	void enterLwsync(CminParser.LwsyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#lwsync}.
	 * @param ctx the parse tree
	 */
	void exitLwsync(CminParser.LwsyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#isync}.
	 * @param ctx the parse tree
	 */
	void enterIsync(CminParser.IsyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#isync}.
	 * @param ctx the parse tree
	 */
	void exitIsync(CminParser.IsyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(CminParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(CminParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CminParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CminParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeq(CminParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeq(CminParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#if1}.
	 * @param ctx the parse tree
	 */
	void enterIf1(CminParser.If1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#if1}.
	 * @param ctx the parse tree
	 */
	void exitIf1(CminParser.If1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#if2}.
	 * @param ctx the parse tree
	 */
	void enterIf2(CminParser.If2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#if2}.
	 * @param ctx the parse tree
	 */
	void exitIf2(CminParser.If2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(CminParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(CminParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CminParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CminParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CminParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CminParser.ProgramContext ctx);
}