// Generated from /run/media/ael/Projects/AaltoWork/PORTHOS/dartagnan/C11.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link C11Parser}.
 */
public interface C11Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link C11Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(C11Parser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(C11Parser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(C11Parser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(C11Parser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(C11Parser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(C11Parser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(C11Parser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(C11Parser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(C11Parser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(C11Parser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(C11Parser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(C11Parser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(C11Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(C11Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(C11Parser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(C11Parser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(C11Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(C11Parser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(C11Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(C11Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(C11Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(C11Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(C11Parser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(C11Parser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(C11Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(C11Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(C11Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(C11Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(C11Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(C11Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(C11Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(C11Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(C11Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(C11Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(C11Parser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(C11Parser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(C11Parser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(C11Parser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(C11Parser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(C11Parser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(C11Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(C11Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(C11Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(C11Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(C11Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(C11Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(C11Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(C11Parser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(C11Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(C11Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(C11Parser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(C11Parser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(C11Parser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(C11Parser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(C11Parser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(C11Parser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(C11Parser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(C11Parser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(C11Parser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(C11Parser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(C11Parser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(C11Parser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(C11Parser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(C11Parser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(C11Parser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(C11Parser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(C11Parser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(C11Parser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(C11Parser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(C11Parser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(C11Parser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(C11Parser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(C11Parser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(C11Parser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(C11Parser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(C11Parser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(C11Parser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(C11Parser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(C11Parser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(C11Parser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(C11Parser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(C11Parser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(C11Parser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(C11Parser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(C11Parser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(C11Parser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(C11Parser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(C11Parser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(C11Parser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(C11Parser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(C11Parser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(C11Parser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(C11Parser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(C11Parser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(C11Parser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(C11Parser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(C11Parser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(C11Parser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(C11Parser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(C11Parser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(C11Parser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(C11Parser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(C11Parser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(C11Parser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(C11Parser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(C11Parser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(C11Parser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(C11Parser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(C11Parser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(C11Parser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(C11Parser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(C11Parser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(C11Parser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(C11Parser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(C11Parser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(C11Parser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(C11Parser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(C11Parser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(C11Parser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(C11Parser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(C11Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(C11Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(C11Parser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(C11Parser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(C11Parser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(C11Parser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(C11Parser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(C11Parser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(C11Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(C11Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(C11Parser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(C11Parser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(C11Parser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(C11Parser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(C11Parser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(C11Parser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(C11Parser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(C11Parser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(C11Parser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(C11Parser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(C11Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(C11Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(C11Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(C11Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(C11Parser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(C11Parser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(C11Parser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(C11Parser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(C11Parser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(C11Parser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(C11Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(C11Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(C11Parser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(C11Parser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(C11Parser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(C11Parser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(C11Parser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(C11Parser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(C11Parser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(C11Parser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(C11Parser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(C11Parser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(C11Parser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(C11Parser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(C11Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(C11Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(C11Parser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(C11Parser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(C11Parser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(C11Parser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(C11Parser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(C11Parser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C11Parser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(C11Parser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C11Parser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(C11Parser.DeclarationListContext ctx);
}