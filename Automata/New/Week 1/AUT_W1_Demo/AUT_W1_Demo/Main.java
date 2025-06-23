import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends MyGrammarBaseListener
{
	@Override public void enterMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		// TODO: investigate contents of 'ctx'
		System.err.println("enterMyStart()");
	}
	
	@Override public void exitMyStart(MyGrammarParser.MyStartContext ctx) 
	{ 
		// TODO: investigate contents of 'ctx'
		System.err.println("exitMyStart()");
	}
	
	@Override public void visitTerminal(TerminalNode node) 
	{ 
		System.err.println("terminal-node: '" + node.getText() + "'");
		// TODO: print line+column, token's type, etc.
	}
	// TODO: override other methods of 'MyGrammarBaseListener'
}

public class Main 
{
    public static void main(String[] args) throws Exception 
	{
        CharStream input = CharStreams.fromStream(System.in);
		MyGrammarLexer lexer = new MyGrammarLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

		// TODO: print the lexer's vocabulary and the actual list of tokens 
		
        MyGrammarParser parser = new MyGrammarParser(tokens);

        ParseTree tree = parser.myStart();
		
		MyListener m = new MyListener();
		ParseTreeWalker.DEFAULT.walk(m, tree);
    }
}