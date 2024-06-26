grammar Expr;

// Parser rules
prog:   (stat)+ EOF ;

stat:   expr NEWLINE               # printExpr
    |   ID '=' expr NEWLINE        # assign
    |   'print' expr NEWLINE       # printCommand
    |   'if' expr 'then' block ( 'else' block)? # ifStatement
    |   'while' expr 'do' block    # whileStatement
    ;

block:  NEWLINE (stat)+ ;

expr:   expr op=('*' | '/') expr   # MulDiv
    |   expr op=('+' | '-') expr   # AddSub
    |   expr op=('==' | '!=') expr # Relational
    |   expr op=('<' | '>' | '<=' | '>=') expr # Relational
    |   expr op=('&&' | '||') expr # Logical
    |   '!' expr                   # Not
    |   '(' expr ')'               # Parens
    |   NUMBER                     # Number
    |   BOOLEAN                    # Boolean
    |   ID                         # Id
    ;

// Lexer rules
NUMBER: [0-9]+ ('.' [0-9]+)?;
BOOLEAN: 'true' | 'false';
ID:     [a-zA-Z]+ ;
NEWLINE: [\r\n]+ ;
WS:     [ \t]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip; // Allows skipping of comments
