import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

class MyListener extends MyGrammarBaseListener {
    private boolean inAbbRepetition = false;
    private boolean inAStarbbStar = false;

    @Override
    public void enterMyStart(MyGrammarParser.MyStartContext ctx) {
        System.out.println("Parsing input file...");
    }

    @Override
    public void exitMyStart(MyGrammarParser.MyStartContext ctx) {
        System.out.println("Parsing complete");
    }

    @Override
    public void enterValidInput(MyGrammarParser.ValidInputContext ctx) {
        System.out.println("\nValid input found: \"" + ctx.getText().replace("\r", "").replace("\n", "") + "\"");
        
        // Determine which rule matched the input
        if (ctx.abbRepetition() != null) {
            System.out.println("String matched L(abb)* pattern");
        }
        
        if (ctx.aStarbbStar() != null) {
            System.out.println("String matched L(a*bb*) pattern");
        }
    }

    @Override
    public void enterInvalidInput(MyGrammarParser.InvalidInputContext ctx) {
        System.out.println("\nSkipping invalid input: \"" + ctx.getText().replace("\r", "").replace("\n", "") + "\"");
    }

    @Override
    public void enterAbbRepetition(MyGrammarParser.AbbRepetitionContext ctx) {
        inAbbRepetition = true;
        if (!ctx.getText().isEmpty()) {
            System.out.println("Found abbRepetition: " + ctx.getText());
            // Count the number of "abb" occurrences
            int abbCount = ctx.getText().length() / 3; // Each "abb" is 3 characters
            System.out.println("  Number of 'abb' sequences: " + abbCount);
        }
    }

    @Override
    public void exitAbbRepetition(MyGrammarParser.AbbRepetitionContext ctx) {
        inAbbRepetition = false;
    }

    @Override
    public void enterAStarbbStar(MyGrammarParser.AStarbbStarContext ctx) {
        inAStarbbStar = true;
        if (!ctx.getText().isEmpty()) {
            System.out.println("Found aStarbbStar: " + ctx.getText());
            System.out.println("  Number of a's: " + ctx.A().size());
            System.out.println("  Number of b's: " + ctx.B().size());
        }
    }

    @Override
    public void exitAStarbbStar(MyGrammarParser.AStarbbStarContext ctx) {
        inAStarbbStar = false;
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        String ruleName = "";
        if (inAbbRepetition) {
            ruleName = "abbRepetition";
        } else if (inAStarbbStar) {
            ruleName = "aStarbbStar";
        }
        
        if (!node.getText().isEmpty() && !node.getText().equals("<EOF>") && 
            !node.getText().equals("\n") && !node.getText().equals("\r\n")) {
            System.out.println("Terminal: '" + node.getText() + "' in rule: " + ruleName);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            // Read from file if specified
            CharStream input = CharStreams.fromFileName(args[0]);
            processInput(input);
        } else {
            // Read from stdin if no file specified
            CharStream input = CharStreams.fromStream(System.in);
            processInput(input);
        }
    }
    
    private static void processInput(CharStream input) throws Exception {
        MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Print lexer information
        System.out.println("Tokens recognized:");
        tokens.fill();
        for (Token token : tokens.getTokens()) {
            if (token.getType() != Token.EOF) {
                System.out.println("  " + token.getText().replace("\n", "\\n").replace("\r", "\\r") + 
                                  " (Type: " + lexer.getVocabulary().getSymbolicName(token.getType()) + 
                                  ", Line: " + token.getLine() + 
                                  ", Position: " + token.getCharPositionInLine() + ")");
            }
        }
        tokens.seek(0); // Reset token stream
        
        // Parse the input
        MyGrammarParser parser = new MyGrammarParser(tokens);
        parser.removeErrorListeners(); // Remove default console error listener
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                System.out.println("Parse error at line " + line + ":" + charPositionInLine + " - " + msg);
            }
        });
        
        ParseTree tree = parser.myStart();
        
        // Walk the parse tree with our listener
        System.out.println("\nWalking the parse tree:");
        MyListener listener = new MyListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        
        // Print parse tree as string
        System.out.println("\nParse Tree (as string):");
        System.out.println(tree.toStringTree(parser));
        
        // Explain DFA for each pattern
        System.out.println("\nMinimal DFA explanation:");
        System.out.println("1. For L(abb)*:");
        System.out.println("   - This requires recognizing 'abb' repeated 0 or more times");
        System.out.println("   - States: q0 (start/accept), q1, q2, q3");
        System.out.println("   - Transitions:");
        System.out.println("     * q0 -'a'-> q1");
        System.out.println("     * q1 -'b'-> q2");
        System.out.println("     * q2 -'b'-> q3 (q3 is also an accept state)");
        System.out.println("     * q3 -'a'-> q1 (to continue the pattern)");
        
        System.out.println("\n2. For L(a*bb*):");
        System.out.println("   - This requires recognizing zero or more 'a's followed by at least one 'b', followed by zero or more 'b's");
        System.out.println("   - States: q0 (start), q1 (accept)");
        System.out.println("   - Transitions:");
        System.out.println("     * q0 -'a'-> q0 (loop on 'a')");
        System.out.println("     * q0 -'b'-> q1");
        System.out.println("     * q1 -'b'-> q1 (loop on 'b')");
        
        System.out.println("\n3. For the union L(abb)* ∪ L(a*bb*):");
        System.out.println("   - Combine both DFAs with a new start state having epsilon transitions to both start states");
        System.out.println("   - This results in a minimal DFA with proper state merging");
    }
}