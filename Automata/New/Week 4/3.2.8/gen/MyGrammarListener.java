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
	 * Enter a parse tree produced by {@link MyGrammarParser#validInput}.
	 * @param ctx the parse tree
	 */
	void enterValidInput(MyGrammarParser.ValidInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#validInput}.
	 * @param ctx the parse tree
	 */
	void exitValidInput(MyGrammarParser.ValidInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#invalidInput}.
	 * @param ctx the parse tree
	 */
	void enterInvalidInput(MyGrammarParser.InvalidInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#invalidInput}.
	 * @param ctx the parse tree
	 */
	void exitInvalidInput(MyGrammarParser.InvalidInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#abbRepetition}.
	 * @param ctx the parse tree
	 */
	void enterAbbRepetition(MyGrammarParser.AbbRepetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#abbRepetition}.
	 * @param ctx the parse tree
	 */
	void exitAbbRepetition(MyGrammarParser.AbbRepetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#aStarbbStar}.
	 * @param ctx the parse tree
	 */
	void enterAStarbbStar(MyGrammarParser.AStarbbStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#aStarbbStar}.
	 * @param ctx the parse tree
	 */
	void exitAStarbbStar(MyGrammarParser.AStarbbStarContext ctx);
}