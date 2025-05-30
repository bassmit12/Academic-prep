# Generated from HTML.g4 by ANTLR 4.13.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,7,41,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,1,0,1,0,1,1,1,1,1,2,1,2,1,2,1,3,1,3,1,4,4,4,26,8,4,11,4,12,
        4,27,1,5,4,5,31,8,5,11,5,12,5,32,1,6,4,6,36,8,6,11,6,12,6,37,1,6,
        1,6,0,0,7,1,1,3,2,5,3,7,4,9,5,11,6,13,7,1,0,3,3,0,48,57,65,90,97,
        122,1,0,60,60,3,0,9,10,13,13,32,32,43,0,1,1,0,0,0,0,3,1,0,0,0,0,
        5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,1,15,
        1,0,0,0,3,17,1,0,0,0,5,19,1,0,0,0,7,22,1,0,0,0,9,25,1,0,0,0,11,30,
        1,0,0,0,13,35,1,0,0,0,15,16,5,47,0,0,16,2,1,0,0,0,17,18,5,60,0,0,
        18,4,1,0,0,0,19,20,5,60,0,0,20,21,5,47,0,0,21,6,1,0,0,0,22,23,5,
        62,0,0,23,8,1,0,0,0,24,26,7,0,0,0,25,24,1,0,0,0,26,27,1,0,0,0,27,
        25,1,0,0,0,27,28,1,0,0,0,28,10,1,0,0,0,29,31,8,1,0,0,30,29,1,0,0,
        0,31,32,1,0,0,0,32,30,1,0,0,0,32,33,1,0,0,0,33,12,1,0,0,0,34,36,
        7,2,0,0,35,34,1,0,0,0,36,37,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,0,
        38,39,1,0,0,0,39,40,6,6,0,0,40,14,1,0,0,0,4,0,27,32,37,1,6,0,0
    ]

class HTMLLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    TAG_OPEN_START = 2
    TAG_OPEN_END = 3
    TAG_CLOSE_END = 4
    TAG_NAME = 5
    TEXT = 6
    WS = 7

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'/'", "'<'", "'</'", "'>'" ]

    symbolicNames = [ "<INVALID>",
            "TAG_OPEN_START", "TAG_OPEN_END", "TAG_CLOSE_END", "TAG_NAME", 
            "TEXT", "WS" ]

    ruleNames = [ "T__0", "TAG_OPEN_START", "TAG_OPEN_END", "TAG_CLOSE_END", 
                  "TAG_NAME", "TEXT", "WS" ]

    grammarFileName = "HTML.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


