// Generated from d:/AP/Academic-prep/Automata/website_java/HTML.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HTMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HTMLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HTMLParser.AttributeContext ctx);
}