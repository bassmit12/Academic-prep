# Generated from ImageToText.g4 by ANTLR 4.13.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,6,49,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,
        0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,
        2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,4,4,4,39,8,4,11,4,12,4,40,1,5,4,
        5,44,8,5,11,5,12,5,45,1,5,1,5,0,0,6,1,1,3,2,5,3,7,4,9,5,11,6,1,0,
        2,4,0,45,57,65,90,95,95,97,122,3,0,9,10,13,13,32,32,50,0,1,1,0,0,
        0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,1,
        13,1,0,0,0,3,21,1,0,0,0,5,26,1,0,0,0,7,31,1,0,0,0,9,38,1,0,0,0,11,
        43,1,0,0,0,13,14,5,101,0,0,14,15,5,120,0,0,15,16,5,116,0,0,16,17,
        5,114,0,0,17,18,5,97,0,0,18,19,5,99,0,0,19,20,5,116,0,0,20,2,1,0,
        0,0,21,22,5,116,0,0,22,23,5,101,0,0,23,24,5,120,0,0,24,25,5,116,
        0,0,25,4,1,0,0,0,26,27,5,102,0,0,27,28,5,114,0,0,28,29,5,111,0,0,
        29,30,5,109,0,0,30,6,1,0,0,0,31,32,5,105,0,0,32,33,5,109,0,0,33,
        34,5,97,0,0,34,35,5,103,0,0,35,36,5,101,0,0,36,8,1,0,0,0,37,39,7,
        0,0,0,38,37,1,0,0,0,39,40,1,0,0,0,40,38,1,0,0,0,40,41,1,0,0,0,41,
        10,1,0,0,0,42,44,7,1,0,0,43,42,1,0,0,0,44,45,1,0,0,0,45,43,1,0,0,
        0,45,46,1,0,0,0,46,47,1,0,0,0,47,48,6,5,0,0,48,12,1,0,0,0,3,0,40,
        45,1,6,0,0
    ]

class ImageToTextLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    FILE = 5
    WS = 6

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'extract'", "'text'", "'from'", "'image'" ]

    symbolicNames = [ "<INVALID>",
            "FILE", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "FILE", "WS" ]

    grammarFileName = "ImageToText.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


