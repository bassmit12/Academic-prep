// Generated from RegexGame.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegexGameParser}.
 */
public interface RegexGameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#gameStart}.
	 * @param ctx the parse tree
	 */
	void enterGameStart(RegexGameParser.GameStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#gameStart}.
	 * @param ctx the parse tree
	 */
	void exitGameStart(RegexGameParser.GameStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#challenge}.
	 * @param ctx the parse tree
	 */
	void enterChallenge(RegexGameParser.ChallengeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#challenge}.
	 * @param ctx the parse tree
	 */
	void exitChallenge(RegexGameParser.ChallengeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#solution}.
	 * @param ctx the parse tree
	 */
	void enterSolution(RegexGameParser.SolutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#solution}.
	 * @param ctx the parse tree
	 */
	void exitSolution(RegexGameParser.SolutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void enterDifficulty(RegexGameParser.DifficultyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#difficulty}.
	 * @param ctx the parse tree
	 */
	void exitDifficulty(RegexGameParser.DifficultyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(RegexGameParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(RegexGameParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#samples}.
	 * @param ctx the parse tree
	 */
	void enterSamples(RegexGameParser.SamplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#samples}.
	 * @param ctx the parse tree
	 */
	void exitSamples(RegexGameParser.SamplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#sampleItem}.
	 * @param ctx the parse tree
	 */
	void enterSampleItem(RegexGameParser.SampleItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#sampleItem}.
	 * @param ctx the parse tree
	 */
	void exitSampleItem(RegexGameParser.SampleItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(RegexGameParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(RegexGameParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#nonMatch}.
	 * @param ctx the parse tree
	 */
	void enterNonMatch(RegexGameParser.NonMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#nonMatch}.
	 * @param ctx the parse tree
	 */
	void exitNonMatch(RegexGameParser.NonMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(RegexGameParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(RegexGameParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegexGameParser#explanation}.
	 * @param ctx the parse tree
	 */
	void enterExplanation(RegexGameParser.ExplanationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegexGameParser#explanation}.
	 * @param ctx the parse tree
	 */
	void exitExplanation(RegexGameParser.ExplanationContext ctx);
}