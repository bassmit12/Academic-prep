import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CalculatorMain {
    public static void main(String[] args) throws Exception {
        // Create input stream
        ANTLRInputStream input = new ANTLRInputStream("2 + 3 * 4");
        
        // Create lexer
        CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Create parser
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expr(); // Start from 'expr' rule
        
        // Print the parse tree
        System.out.println(tree.toStringTree(parser));
        
        // Create and run the evaluator
        EvalVisitor eval = new EvalVisitor();
        int result = eval.visit(tree);
        System.out.println("Result: " + result);
    }
}