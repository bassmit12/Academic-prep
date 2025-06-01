import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class SyntaxErrorListener extends BaseErrorListener {
    private boolean hasError = false;
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, 
                           int charPositionInLine, String msg, RecognitionException e) {
        hasError = true;
    }
    
    public boolean hasError() {
        return hasError;
    }
}

class MyListener extends MyGrammarBaseListener {
    @Override public void enterStart(MyGrammarParser.StartContext ctx) { 
        System.err.println("Parsing started");
    }
    
    @Override public void exitStart(MyGrammarParser.StartContext ctx) { 
        System.err.println("Parsing completed successfully");
    }
    
    @Override public void visitTerminal(TerminalNode node) { 
        // Only print non-whitespace terminals
        if (!node.getText().trim().isEmpty() && !node.getText().equals("<EOF>")) {
            System.err.println("Terminal: '" + node.getText() + "'");
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Testing the language {a^n b^m : (n + m) is odd}");
        System.out.println("---------------------------------------");
        
        // Generate and test some examples
        System.out.println("Examples of strings in the language:");
        List<String> validExamples = generateValidExamples(10);
        for (String example : validExamples) {
            System.out.println("  " + example + " (" + (example.length()) + " characters)");
        }
        
        System.out.println("\nValidating that the grammar accepts these strings:");
        for (String example : validExamples) {
            boolean isValid = testString(example);
            System.out.println("  " + example + ": " + (isValid ? "Valid" : "Invalid"));
        }
        
        System.out.println("\nValidating that the grammar rejects invalid strings:");
        List<String> invalidExamples = generateInvalidExamples();
        for (String example : invalidExamples) {
            boolean isValid = testString(example);
            System.out.println("  " + example + ": " + (isValid ? "Valid" : "Invalid"));
        }
        
        // Print the regular expression
        System.out.println("\nRegular expression for this language:");
        System.out.println("  a(aa)*(bb)* + (aa)*b(bb)*");
        System.out.println("Which means:");
        System.out.println("  - An odd number of a's followed by an even number of b's, OR");
        System.out.println("  - An even number of a's followed by an odd number of b's");
    }
    
    // Test if a string is accepted by our grammar
    private static boolean testString(String input) {
        try {
            CharStream charStream = CharStreams.fromString(input);
            MyGrammarLexer lexer = new MyGrammarLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MyGrammarParser parser = new MyGrammarParser(tokens);
            
            // Add custom error listener
            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            
            // Parse the input
            parser.start();
            
            // Return true only if no syntax errors were detected
            return !errorListener.hasError();
        } catch (Exception e) {
            return false;
        }
    }
    
    // Generate valid examples for the language
    private static List<String> generateValidExamples(int count) {
        List<String> examples = new ArrayList<>();
        
        // Case 1: Odd number of a's followed by even number of b's
        for (int n = 1; n <= 5; n += 2) {  // Odd number of a's
            for (int m = 0; m <= 4; m += 2) {  // Even number of b's
                if (examples.size() >= count) break;
                examples.add(repeat('a', n) + repeat('b', m));
            }
        }
        
        // Case 2: Even number of a's followed by odd number of b's
        for (int n = 0; n <= 4; n += 2) {  // Even number of a's
            for (int m = 1; m <= 5; m += 2) {  // Odd number of b's
                if (examples.size() >= count) break;
                examples.add(repeat('a', n) + repeat('b', m));
            }
        }
        
        return examples;
    }
    
    // Generate some invalid examples
    private static List<String> generateInvalidExamples() {
        List<String> examples = new ArrayList<>();
        
        // Strings with even total length
        examples.add("aa");     // Even a's, even b's (0)
        examples.add("aabb");   // Even a's, even b's
        examples.add("aaabbb"); // Odd a's, odd b's
        examples.add("abab");   // Not in the right format (a's then b's)
        examples.add("ba");     // Not in the right format (b's then a's)
        examples.add("");       // Empty string (even length)
        
        return examples;
    }
    
    // Helper to repeat a character n times
    private static String repeat(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}