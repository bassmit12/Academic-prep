grammar HTML;

// The entry point of the parser. It matches zero or more HTML elements followed by the end of the file.
htmlDocument
    : htmlElement* EOF
    ;

// Matches either a pair of open and close tags with content in between or a self-closing tag.
htmlElement
    : openTag htmlContent* closeTag
    | selfClosingTag
    ;

// Matches an opening tag like <tag>.
openTag
    : OPEN_TAG
    ;

// Matches a closing tag like </tag>.
closeTag
    : CLOSE_TAG
    ;

// Matches a self-closing tag like <tag/>.
selfClosingTag
    : SELF_CLOSING_TAG
    ;

// Matches either nested HTML elements or text content inside an element.
htmlContent
    : htmlElement  // Allow nested elements
    | TEXT         // Allow text content
    ;

// Lexer rule for matching an opening tag.
OPEN_TAG
    : '<' TAG_NAME '>'
    ;

// Lexer rule for matching a closing tag.
CLOSE_TAG
    : '</' TAG_NAME '>'
    ;

// Lexer rule for matching a self-closing tag.
SELF_CLOSING_TAG
    : '<' TAG_NAME '/>'
    ;

// Lexer rule for matching tag names, which consist of alphanumeric characters.
TAG_NAME
    : [a-zA-Z0-9]+
    ;

// Lexer rule for matching text content. Matches any characters except '<' and '>'.
TEXT
    : (~('<' | '>'))+
    ;

// Lexer rule for matching whitespace characters. These are skipped by the parser.
WS
    : [ \t\r\n]+ -> skip
    ;
