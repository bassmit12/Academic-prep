// Generated from Calculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalculatorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CalculatorParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#printStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(CalculatorParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(CalculatorParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(CalculatorParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(CalculatorParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CalculatorParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(CalculatorParser.BooleanExprContext ctx);
}