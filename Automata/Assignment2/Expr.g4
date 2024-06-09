grammar Expr;

expr: expr op=('*'|'/') expr      # MulDiv
    | expr op=('+'|'-') expr      # AddSub
    | expr op= '^' expr           # Power
    | '!' expr                    # Factorial
    | INT                         # Int
    | '(' expr ')'                # Parens
    ;

INT : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
