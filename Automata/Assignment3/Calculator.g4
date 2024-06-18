grammar Calculator;

// Lexer rules
NUM         : [0-9]+ ;
ID          : [a-zA-Z]+ ;
WS          : [ \t\r\n]+ -> skip ;

PLUS        : '+' ;
MINUS       : '-' ;
MULT        : '*' ;
DIV         : '/' ;
ASSIGN      : '=' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
SEMI        : ';' ;
PRINT       : 'print' ;
IF          : 'if' ;
ELSE        : 'else' ;
WHILE       : 'while' ;
TRUE        : 'true' ;
FALSE       : 'false' ;
AND         : '&&' ;
OR          : '||' ;
NOT         : '!' ;

// Parser rules
prog: stat+ ;

stat: expr SEMI
    | assignment
    | printStat
    | ifStat
    | whileStat
    | functionDecl
    | functionCall SEMI
    ;

expr: <assoc=right> expr (PLUS | MINUS) expr
    | expr (MULT | DIV) expr
    | NOT expr
    | expr (AND | OR) expr
    | LPAREN expr RPAREN
    | NUM
    | ID
    ;

assignment: ID ASSIGN expr SEMI ;

printStat: PRINT LPAREN expr RPAREN SEMI ;

ifStat: IF LPAREN expr RPAREN stat (ELSE stat)? ;

whileStat: WHILE LPAREN expr RPAREN stat ;

functionDecl: 'function' ID LPAREN (ID (',' ID)*)? RPAREN stat ;
functionCall: ID LPAREN (expr (',' expr)*)? RPAREN ;

booleanExpr: expr ('<' | '>' | '==' | '!=') expr ;
