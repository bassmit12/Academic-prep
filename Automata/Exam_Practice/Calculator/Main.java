import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter expressions or assignments (e.g., '1+2', 'x=5', 'print x*2').");
        System.out.println("Press Ctrl+Z (on Windows) or Ctrl+D (on Unix) to finish.");

        CharStream input = CharStreams.fromStream(System.in);
        MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.prog();

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}