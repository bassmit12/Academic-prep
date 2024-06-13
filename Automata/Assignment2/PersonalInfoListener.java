// Generated from .\PersonalInfo.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PersonalInfoParser}.
 */
public interface PersonalInfoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(PersonalInfoParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(PersonalInfoParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(PersonalInfoParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(PersonalInfoParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#nameAndLastName}.
	 * @param ctx the parse tree
	 */
	void enterNameAndLastName(PersonalInfoParser.NameAndLastNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#nameAndLastName}.
	 * @param ctx the parse tree
	 */
	void exitNameAndLastName(PersonalInfoParser.NameAndLastNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#nameWithAge}.
	 * @param ctx the parse tree
	 */
	void enterNameWithAge(PersonalInfoParser.NameWithAgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#nameWithAge}.
	 * @param ctx the parse tree
	 */
	void exitNameWithAge(PersonalInfoParser.NameWithAgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#telephoneNumber}.
	 * @param ctx the parse tree
	 */
	void enterTelephoneNumber(PersonalInfoParser.TelephoneNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#telephoneNumber}.
	 * @param ctx the parse tree
	 */
	void exitTelephoneNumber(PersonalInfoParser.TelephoneNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#firstName}.
	 * @param ctx the parse tree
	 */
	void enterFirstName(PersonalInfoParser.FirstNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#firstName}.
	 * @param ctx the parse tree
	 */
	void exitFirstName(PersonalInfoParser.FirstNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#lastName}.
	 * @param ctx the parse tree
	 */
	void enterLastName(PersonalInfoParser.LastNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#lastName}.
	 * @param ctx the parse tree
	 */
	void exitLastName(PersonalInfoParser.LastNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(PersonalInfoParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(PersonalInfoParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#age}.
	 * @param ctx the parse tree
	 */
	void enterAge(PersonalInfoParser.AgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#age}.
	 * @param ctx the parse tree
	 */
	void exitAge(PersonalInfoParser.AgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PersonalInfoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PersonalInfoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PersonalInfoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PersonalInfoParser.NumberContext ctx);
}