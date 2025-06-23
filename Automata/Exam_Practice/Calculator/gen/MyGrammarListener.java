// Generated from MyGrammar.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MyGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MyGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(MyGrammarParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(MyGrammarParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printCmd}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintCmd(MyGrammarParser.PrintCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printCmd}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintCmd(MyGrammarParser.PrintCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(MyGrammarParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(MyGrammarParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MyGrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MyGrammarParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MyGrammarParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MyGrammarParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MyGrammarParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(MyGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(MyGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(MyGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(MyGrammarParser.IntContext ctx);
}