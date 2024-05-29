grammar PersonalInfo;

// Entry point
document: info+;

// Info entries
info: nameAndLastName | nameWithAge | detailedPhoneNumber | fullNameWithDetails;

// Rule to match "First name and last name"
nameAndLastName: firstName 'and' lastName;

// Rule to match "name with age"
nameWithAge: name 'with' age;

// Rule to match "detailed telephone number"
detailedPhoneNumber: 'telephone number' COLON detailedNumber;

// New Rule to handle full names with optional titles and suffixes
fullNameWithDetails: title? firstName middleName? lastName suffix?;

// Tokens for first name and last name
firstName: WORD;
lastName: WORD;
middleName: WORD;

// Token for name
name: WORD;

// Token for age (digits)
age: DIGIT+;

// Token for detailed number (telephone number can be digits or with dashes/spaces)
detailedNumber: number ('ext' extension)?;

number: DIGIT (DIGIT | DASH | SPACE)*;
extension: DIGIT+;

// Lexer rules
COLON: ':';
WORD: [a-zA-Z]+;
DIGIT: [0-9];
DASH: '-';
SPACE: ' ';
title: ('Mr.' | 'Mrs.' | 'Ms.' | 'Dr.');
suffix: ('Jr.' | 'Sr.' | 'III');

// Skip whitespaces
WS: [ \t\r\n]+ -> skip;
