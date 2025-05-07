import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            // Check if a file path is provided
            if (args.length < 1) {
                System.err.println("Usage: java Main <file name>");
                System.exit(1);
            }

            // Setup to read input from file
            String inputFile = args[0];
            InputStream inputStream = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(inputStream, StandardCharsets.UTF_8);

            // Save the input expression for later use
            String expression = input.toString();

            // Create a lexer and parser for the input
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);

            // Parse the input to get the top-level tree
            ParseTree tree = parser.expr();

            // Create the listener and walk the parse tree
            ParseTreeWalker walker = new ParseTreeWalker();
            EvalListener listener = new EvalListener();
            walker.walk(listener, tree);

            // Print the equation and the result
            System.out.println(expression.trim() + " = " + listener.getValue(tree));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
