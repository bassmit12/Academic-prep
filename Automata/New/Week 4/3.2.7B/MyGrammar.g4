grammar MyGrammar;

// rules
myStart     : dfa EOF;
dfa         : firstDfa INTERSECTION secondDfa;
firstDfa    : LPAR 'ab*a*' RPAR;
secondDfa   : LPAR '(b)*ab' RPAR;

// tokens
INTERSECTION: '∩';
LPAR        : 'L(';
RPAR        : ')';
WS          : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
