// Generated from d:/AP/Academic-prep/Automata/AUT_W1_Demo/AUT_W1_Demo/MyGrammar.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link MyGrammarParser#hello}.
	 * @param ctx the parse tree
	 */
	void enterHello(MyGrammarParser.HelloContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#hello}.
	 * @param ctx the parse tree
	 */
	void exitHello(MyGrammarParser.HelloContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#goodbye}.
	 * @param ctx the parse tree
	 */
	void enterGoodbye(MyGrammarParser.GoodbyeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#goodbye}.
	 * @param ctx the parse tree
	 */
	void exitGoodbye(MyGrammarParser.GoodbyeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MyGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MyGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#age}.
	 * @param ctx the parse tree
	 */
	void enterAge(MyGrammarParser.AgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#age}.
	 * @param ctx the parse tree
	 */
	void exitAge(MyGrammarParser.AgeContext ctx);
}