# Automata Theory Comprehensive Cheatsheet

## Table of Contents
1. [Introduction & Overview](#introduction--overview)
2. [ANTLR Basics](#antlr-basics)
3. [Listeners Pattern](#listeners-pattern)
4. [Visitor Pattern](#visitor-pattern)
5. [Regular Languages & Expressions](#regular-languages--expressions)
6. [Context-Free Languages & Grammars](#context-free-languages--grammars)
7. [Finite State Machines](#finite-state-machines)
8. [Parsing Techniques](#parsing-techniques)
9. [Common Algorithms](#common-algorithms)
10. [Exam Tips & Tricks](#exam-tips--tricks)

---

## Introduction & Overview

### Key Concepts
- **Automata Theory**: Study of abstract machines and computational problems
- **Formal Languages**: Sets of strings defined by specific rules
- **Computational Models**: Different ways to describe computation

### Hierarchy of Languages
```
Regular Languages ⊆ Context-Free Languages ⊆ Context-Sensitive Languages ⊆ Recursively Enumerable Languages
```

### Machine Types
- **Finite Automata (FA)** → Regular Languages
- **Pushdown Automata (PDA)** → Context-Free Languages  
- **Turing Machines (TM)** → Recursively Enumerable Languages

---

## ANTLR Basics

### What is ANTLR?
- **ANother Tool for Language Recognition**
- Parser generator that creates parsers from grammar files
- Generates code in multiple languages (Java, Python, C#, etc.)

### Grammar File Structure (.g4)
```antlr
grammar ExampleGrammar;

// Parser rules (lowercase)
program: statement+;
statement: assignment | expression;
assignment: ID '=' expression ';';
expression: term (('+' | '-') term)*;
term: factor (('*' | '/') factor)*;
factor: ID | NUMBER | '(' expression ')';

// Lexer rules (UPPERCASE)
ID: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
```

### Key Grammar Elements
- **Parser Rules**: Define syntax structure (lowercase names)
- **Lexer Rules**: Define tokens (UPPERCASE names)
- **Alternatives**: Use `|` to separate options
- **Quantifiers**: `*` (zero or more), `+` (one or more), `?` (optional)
- **Labels**: `expr=expression` for accessing in code

### ANTLR Workflow
1. Write grammar file (.g4)
2. Generate parser code: `antlr4 Grammar.g4`
3. Compile generated code
4. Use parser with Listener or Visitor pattern

---

## Listeners Pattern

### Overview
- **Event-driven** approach to tree traversal
- ANTLR automatically calls methods during tree walk
- **Push-based**: You receive events, don't control traversal

### Listener Interface
```java
public interface ExampleGrammarBaseListener extends ParseTreeListener {
    void enterProgram(ExampleGrammarParser.ProgramContext ctx);
    void exitProgram(ExampleGrammarParser.ProgramContext ctx);
    void enterExpression(ExampleGrammarParser.ExpressionContext ctx);
    void exitExpression(ExampleGrammarParser.ExpressionContext ctx);
    // ... other methods
}
```

### Implementation Example
```java
public class MyListener extends ExampleGrammarBaseListener {
    @Override
    public void enterExpression(ExampleGrammarParser.ExpressionContext ctx) {
        System.out.println("Entering expression: " + ctx.getText());
    }
    
    @Override
    public void exitExpression(ExampleGrammarParser.ExpressionContext ctx) {
        System.out.println("Exiting expression: " + ctx.getText());
    }
}
```

### Usage
```java
ParseTreeWalker walker = new ParseTreeWalker();
MyListener listener = new MyListener();
walker.walk(listener, parseTree);
```

### When to Use Listeners
- ✅ Simple tree processing
- ✅ Event-driven logic
- ✅ Side effects (printing, logging)
- ❌ Complex computations requiring return values

---

## Visitor Pattern

### Overview
- **Pull-based** approach to tree traversal
- You control the traversal order
- Can return values from visits

### Visitor Interface
```java
public interface ExampleGrammarVisitor<T> extends ParseTreeVisitor<T> {
    T visitProgram(ExampleGrammarParser.ProgramContext ctx);
    T visitExpression(ExampleGrammarParser.ExpressionContext ctx);
    // ... other methods
}
```

### Implementation Example
```java
public class CalculatorVisitor extends ExampleGrammarBaseVisitor<Integer> {
    @Override
    public Integer visitExpression(ExampleGrammarParser.ExpressionContext ctx) {
        int result = visit(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            if (ctx.getChild(2*i-1).getText().equals("+")) {
                result += visit(ctx.term(i));
            } else {
                result -= visit(ctx.term(i));
            }
        }
        return result;
    }
}
```

### Usage
```java
CalculatorVisitor visitor = new CalculatorVisitor();
Integer result = visitor.visit(parseTree);
```

### When to Use Visitors
- ✅ Need return values
- ✅ Complex computations
- ✅ Control traversal order
- ✅ Building new data structures

---

## Regular Languages & Expressions

### Definition
- **Regular Language**: Language that can be recognized by a finite automaton
- **Regular Expression**: Notation for describing regular languages

### Regular Expression Syntax
| Symbol | Meaning | Example |
|--------|---------|---------|
| `a` | Literal character | `a` matches "a" |
| `∅` | Empty set | Matches nothing |
| `ε` | Empty string | Matches empty string |
| `|` | Union (OR) | `a|b` matches "a" or "b" |
| `*` | Kleene star (0 or more) | `a*` matches "", "a", "aa", ... |
| `+` | One or more | `a+` matches "a", "aa", "aaa", ... |
| `?` | Optional (0 or 1) | `a?` matches "" or "a" |
| `.` | Any character | `.` matches any single character |
| `[]` | Character class | `[abc]` matches "a", "b", or "c" |
| `[^]` | Negated class | `[^abc]` matches any char except a,b,c |

### Common Regular Expressions
```regex
Email: [a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}
Phone: \d{3}-\d{3}-\d{4}
Integer: -?[0-9]+
Identifier: [a-zA-Z_][a-zA-Z0-9_]*
```

### Properties of Regular Languages
- **Closed under**: Union, Intersection, Complement, Concatenation, Kleene Star
- **Pumping Lemma**: If L is regular and |w| ≥ p, then w = xyz where |xy| ≤ p, |y| > 0, and xy^i z ∈ L for all i ≥ 0

---

## Context-Free Languages & Grammars

### Context-Free Grammar (CFG)
A CFG is a 4-tuple G = (V, Σ, R, S) where:
- **V**: Set of variables (non-terminals)
- **Σ**: Set of terminals
- **R**: Set of production rules
- **S**: Start symbol

### Production Rules
```
S → aSb
S → ε
```

### Example: Balanced Parentheses
```
S → (S)
S → SS  
S → ε
```

### Parse Trees
- **Root**: Start symbol
- **Internal nodes**: Non-terminals
- **Leaves**: Terminals
- **Yield**: String formed by reading leaves left-to-right

### Ambiguity
- Grammar is **ambiguous** if some string has multiple parse trees
- Example ambiguous grammar:
```
E → E + E
E → E * E  
E → id
```

### Chomsky Normal Form (CNF)
All productions are of the form:
- A → BC (two non-terminals)
- A → a (single terminal)

### Greibach Normal Form (GNF)
All productions are of the form:
- A → aα (terminal followed by zero or more non-terminals)

---

## Finite State Machines

### Deterministic Finite Automaton (DFA)
A DFA is a 5-tuple M = (Q, Σ, δ, q₀, F) where:
- **Q**: Finite set of states
- **Σ**: Input alphabet
- **δ**: Transition function Q × Σ → Q
- **q₀**: Start state
- **F**: Set of accepting states

### Non-deterministic Finite Automaton (NFA)
- Multiple transitions possible from one state on same input
- ε-transitions allowed
- δ: Q × (Σ ∪ {ε}) → P(Q)

### NFA to DFA Conversion (Subset Construction)
1. Start with {q₀}
2. For each subset S and symbol a, compute δ(S,a) = ∪{δ(q,a) | q ∈ S}
3. Include ε-closures
4. Continue until no new states

### Minimization Algorithm
1. Remove unreachable states
2. Create equivalence classes of indistinguishable states
3. Merge equivalent states

---

## Parsing Techniques

### Top-Down Parsing
- **Recursive Descent**: Hand-written parsers
- **LL(k)**: Left-to-right, Leftmost derivation, k lookahead
- **Predictive Parsing**: Uses FIRST and FOLLOW sets

### Bottom-Up Parsing
- **LR(k)**: Left-to-right, Rightmost derivation, k lookahead
- **SLR**: Simple LR
- **LALR**: Look-Ahead LR
- **CLR**: Canonical LR

### FIRST and FOLLOW Sets
- **FIRST(α)**: Set of terminals that begin strings derivable from α
- **FOLLOW(A)**: Set of terminals that can appear immediately after A

### Shift-Reduce Parsing
- **Shift**: Move input symbol to stack
- **Reduce**: Replace symbols on stack with LHS of production
- **Conflicts**: Shift/reduce or reduce/reduce

---

## Common Algorithms

### Thompson's Construction (Regex → NFA)
1. Base cases: ε, ∅, a
2. Union: Add new start state with ε-transitions
3. Concatenation: Connect end of first to start of second
4. Kleene star: Add ε-transitions for loops

### Pumping Lemma for Regular Languages
For any regular language L, ∃ p ≥ 1 such that:
∀ string w ∈ L with |w| ≥ p, ∃ decomposition w = xyz where:
- |xy| ≤ p
- |y| > 0  
- ∀ i ≥ 0: xy^i z ∈ L

### CYK Algorithm (CFG Recognition)
- Works with CNF grammars
- Dynamic programming approach
- O(n³|G|) time complexity

### Earley Algorithm
- Handles any CFG (including ambiguous)
- O(n³) worst case, O(n) for unambiguous grammars
- Uses prediction, scanning, and completion

---

## Exam Tips & Tricks

### Quick Recognition Patterns

#### Regular vs Context-Free
- **Regular**: {a^n b^n | n ≥ 0} is NOT regular (use pumping lemma)
- **Context-Free**: {a^n b^n | n ≥ 0} IS context-free
- **Not Context-Free**: {a^n b^n c^n | n ≥ 0}

#### Grammar Analysis
1. **Check ambiguity**: Look for multiple derivations
2. **Left recursion**: A → Aα (problematic for top-down)
3. **Left factoring**: A → αβ | αγ → A → α(β|γ)

### Common Mistakes to Avoid
- Confusing DFA and NFA properties
- Forgetting ε-transitions in NFAs
- Mixing up FIRST and FOLLOW sets
- Not considering empty string in derivations
- Confusing visitor and listener patterns in ANTLR

### Problem-Solving Strategies
1. **State diagrams**: Draw for small examples
2. **Parse trees**: Trace through derivations
3. **Regular expressions**: Build incrementally
4. **Pumping lemma**: Choose the right decomposition

### ANTLR Debugging
- Use ANTLR's built-in tree viewer
- Add print statements in listeners/visitors
- Check for left recursion in grammar
- Verify token definitions don't overlap

### Time Management
- **Multiple choice**: 2-3 minutes per question
- **Construction problems**: Show all steps
- **Proofs**: State assumptions clearly
- **Code**: Comment your approach

---

## Quick Reference Cards

### Grammar Notation
| Notation | Meaning |
|----------|---------|
| → | Production rule |
| | | Alternative |
| * | Zero or more |
| + | One or more |
| ? | Optional |
| ε | Empty string |
| ∅ | Empty set |

### ANTLR Action Types
| Pattern | Use Case |
|---------|----------|
| Listener | Event-driven processing |
| Visitor | Return values needed |
| Direct access | Simple attribute extraction |

### Complexity Cheat Sheet
| Algorithm | Time | Space |
|-----------|------|-------|
| DFA simulation | O(n) | O(1) |
| NFA simulation | O(n·2^m) | O(2^m) |
| Regex to NFA | O(m) | O(m) |
| NFA to DFA | O(2^m) | O(2^m) |
| CYK parsing | O(n³) | O(n²) |

---

*Good luck on your exam! Remember to practice with concrete examples and always verify your solutions with small test cases.*
