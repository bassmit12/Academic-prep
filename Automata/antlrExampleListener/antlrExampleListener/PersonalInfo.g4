grammar PersonalInfo;

// Entry point
document : info+;

// Info entries
info : nameAndLastName | nameWithAge | telephoneNumber;

// Rule to match "First name and last name"
nameAndLastName : firstName 'and' lastName ;

// Rule to match "name with age"
nameWithAge : name 'with' age ;

// Rule to match "telephone number"
telephoneNumber : 'telephone number' COLON? number ;

// Tokens for first name and last name
firstName : WORD+ ;
lastName  : WORD+ ;

// Token for name
name : WORD+ ;

// Token for age (digits)
age : DIGIT+ ;

// Token for number (telephone number can be digits or digits with dashes/spaces)
number : DIGIT (DIGIT | DASH | SPACE)* ;

// Lexer rules
COLON : ':' ;
WORD : [a-zA-Z]+ ;
DIGIT : [0-9]+ ;
DASH : '-' ;
SPACE : ' ' -> skip ;

// Skip whitespaces
WS : [ \t\r\n]+ -> skip ;
