import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Main <inputfile>");
            return;
        }

        try {
            String inputFile = args[0];
            CharStream input = CharStreams.fromFileName(inputFile);

            CalculatorLexer lexer = new CalculatorLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CalculatorParser parser = new CalculatorParser(tokens);

            ParseTree tree = parser.prog();  // Start parsing at the 'prog' rule

            EvalVisitor eval = new EvalVisitor();
            eval.visit(tree);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
