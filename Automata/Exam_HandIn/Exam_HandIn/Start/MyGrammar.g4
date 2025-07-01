
grammar MyGrammar;

// rules
myStart  	: (hello | goodbye)+ EOF;
hello		: HELLO name age;
goodbye		: GOODBYE;
name		: ID;
age			: NUMBER;

// tokens
GOODBYE		: 'Bye';
HELLO		: 'Hello';
NUMBER		: [0-9]+ ; 
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ; 
WS 			: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
