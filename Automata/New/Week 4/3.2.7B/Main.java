import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

// State class to represent DFA states
class State {
    private String name;
    private boolean isAccepting;
    private Map<Character, State> transitions;

    public State(String name, boolean isAccepting) {
        this.name = name;
        this.isAccepting = isAccepting;
        this.transitions = new HashMap<>();
    }

    public void addTransition(char symbol, State target) {
        transitions.put(symbol, target);
    }

    public State getTransition(char symbol) {
        return transitions.get(symbol);
    }

    public String getName() {
        return name;
    }

    public boolean isAccepting() {
        return isAccepting;
    }
    
    public Map<Character, State> getTransitions() {
        return transitions;
    }
    
    @Override
    public String toString() {
        return name + (isAccepting ? " (accepting)" : "");
    }
}

// DFA class to represent the automaton
class DFA {
    private State startState;
    private Set<State> states;
    private Set<State> acceptingStates;
    private Set<Character> alphabet;
    private String description;

    public DFA(String description) {
        this.states = new HashSet<>();
        this.acceptingStates = new HashSet<>();
        this.alphabet = new HashSet<>();
        this.description = description;
    }

    public void setStartState(State state) {
        this.startState = state;
    }

    public void addState(State state) {
        states.add(state);
        if (state.isAccepting()) {
            acceptingStates.add(state);
        }
    }

    public void addSymbol(char symbol) {
        alphabet.add(symbol);
    }

    public boolean accepts(String input) {
        State currentState = startState;
        for (char c : input.toCharArray()) {
            currentState = currentState.getTransition(c);
            if (currentState == null) {
                return false;
            }
        }
        return currentState.isAccepting();
    }
    
    public String getDescription() {
        return description;
    }
    
    public State getStartState() {
        return startState;
    }
    
    public Set<State> getStates() {
        return states;
    }
    
    public Set<Character> getAlphabet() {
        return alphabet;
    }
    
    public void printDFA() {
        System.out.println("DFA for: " + description);
        System.out.println("States: " + states.size());
        for (State state : states) {
            System.out.println("  " + state);
            for (Map.Entry<Character, State> transition : state.getTransitions().entrySet()) {
                System.out.println("    " + transition.getKey() + " -> " + transition.getValue().getName());
            }
        }
        System.out.println("Start state: " + startState.getName());
        System.out.println("Accepting states: " + acceptingStates.size());
        for (State state : acceptingStates) {
            System.out.println("  " + state.getName());
        }
        System.out.println();
    }
}

// ProductState class for DFA intersection
class ProductState {
    private State state1;
    private State state2;
    
    public ProductState(State state1, State state2) {
        this.state1 = state1;
        this.state2 = state2;
    }
    
    public State getState1() {
        return state1;
    }
    
    public State getState2() {
        return state2;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProductState)) return false;
        ProductState other = (ProductState) obj;
        return state1.getName().equals(other.state1.getName()) && 
               state2.getName().equals(other.state2.getName());
    }
    
    @Override
    public int hashCode() {
        return state1.getName().hashCode() * 31 + state2.getName().hashCode();
    }
    
    @Override
    public String toString() {
        return "(" + state1.getName() + "," + state2.getName() + ")";
    }
}

class MyListener extends MyGrammarBaseListener {
    private DFA firstDfa;
    private DFA secondDfa;
    private DFA intersectionDfa;
    
    @Override 
    public void exitDfa(MyGrammarParser.DfaContext ctx) {
        // Create the first DFA for L(ab*a*)
        createFirstDFA();
        firstDfa.printDFA();
        
        // Create the second DFA for L((b)*ab)
        createSecondDFA();
        secondDfa.printDFA();
        
        // Create the intersection DFA
        createIntersectionDFA();
        intersectionDfa.printDFA();
        
        // Analyze the language of the intersection
        analyzeIntersectionLanguage();
    }
    
    private void createFirstDFA() {
        // DFA for L(ab*a*)
        firstDfa = new DFA("L(ab*a*)");
        
        // Create states
        State q0 = new State("q0", false);
        State q1 = new State("q1", true);  // After reading 'a'
        State q2 = new State("q2", true);  // After reading 'b's
        State q3 = new State("q3", true);  // After reading trailing 'a's
        
        // Add states to DFA
        firstDfa.addState(q0);
        firstDfa.addState(q1);
        firstDfa.addState(q2);
        firstDfa.addState(q3);
        
        // Set start state
        firstDfa.setStartState(q0);
        
        // Add transitions
        q0.addTransition('a', q1);
        q1.addTransition('b', q2);
        q1.addTransition('a', q3);
        q2.addTransition('b', q2);
        q2.addTransition('a', q3);
        q3.addTransition('a', q3);
        
        // Add symbols to alphabet
        firstDfa.addSymbol('a');
        firstDfa.addSymbol('b');
    }
    
