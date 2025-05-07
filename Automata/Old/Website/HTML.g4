grammar HTML;

document  : element* EOF ;

element
    : script
    | style
    | TAG_OPEN TAG_NAME attribute* TAG_CLOSE element* TAG_OPEN_SLASH TAG_NAME TAG_CLOSE
    | TAG_OPEN TAG_NAME attribute* TAG_SLASH_CLOSE
    ;

script
    : TAG_OPEN 'script' attribute* TAG_CLOSE .*? TAG_OPEN_SLASH 'script' TAG_CLOSE
    ;

style
    : TAG_OPEN 'style' attribute* TAG_CLOSE .*? TAG_OPEN_SLASH 'style' TAG_CLOSE
    ;

attribute
    : ATTRIBUTE_NAME '=' ATTRIBUTE_VALUE
    ;

TAG_OPEN        : '<' ;
TAG_CLOSE       : '>' ;
TAG_OPEN_SLASH  : '</' ;
TAG_SLASH_CLOSE : '/>' ;
ATTRIBUTE_NAME  : [a-zA-Z_:][a-zA-Z0-9:._-]* ;
ATTRIBUTE_VALUE : '"' (~["])* '"' | '\'' (~['])* '\'' ;

TAG_NAME        : [a-zA-Z_:][a-zA-Z0-9:._-]* ;
TEXT            : ~[<]+ ;

WS              : [ \t\r\n]+ -> skip ;
