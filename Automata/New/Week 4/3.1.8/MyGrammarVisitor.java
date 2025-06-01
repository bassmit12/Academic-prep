// Generated from MyGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(MyGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#oddA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOddA(MyGrammarParser.OddAContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#evenA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvenA(MyGrammarParser.EvenAContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#oddB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOddB(MyGrammarParser.OddBContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#evenB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvenB(MyGrammarParser.EvenBContext ctx);
}