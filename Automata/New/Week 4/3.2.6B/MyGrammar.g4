grammar MyGrammar;

// rules
myStart  	: expr EOF;
expr		: 'a' 'b' middle ending;
middle		: ('a' | 'a' 'b')* ;
ending		: 'a' | 'a' 'a';

// tokens
A           : 'a';
B           : 'b';
WS 			: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
