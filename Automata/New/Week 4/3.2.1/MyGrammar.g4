grammar MyGrammar;

// rules
myStart    : expr EOF;
expr       : abMiddleEnd;
abMiddleEnd: A B middle (A | A A);
middle     : (A | A B)*;  // (a+ab)*

// tokens
A          : 'a';
B          : 'b';
WS         : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
