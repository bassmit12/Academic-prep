# output

D:\AP\Academic-prep\Automata\New\Week 4\3.2.8>run
Tokens recognized:
a (Type: A, Line: 1, Position: 0)
b (Type: B, Line: 1, Position: 1)
b (Type: B, Line: 1, Position: 2)
\r\n (Type: NEWLINE, Line: 1, Position: 3)
a (Type: A, Line: 2, Position: 0)
b (Type: B, Line: 2, Position: 1)
b (Type: B, Line: 2, Position: 2)
a (Type: A, Line: 2, Position: 3)
b (Type: B, Line: 2, Position: 4)
b (Type: B, Line: 2, Position: 5)
\r\n (Type: NEWLINE, Line: 2, Position: 6)
a (Type: A, Line: 3, Position: 0)
b (Type: B, Line: 3, Position: 1)
b (Type: B, Line: 3, Position: 2)
a (Type: A, Line: 3, Position: 3)
b (Type: B, Line: 3, Position: 4)
b (Type: B, Line: 3, Position: 5)
a (Type: A, Line: 3, Position: 6)
b (Type: B, Line: 3, Position: 7)
b (Type: B, Line: 3, Position: 8)
\r\n (Type: NEWLINE, Line: 3, Position: 9)
\r\n (Type: NEWLINE, Line: 4, Position: 0)
a (Type: A, Line: 5, Position: 0)
a (Type: A, Line: 5, Position: 1)
b (Type: B, Line: 5, Position: 2)
b (Type: B, Line: 5, Position: 3)
\r\n (Type: NEWLINE, Line: 5, Position: 4)
a (Type: A, Line: 6, Position: 0)
b (Type: B, Line: 6, Position: 1)
\r\n (Type: NEWLINE, Line: 6, Position: 2)
a (Type: A, Line: 7, Position: 0)
a (Type: A, Line: 7, Position: 1)
a (Type: A, Line: 7, Position: 2)
b (Type: B, Line: 7, Position: 3)
b (Type: B, Line: 7, Position: 4)
b (Type: B, Line: 7, Position: 5)
\r\n (Type: NEWLINE, Line: 7, Position: 6)
b (Type: B, Line: 8, Position: 0)
b (Type: B, Line: 8, Position: 1)
b (Type: B, Line: 8, Position: 2)
b (Type: B, Line: 8, Position: 3)
Parse error at line 4:0 - extraneous input '\r\n' expecting {<EOF>, 'a', 'b', WS}

Walking the parse tree:
Parsing input file...

Valid input found: "abb"
String matched L(abb)\* pattern
Found abbRepetition: abb
Number of 'abb' sequences: 1
Terminal: 'a' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition

Valid input found: "abbabb"
String matched L(abb)\* pattern
Found abbRepetition: abbabb
Number of 'abb' sequences: 2
Terminal: 'a' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition
Terminal: 'a' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition

Valid input found: "abbabbabb"
String matched L(abb)\* pattern
Found abbRepetition: abbabbabb
Number of 'abb' sequences: 3
Terminal: 'a' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition
Terminal: 'a' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition
Terminal: 'a' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition
Terminal: 'b' in rule: abbRepetition

Valid input found: "aabb"
String matched L(a*bb*) pattern
Found aStarbbStar: aabb
Number of a's: 2
Number of b's: 2
Terminal: 'a' in rule: aStarbbStar
Terminal: 'a' in rule: aStarbbStar
Terminal: 'b' in rule: aStarbbStar
Terminal: 'b' in rule: aStarbbStar

Valid input found: "ab"
String matched L(a*bb*) pattern
Found aStarbbStar: ab
Number of a's: 1
Number of b's: 1
Terminal: 'a' in rule: aStarbbStar
Terminal: 'b' in rule: aStarbbStar

Valid input found: "aaabbb"
String matched L(a*bb*) pattern
Found aStarbbStar: aaabbb
Number of a's: 3
Number of b's: 3
Terminal: 'a' in rule: aStarbbStar
Terminal: 'a' in rule: aStarbbStar
Terminal: 'a' in rule: aStarbbStar
Terminal: 'b' in rule: aStarbbStar
Terminal: 'b' in rule: aStarbbStar
Terminal: 'b' in rule: aStarbbStar

Valid input found: "bbbb"
String matched L(a*bb*) pattern
Found aStarbbStar: bbbb
Number of a's: 0
Number of b's: 4
Terminal: 'b' in rule: aStarbbStar
Terminal: 'b' in rule: aStarbbStar
Terminal: 'b' in rule: aStarbbStar
Terminal: 'b' in rule: aStarbbStar
Parsing complete

Parse Tree (as string):
(myStart (validInput (abbRepetition a b b) \r\n) (validInput (abbRepetition a b b a b b) \r\n) (validInput (abbRepetition a b b a b b a b b) \r\n) \r\n (validInput (aStarbbStar a a b b) \r\n) (validInput (aStarbbStar a b) \r\n) (validInput (aStarbbStar a a a b b b) \r\n) (validInput (aStarbbStar b b b b)) <EOF>)

Minimal DFA explanation:

1. For L(abb)\*:

   - This requires recognizing 'abb' repeated 0 or more times
   - States: q0 (start/accept), q1, q2, q3
   - Transitions:
     - q0 -'a'-> q1
     - q1 -'b'-> q2
     - q2 -'b'-> q3 (q3 is also an accept state)
     - q3 -'a'-> q1 (to continue the pattern)

2. For L(a*bb*):

   - This requires recognizing zero or more 'a's followed by at least one 'b', followed by zero or more 'b's
   - States: q0 (start), q1 (accept)
   - Transitions:
     - q0 -'a'-> q0 (loop on 'a')
     - q0 -'b'-> q1
     - q1 -'b'-> q1 (loop on 'b')

3. For the union L(abb)* ? L(a*bb\*):
   - Combine both DFAs with a new start state having epsilon transitions to both start states
   - This results in a minimal DFA with proper state merging
