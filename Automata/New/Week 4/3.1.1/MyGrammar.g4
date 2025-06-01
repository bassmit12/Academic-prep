grammar MyGrammar;

// Grammar for L((a + bb)*)
start  : expr EOF;
expr   : (terminal)*;
terminal : 'a' | 'bb';

// tokens
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
