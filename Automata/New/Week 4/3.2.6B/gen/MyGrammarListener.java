// Generated from MyGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void enterMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#myStart}.
	 * @param ctx the parse tree
	 */
	void exitMyStart(MyGrammarParser.MyStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#middle}.
	 * @param ctx the parse tree
	 */
	void enterMiddle(MyGrammarParser.MiddleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#middle}.
	 * @param ctx the parse tree
	 */
	void exitMiddle(MyGrammarParser.MiddleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#ending}.
	 * @param ctx the parse tree
	 */
	void enterEnding(MyGrammarParser.EndingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#ending}.
	 * @param ctx the parse tree
	 */
	void exitEnding(MyGrammarParser.EndingContext ctx);
}