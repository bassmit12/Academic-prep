// Generated from ExamGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExamGrammarParser}.
 */
public interface ExamGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExamGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExamGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExamGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExamGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementPrint}
	 * labeled alternative in {@link ExamGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrint(ExamGrammarParser.StatementPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementPrint}
	 * labeled alternative in {@link ExamGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrint(ExamGrammarParser.StatementPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link ExamGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment(ExamGrammarParser.StatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link ExamGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment(ExamGrammarParser.StatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link ExamGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(ExamGrammarParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStat}
	 * labeled alternative in {@link ExamGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(ExamGrammarParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link ExamGrammarParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(ExamGrammarParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link ExamGrammarParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(ExamGrammarParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link ExamGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(ExamGrammarParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link ExamGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(ExamGrammarParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExamGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ExamGrammarParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExamGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ExamGrammarParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExamGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExamGrammarParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExamGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExamGrammarParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBase}
	 * labeled alternative in {@link ExamGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBase(ExamGrammarParser.ExprBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBase}
	 * labeled alternative in {@link ExamGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBase(ExamGrammarParser.ExprBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ExamGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ExamGrammarParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ExamGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ExamGrammarParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExamGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExamGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExamGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExamGrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link ExamGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterId(ExamGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link ExamGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitId(ExamGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ExamGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterParens(ExamGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ExamGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitParens(ExamGrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code treeLiteral}
	 * labeled alternative in {@link ExamGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTreeLiteral(ExamGrammarParser.TreeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code treeLiteral}
	 * labeled alternative in {@link ExamGrammarParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTreeLiteral(ExamGrammarParser.TreeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyTree}
	 * labeled alternative in {@link ExamGrammarParser#tree}.
	 * @param ctx the parse tree
	 */
	void enterEmptyTree(ExamGrammarParser.EmptyTreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyTree}
	 * labeled alternative in {@link ExamGrammarParser#tree}.
	 * @param ctx the parse tree
	 */
	void exitEmptyTree(ExamGrammarParser.EmptyTreeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NodeTree}
	 * labeled alternative in {@link ExamGrammarParser#tree}.
	 * @param ctx the parse tree
	 */
	void enterNodeTree(ExamGrammarParser.NodeTreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NodeTree}
	 * labeled alternative in {@link ExamGrammarParser#tree}.
	 * @param ctx the parse tree
	 */
	void exitNodeTree(ExamGrammarParser.NodeTreeContext ctx);
}