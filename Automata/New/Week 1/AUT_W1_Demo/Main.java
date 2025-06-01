import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends MyGrammarBaseListener
{
	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		System.err.println("enterMyStart()");
	}
	
	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		System.err.println("exitMyStart()");
	}
	
	@Override public void enterGreeting(MyGrammarParser.GreetingContext ctx) 
	{ 
		System.err.println("Greeting detected!");
	}
	
	@Override public void enterGoodbye(MyGrammarParser.GoodbyeContext ctx) 
	{ 
		System.err.println("Goodbye detected!");
	}
	
	@Override public void enterPersonInfo(MyGrammarParser.PersonInfoContext ctx) 
	{ 
		if (ctx.nameAge() != null) {
			System.err.println("Format detected: Name and Age");
		} else if (ctx.fullName() != null) {
			System.err.println("Format detected: First Name and Last Name");
		} else if (ctx.namePhone() != null) {
			System.err.println("Format detected: Name and Phone");
		} else if (ctx.fullNamePhone() != null) {
			System.err.println("Format detected: First Name, Last Name and Phone");
		}
	}
	
	@Override public void visitTerminal(TerminalNode node) 
	{ 
		System.err.println("terminal-node: '" + node.getText() + "'");
		// Terminal node details
		Token token = node.getSymbol();
		if (token != null) {
			System.err.println("  Line: " + token.getLine() + 
				", Column: " + token.getCharPositionInLine() +
				", Type: " + MyGrammarLexer.VOCABULARY.getDisplayName(token.getType()));
		}
	}
}

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
		// Handle file input if provided as argument, otherwise use stdin
		CharStream input;
		if (args.length > 0) {
			input = CharStreams.fromFileName(args[0]);
		} else {
			input = CharStreams.fromStream(System.in);
		}
		
		// Create lexer
		MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// Print lexer vocabulary and tokens
		System.err.println("=== TOKENS ===");
		tokens.fill();
		for (Token token : tokens.getTokens()) {
			System.err.println(token.getLine() + ":" + token.getCharPositionInLine() + " " + 
				MyGrammarLexer.VOCABULARY.getDisplayName(token.getType()) + " '" + token.getText() + "'");
		}
		System.err.println("=============");
		
		// Reset tokens for parsing
		tokens.seek(0);
		
		// Create parser and parse
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.myStart();
		
		// Walk the parse tree with our listener
		System.err.println("\n=== LISTENER OUTPUT ===");
		MyListener m = new MyListener();
		ParseTreeWalker.DEFAULT.walk(m, tree);
		System.err.println("======================");
    }
}