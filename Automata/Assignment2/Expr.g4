grammar Expr;

// Parser rules
expr:   expr ('*'|'/') expr   # MulDiv
    |   expr ('+'|'-') expr   # AddSub
    |   expr '^' expr         # Exp
    |   expr '!'              # Factorial
    |   INT                   # Int
    |   '(' expr ')'          # Parens
    ;

// Lexer rules
INT :   [0-9]+ ;
MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
EXP :   '^' ;
FACT:   '!' ;
LPAR:  '(' ;
RPAR:  ')' ;

WS  :   [ \t\r\n]+ -> skip ;
