grammar MyGrammar;

// Parser rules
myStart     : (validInput | invalidInput)* EOF;
validInput  : (abbRepetition | aStarbbStar) NEWLINE?;
invalidInput : ~(A | B | NEWLINE)+ NEWLINE?;

// L(abb)* - sequences of "abb" repeated zero or more times
abbRepetition : (A B B)+;  // Changed to + to ensure at least one occurrence

// L(a*bb*) - zero or more 'a's followed by at least one 'b', followed by zero or more 'b's
aStarbbStar : A* B B*;

// Tokens (lexer rules)
A           : 'a';
B           : 'b';
NEWLINE     : '\r'? '\n';
WS          : [ \t]+ -> skip; // skip spaces and tabs only, preserve newlines
