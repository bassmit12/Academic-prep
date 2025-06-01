# output

Lexer vocabulary:
1: 'a' (A)
2: 'b' (B)
3: null (WS)

Tokens from input:
a (type=A, line=1, pos=0)
b (type=B, line=1, pos=1)

enterMyStart() - Beginning NFA processing
Processing expression: ab
Processing ab pattern: ab
Terminal: 'a', Token type: 1, Line: 1, Column: 0
Terminal: 'b', Token type: 2, Line: 1, Column: 1
exitMyStart() - NFA processing complete

NFA Simulation:
Processing input: ab
NFA: q0 --a--> q1
NFA: q1 --b--> q2 (accepting)
NFA Acceptance: true
Input accepted: Matches the language L(a\*a + ab)
