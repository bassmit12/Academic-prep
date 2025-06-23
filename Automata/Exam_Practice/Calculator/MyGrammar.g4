grammar MyGrammar;

prog:   stat+ ;

stat:   expr NEWLINE                # printExpr
    |   ID ASSIGN expr NEWLINE      # assign
    |   PRINT expr NEWLINE          # printCmd
    |   NEWLINE                     # blank
    ;

expr:   expr op=(MUL|DIV) expr      # MulDiv
    |   expr op=(ADD|SUB) expr      # AddSub
    |   INT                         # int
    |   ID                          # id
    |   '(' expr ')'                # parens
    ;

// --- Lexer Rules ---
// Keywords must come before generic ID
PRINT:  'print' ;

// Operators
MUL:    '*' ;
DIV:    '/' ;
ADD:    '+' ;
SUB:    '-' ;
ASSIGN: '=' ;

// Identifiers and Numbers
ID:     [a-zA-Z]+ ;
INT:    [0-9]+ ;

// Whitespace and Newlines
NEWLINE:'\r'? '\n' ;
WS:     [ \t]+ -> skip ;