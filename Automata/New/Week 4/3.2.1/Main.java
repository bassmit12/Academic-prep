import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends MyGrammarBaseListener
{
	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		System.err.println("enterMyStart() - Beginning NFA processing");
	}
	
	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		System.err.println("exitMyStart() - NFA processing complete");
	}
	
	@Override public void enterExpr(MyGrammarParser.ExprContext ctx) 
	{
		System.err.println("Processing expression: " + ctx.getText());
	}
	
	@Override public void enterAbMiddleEnd(MyGrammarParser.AbMiddleEndContext ctx) 
	{
		System.err.println("Processing ab(a+ab)*(a+aa) pattern: " + ctx.getText());
	}
	
	@Override public void enterMiddle(MyGrammarParser.MiddleContext ctx) 
	{
		System.err.println("Processing middle part (a+ab)*: " + ctx.getText());
	}
	
	@Override public void visitTerminal(TerminalNode node) 
	{ 
		System.err.println("Terminal: '" + node.getText() + 
			"', Token type: " + node.getSymbol().getType() + 
			", Line: " + node.getSymbol().getLine() + 
			", Column: " + node.getSymbol().getCharPositionInLine());
	}
}

// This class implements a DFA for the language L(ab(a+ab)*(a+aa))
class SimpleNFA {
	// States in our DFA
	private static final int START_STATE = 0;      // Initial state
	private static final int AFTER_A = 1;          // After seeing 'a' at the start
	private static final int AFTER_AB = 2;         // After seeing 'ab' at the start
	private static final int MIDDLE_STATE = 3;     // In the middle section (a+ab)*
	private static final int AFTER_MIDDLE_A = 4;   // After seeing 'a' after the middle section
	private static final int FINAL_STATE = 5;      // Final accepting state
	
	private int currentState;
	
	public SimpleNFA() {
		currentState = START_STATE;
	}
	
	// Process a character through the DFA
	public void processChar(char c) {
		switch(currentState) {
			case START_STATE:
				if (c == 'a') {
					currentState = AFTER_A;
					System.err.println("NFA: q0 --a--> q1");
				} else {
					// Invalid input
					currentState = -1;
					System.err.println("NFA: Invalid input '" + c + "' in start state");
				}
				break;
				
			case AFTER_A:
				if (c == 'b') {
					currentState = AFTER_AB;
					System.err.println("NFA: q1 --b--> q2");
				} else {
					// Invalid input
					currentState = -1;
					System.err.println("NFA: Invalid input '" + c + "' in AFTER_A state");
				}
				break;
				
			case AFTER_AB:
				if (c == 'a') {
					// We can either go to MIDDLE_STATE (for (a+ab)*) or directly to AFTER_MIDDLE_A (for (a+aa))
					currentState = MIDDLE_STATE;
					System.err.println("NFA: q2 --a--> q3");
				} else {
					// Invalid input
					currentState = -1;
					System.err.println("NFA: Invalid input '" + c + "' in AFTER_AB state");
				}
				break;
				
			case MIDDLE_STATE:
				if (c == 'a') {
					// On 'a', we can either stay in MIDDLE_STATE (for (a+ab)*) or go to AFTER_MIDDLE_A (for (a+aa))
					currentState = AFTER_MIDDLE_A;
					System.err.println("NFA: q3 --a--> q4");
				} else if (c == 'b') {
					// On 'b', after seeing 'a' in MIDDLE_STATE, we stay in MIDDLE_STATE
					currentState = MIDDLE_STATE;
					System.err.println("NFA: q3 --b--> q3");
				} else {
					// Invalid input
					currentState = -1;
					System.err.println("NFA: Invalid input '" + c + "' in MIDDLE_STATE state");
				}
				break;
				
			case AFTER_MIDDLE_A:
				if (c == 'a') {
					// If we see another 'a', this could be the 'aa' ending
					currentState = FINAL_STATE;
					System.err.println("NFA: q4 --a--> q5 (accepting)");
				} else if (c == 'b') {
					// If we see 'b', this is part of 'ab' in the middle section
					currentState = MIDDLE_STATE;
					System.err.println("NFA: q4 --b--> q3");
				} else {
					// Invalid input
					currentState = -1;
					System.err.println("NFA: Invalid input '" + c + "' in AFTER_MIDDLE_A state");
				}
				break;
				
			case FINAL_STATE:
				// Any input after reaching the final state makes the input invalid
				currentState = -1;
				System.err.println("NFA: Input after final state is not accepted");
				break;
				
			default:
				// Invalid state
				currentState = -1;
				System.err.println("NFA: In invalid state");
				break;
		}
	}
	
	// Check if the DFA is in an accepting state
	public boolean isAccepting() {
		// The input is accepted if we're in AFTER_MIDDLE_A state (ending with 'a') 
		// or in FINAL_STATE (ending with 'aa')
		return currentState == AFTER_MIDDLE_A || currentState == FINAL_STATE;
	}
	
	// Reset the DFA to its initial state
	public void reset() {
		currentState = START_STATE;
	}
}

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
        CharStream input = CharStreams.fromStream(System.in);
		MyGrammarLexer lexer = new MyGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		System.err.println("Lexer vocabulary:");
		for (int i = 0; i < lexer.getVocabulary().getMaxTokenType(); i++) {
			String literalName = lexer.getVocabulary().getLiteralName(i);
			String symbolicName = lexer.getVocabulary().getSymbolicName(i);
			if (literalName != null || symbolicName != null) {
				System.err.println(i + ": " + literalName + " (" + symbolicName + ")");
			}
		}
		
		System.err.println("\nTokens from input:");
		tokens.fill();
		for (Token token : tokens.getTokens()) {
			if (token.getChannel() == Token.DEFAULT_CHANNEL && token.getType() != Token.EOF) {
				System.err.println(token.getText() + 
					" (type=" + lexer.getVocabulary().getSymbolicName(token.getType()) + 
					", line=" + token.getLine() + 
					", pos=" + token.getCharPositionInLine() + ")");
			}
		}
		tokens.seek(0);
		
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.myStart();
		
		MyListener listener = new MyListener();
		ParseTreeWalker.DEFAULT.walk(listener, tree);
		
		// Demonstrate the DFA directly
		System.err.println("\nNFA Simulation:");
		String inputText = tokens.getTokenSource().getInputStream().toString();
		System.err.println("Processing input: " + inputText);
		
		SimpleNFA nfa = new SimpleNFA();
		for (char c : inputText.toCharArray()) {
			if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
				nfa.processChar(c);
			}
		}
		
		System.err.println("NFA Acceptance: " + nfa.isAccepting());
		
		// Report whether the input matches the language L(ab(a+ab)*(a+aa))
		if (nfa.isAccepting()) {
			System.out.println("Input accepted: Matches the language L(ab(a+ab)*(a+aa))");
		} else {
			System.out.println("Input rejected: Does not match the language L(ab(a+ab)*(a+aa))");
		}
    }
}