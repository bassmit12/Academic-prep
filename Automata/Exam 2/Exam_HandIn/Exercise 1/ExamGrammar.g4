grammar ExamGrammar;

prog: stmt+ EOF;

stmt
  : printStmt ';'       # StatementPrint
  | assignment ';'      # StatementAssignment
  | expr ';'            # ExprStat
  ;

printStmt
  : 'print' expr        # PrintExpr
  ;

assignment
  : ID '=' expr         # AssignVar
  ;

expr
  : primaryExpr         # ExprBase
  | expr PLUS_MINUS expr # AddSub
  | PLUS_MINUS expr     # Unary
  ;

primaryExpr
  : INT                 # Int
  | ID                  # Id
  | LPAREN expr RPAREN  # Parens
  | list                # ListLiteral
  | STRING_LITERAL      # StringLiteral
  ;

/* All 4 are working!
a.	Empty list: myList = []
b.	List with elements: myList1 = [1, 2, 3]
c.	List with mixed elements (including expressions): myList2 = [2, 3+4, "hello", [4, 5]]
d.	Nested lists: nestedList = [[1, 2], [3, 4, [5]]]
 */

/*
myList3 = [1+2, 3-4, (5-1)+(4-2)]; also works without having to change the code from A, either the question is weirdly formulated or my solution happened to encase question B aswell
 */
list
   : LBRACKET RBRACKET
   | LBRACKET expr RBRACKET
   | LBRACKET (expr ',')+ expr RBRACKET
  ;

// Lexer Rules
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET: '[' ;
RBRACKET: ']' ;
COMMA: ',' ;

PLUS_MINUS: '+' | '-' ;

INT : [0-9]+;
ID  : [a-zA-Z_][a-zA-Z0-9_]*;
STRING_LITERAL : '"' ( ~'"' )* '"' ;

WS  : [ \t\r\n]+ -> skip;
