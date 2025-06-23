grammar Calculator;

// Parser rules
expr:   expr ('*'|'/') expr   # MulDiv
    |   expr ('+'|'-') expr   # AddSub
    |   INT                   # Int
    |   '(' expr ')'          # Parens
    ;

// Lexer rules
INT     : [0-9]+ ;
WS      : [ \t\r\n]+ -> skip ;