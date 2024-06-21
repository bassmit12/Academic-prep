grammar ImageToText;

imageToTextCommand: 'extract' 'text' 'from' 'image' FILE;
FILE: [a-zA-Z0-9._/-]+;
WS: [ \t\r\n]+ -> skip;
