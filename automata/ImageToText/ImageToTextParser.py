# Generated from ImageToText.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,6,9,2,0,7,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,7,0,2,1,
        0,0,0,2,3,5,1,0,0,3,4,5,2,0,0,4,5,5,3,0,0,5,6,5,4,0,0,6,7,5,5,0,
        0,7,1,1,0,0,0,0
    ]

class ImageToTextParser ( Parser ):

    grammarFileName = "ImageToText.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'extract'", "'text'", "'from'", "'image'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "FILE", "WS" ]

    RULE_imageToTextCommand = 0

    ruleNames =  [ "imageToTextCommand" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    FILE=5
    WS=6

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ImageToTextCommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FILE(self):
            return self.getToken(ImageToTextParser.FILE, 0)

        def getRuleIndex(self):
            return ImageToTextParser.RULE_imageToTextCommand

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImageToTextCommand" ):
                listener.enterImageToTextCommand(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImageToTextCommand" ):
                listener.exitImageToTextCommand(self)




    def imageToTextCommand(self):

        localctx = ImageToTextParser.ImageToTextCommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_imageToTextCommand)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 2
            self.match(ImageToTextParser.T__0)
            self.state = 3
            self.match(ImageToTextParser.T__1)
            self.state = 4
            self.match(ImageToTextParser.T__2)
            self.state = 5
            self.match(ImageToTextParser.T__3)
            self.state = 6
            self.match(ImageToTextParser.FILE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





