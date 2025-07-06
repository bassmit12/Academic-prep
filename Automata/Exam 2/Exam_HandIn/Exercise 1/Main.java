import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends ExamGrammarBaseListener
{
	@Override public void enterProg(ExamGrammarParser.ProgContext ctx) 
	{ 
		// TODO: investigate contents of 'ctx'
		System.err.println("enterProg()");
	}
	
	@Override public void exitProg(ExamGrammarParser.ProgContext ctx) 
	{ 
		// TODO: investigate contents of 'ctx'
		System.err.println("exitProg()");
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
        // Create input stream
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        
        // Create lexer
        ExamGrammarLexer lexer = new ExamGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Create parser
        ExamGrammarParser parser = new ExamGrammarParser(tokens);
        ParseTree tree = parser.prog(); // Start parsing from 'prog' rule
        
        // Option 2: Use Visitor (updated to build binary tree)
        System.out.println("\n=== Using Updated Visitor ===");
        MyVisitor visitor = new MyVisitor();
        TreeNode resultTree = visitor.visit(tree);
        
        if (resultTree != null) {
            System.out.println("Evaluated result: " + resultTree.getValue());
            System.out.println("Tree structure:");
            resultTree.printTree("", true);
        }
        
        
    }
}