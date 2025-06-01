grammar RegexGame;

// Parser Rules
gameStart    : (challenge | solution)+ EOF;
challenge    : CHALLENGE_START difficulty description samples CHALLENGE_END;
solution     : SOLUTION_START regex explanation SOLUTION_END;
difficulty   : DIFFICULTY COLON TEXT;
description  : DESCRIPTION COLON TEXT;
samples      : SAMPLES COLON (sampleItem SEMICOLON)* sampleItem;
sampleItem   : match | nonMatch;
match        : MATCH TEXT;
nonMatch     : NONMATCH TEXT;
regex        : REGEX COLON TEXT;
explanation  : EXPLANATION COLON TEXT;

// Lexer Rules
CHALLENGE_START : 'CHALLENGE:';
CHALLENGE_END   : 'END_CHALLENGE';
SOLUTION_START  : 'SOLUTION:';
SOLUTION_END    : 'END_SOLUTION';
DIFFICULTY      : 'Difficulty';
DESCRIPTION     : 'Description';
SAMPLES         : 'Samples';
MATCH           : 'Match:';
NONMATCH        : 'NonMatch:';
REGEX           : 'Regex';
EXPLANATION     : 'Explanation';
COLON           : ':';
SEMICOLON       : ';';

TEXT            : '"' ( ~["\r\n\\] | '\\' . )* '"';
COMMENT         : '//' ~[\r\n]* -> skip;
WS              : [ \t\r\n]+ -> skip;