    private void createSecondDFA() {
        // DFA for L((b)*ab)
        secondDfa = new DFA("L((b)*ab)");
        
        // Create states
        State p0 = new State("p0", false);
        State p1 = new State("p1", false);
        State p2 = new State("p2", true);
        
        // Add states to DFA
        secondDfa.addState(p0);
        secondDfa.addState(p1);
        secondDfa.addState(p2);
        
        // Set start state
        secondDfa.setStartState(p0);
        
        // Add transitions
        p0.addTransition('b', p0);
        p0.addTransition('a', p1);
        p1.addTransition('b', p2);
        
        // Add symbols to alphabet
        secondDfa.addSymbol('a');
        secondDfa.addSymbol('b');
    }
    
    private void createIntersectionDFA() {
        // Create the intersection DFA
        intersectionDfa = new DFA("L(ab*a*) ∩ L((b)*ab)");
        
        // Add symbols to alphabet
        intersectionDfa.addSymbol('a');
        intersectionDfa.addSymbol('b');
        
        // Create product state map and queue for BFS
        Map<ProductState, State> productStateMap = new HashMap<>();
        Queue<ProductState> queue = new LinkedList<>();
        
        // Create start state
        ProductState startProductState = new ProductState(
            firstDfa.getStartState(), 
            secondDfa.getStartState()
        );
        
        State startState = new State(
            "(" + firstDfa.getStartState().getName() + "," + 
            secondDfa.getStartState().getName() + ")",
            firstDfa.getStartState().isAccepting() && 
            secondDfa.getStartState().isAccepting()
        );
        
        productStateMap.put(startProductState, startState);
        queue.add(startProductState);
        intersectionDfa.addState(startState);
        intersectionDfa.setStartState(startState);
        
        // BFS to construct the product automaton
        while (!queue.isEmpty()) {
            ProductState currentProductState = queue.poll();
            State currentState = productStateMap.get(currentProductState);
            
            // For each symbol in the alphabet
            for (char symbol : intersectionDfa.getAlphabet()) {
                State nextState1 = currentProductState.getState1().getTransition(symbol);
                State nextState2 = currentProductState.getState2().getTransition(symbol);
                
                // If both states have transitions on this symbol
                if (nextState1 != null && nextState2 != null) {
                    ProductState nextProductState = new ProductState(nextState1, nextState2);
                    
                    // Create a new state if it doesn't exist
                    if (!productStateMap.containsKey(nextProductState)) {
                        State newState = new State(
                            "(" + nextState1.getName() + "," + nextState2.getName() + ")",
                            nextState1.isAccepting() && nextState2.isAccepting()
                        );
                        productStateMap.put(nextProductState, newState);
                        intersectionDfa.addState(newState);
                        queue.add(nextProductState);
                    }
                    
                    // Add the transition
                    currentState.addTransition(symbol, productStateMap.get(nextProductState));
                }
            }
        }
    }
    
    private void analyzeIntersectionLanguage() {
        System.out.println("Analysis of the Intersection Language L = L(ab*a*) ∩ L((b)*ab):");
        System.out.println("-------------------------------------------------------------");
        System.out.println("1. The language consists of strings that:");
        System.out.println("   - Start with 'a'");
        System.out.println("   - End with 'b'");
        System.out.println("   - Have the pattern 'ab' somewhere in the string");
        System.out.println();
        
        System.out.println("2. The simplest string in this language is: \"ab\"");
        System.out.println();
        
        System.out.println("3. Other examples of strings in the language:");
        System.out.println("   - \"abb\"   (matches ab*a* and b*ab)");
        System.out.println("   - \"abab\"  (matches ab*a* and b*ab)");
        System.out.println("   - \"aabb\"  (matches ab*a* and b*ab)");
        System.out.println();
        
        System.out.println("4. Formal description:");
        System.out.println("   The language can be described as: L = {ab(b|a)*b | n ≥ 0}");
        System.out.println("   This represents strings that start with 'a', end with 'b',");
        System.out.println("   and have at least one 'b' after the initial 'a'.");
        
        // Test some strings
        System.out.println("\nTesting some strings against the intersection DFA:");
        testString("ab", true);
        testString("a", false);
        testString("b", false);
        testString("abb", true);
        testString("abab", true);
        testString("aba", false);
        testString("bab", false);
        testString("aabb", true);
    }
    
    private void testString(String input, boolean expectedResult) {
        boolean result = intersectionDfa.accepts(input);
        System.out.println("  \"" + input + "\" - " + 
                          (result ? "Accepted" : "Rejected") + 
                          (result == expectedResult ? "" : " (Unexpected!)"));
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // If input file is provided, read from it
        CharStream input;
        if (args.length > 0) {
            input = CharStreams.fromFileName(args[0]);
        } else {
            // For testing, create a string with the language description
            input = CharStreams.fromString("L(ab*a*) ∩ L((b)*ab)");
        }
        
        MyGrammarLexer lexer = new MyGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyGrammarParser parser = new MyGrammarParser(tokens);
        
        ParseTree tree = parser.myStart();
        
        MyListener listener = new MyListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
    }
}