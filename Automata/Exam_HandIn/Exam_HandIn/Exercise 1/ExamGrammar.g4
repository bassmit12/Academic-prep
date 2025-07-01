grammar ExamGrammar;
prog: stmt+ EOF;
stmt
 : printStmt ';' # StatementPrint
 | assignment ';' # StatementAssignment
 | expr ';' # ExprStat
 ;
printStmt
 : 'print' expr # PrintExpr
 ;
assignment
 : ID '=' expr # AssignVar
 ;
expr
 : primaryExpr # ExprBase
 | expr ('*' | '/') expr # MulDiv
 | expr ('+' | '-') expr # AddSub
 | ('+' | '-') expr # Unary
 ;
primaryExpr
 : INT # Int
 | ID # Id
 | LPAREN expr RPAREN # Parens
 | tree # treeLiteral
 ;

/* 
1. Empty tree: t = []
2. Single node tree: t = [5 [] []]
3. Root with one left child: t = [6 [2 [] []] []]
4. Root with two children and left child 2 has its own left child 4: t = [1 [2 [4 [] []] []] [3 [] []]]
 */

tree
    // empty tree: []
    : LBRACKET RBRACKET                           # EmptyTree
    // non‐empty tree: [<int> <left> <right>]
    | LBRACKET expr tree tree RBRACKET             # NodeTree
    ;
 
LPAREN : '(' ; 
RPAREN : ')' ;
LBRACKET: '[' ; 
RBRACKET: ']' ;
INT : [0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip;