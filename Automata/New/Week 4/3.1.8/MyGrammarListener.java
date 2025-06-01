// Generated from MyGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MyGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MyGrammarParser.StartContext ctx);
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
	 * Enter a parse tree produced by {@link MyGrammarParser#oddA}.
	 * @param ctx the parse tree
	 */
	void enterOddA(MyGrammarParser.OddAContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#oddA}.
	 * @param ctx the parse tree
	 */
	void exitOddA(MyGrammarParser.OddAContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#evenA}.
	 * @param ctx the parse tree
	 */
	void enterEvenA(MyGrammarParser.EvenAContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#evenA}.
	 * @param ctx the parse tree
	 */
	void exitEvenA(MyGrammarParser.EvenAContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#oddB}.
	 * @param ctx the parse tree
	 */
	void enterOddB(MyGrammarParser.OddBContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#oddB}.
	 * @param ctx the parse tree
	 */
	void exitOddB(MyGrammarParser.OddBContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#evenB}.
	 * @param ctx the parse tree
	 */
	void enterEvenB(MyGrammarParser.EvenBContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#evenB}.
	 * @param ctx the parse tree
	 */
	void exitEvenB(MyGrammarParser.EvenBContext ctx);
}