// Generated from Calculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalculatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalculatorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(CalculatorParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(CalculatorParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(CalculatorParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(CalculatorParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(CalculatorParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(CalculatorParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CalculatorParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CalculatorParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CalculatorParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CalculatorParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(CalculatorParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(CalculatorParser.BooleanExprContext ctx);
}