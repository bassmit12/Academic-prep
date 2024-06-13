import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

class MyListener extends PersonalInfoBaseListener {
    @Override public void enterDocument(PersonalInfoParser.DocumentContext ctx) {
        System.err.println("enterDocument()");
    }

    @Override public void exitDocument(PersonalInfoParser.DocumentContext ctx) {
        System.err.println("exitDocument()");
    }

    @Override public void visitTerminal(TerminalNode node) {
        System.err.println("terminal-node: '" + node.getText() + "'");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromStream(System.in);
        PersonalInfoLexer lexer = new PersonalInfoLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Print the lexer's vocabulary and the actual list of tokens
        tokens.fill();
        for (Token token : tokens.getTokens()) {
            System.out.println("Token: " + lexer.getVocabulary().getSymbolicName(token.getType()) + " (" + token.getText() + ")");
        }

        PersonalInfoParser parser = new PersonalInfoParser(tokens);

        ParseTree tree = parser.document();

        MyListener m = new MyListener();
        ParseTreeWalker.DEFAULT.walk(m, tree);

        // Print the parse tree (for debugging)
        System.out.println(tree.toStringTree(parser));
    }
}
