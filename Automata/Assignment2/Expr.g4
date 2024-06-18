grammar Expr;

// Define the root rule
expr:   expr op=('*'|'/') expr      # MulDiv
    |   expr op=('+'|'-') expr      # AddSubi
    |   expr op='^' expr            # Power
    |   INT                         # Int
    |   '(' expr ')'                # Parens
    |   expr '!'                    # Factorial
    ;

// Token rules
INT :   [0-9]+ ;
MUL :   '*' ;      // tokens for each operation
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
FACT :  '!' ;
POW :   '^' ;

// Utility rules
WS  :   [ \t\r\n]+ -> skip ;  // Skip whitespaces
