grammar MyGrammar;

// rules
myStart  	: (greeting | goodbye)+ EOF;
greeting	: HELLO personInfo;
goodbye		: GOODBYE;

// Different formats for person information
personInfo	: nameAge           // name and age
            | fullName          // first name and last name
            | namePhone         // name and telephone number
            | fullNamePhone     // first name, last name and telephone number
            ;

nameAge		: name age;
fullName	: firstName lastName;
namePhone	: name phone;
fullNamePhone	: firstName lastName phone;

name		: ID;
firstName	: ID;
lastName	: ID;
age			: NUMBER;
phone		: NUMBER DASH NUMBER DASH NUMBER;

// tokens
GOODBYE		: 'Bye';
HELLO		: 'Hello';
NUMBER		: [0-9]+ ; 
DASH        : '-';
ID 			: [_A-Za-z][A-Za-z_!0-9.]* ; 
WS 			: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
