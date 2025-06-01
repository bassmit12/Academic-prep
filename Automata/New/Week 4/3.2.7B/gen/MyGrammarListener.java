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
	 * Enter a parse tree produced by {@link MyGrammarParser#dfa}.
	 * @param ctx the parse tree
	 */
	void enterDfa(MyGrammarParser.DfaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#dfa}.
	 * @param ctx the parse tree
	 */
	void exitDfa(MyGrammarParser.DfaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#firstDfa}.
	 * @param ctx the parse tree
	 */
	void enterFirstDfa(MyGrammarParser.FirstDfaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#firstDfa}.
	 * @param ctx the parse tree
	 */
	void exitFirstDfa(MyGrammarParser.FirstDfaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#secondDfa}.
	 * @param ctx the parse tree
	 */
	void enterSecondDfa(MyGrammarParser.SecondDfaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#secondDfa}.
	 * @param ctx the parse tree
	 */
	void exitSecondDfa(MyGrammarParser.SecondDfaContext ctx);
}