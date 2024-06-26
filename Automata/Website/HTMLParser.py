# Generated from HTML.g4 by ANTLR 4.13.1
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
        4,1,12,97,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,5,
        0,14,8,0,10,0,12,0,17,9,0,1,0,1,0,1,1,1,1,1,1,3,1,24,8,1,1,2,1,2,
        1,2,5,2,29,8,2,10,2,12,2,32,9,2,1,2,1,2,5,2,36,8,2,10,2,12,2,39,
        9,2,1,2,1,2,1,2,1,2,1,2,1,2,5,2,47,8,2,10,2,12,2,50,9,2,1,2,3,2,
        53,8,2,1,3,1,3,1,3,5,3,58,8,3,10,3,12,3,61,9,3,1,3,1,3,5,3,65,8,
        3,10,3,12,3,68,9,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,5,4,77,8,4,10,4,12,
        4,80,9,4,1,4,1,4,5,4,84,8,4,10,4,12,4,87,9,4,1,4,1,4,1,4,1,4,1,5,
        1,5,1,5,1,5,1,5,2,66,85,0,6,0,2,4,6,8,10,0,0,101,0,15,1,0,0,0,2,
        23,1,0,0,0,4,52,1,0,0,0,6,54,1,0,0,0,8,73,1,0,0,0,10,92,1,0,0,0,
        12,14,3,2,1,0,13,12,1,0,0,0,14,17,1,0,0,0,15,13,1,0,0,0,15,16,1,
        0,0,0,16,18,1,0,0,0,17,15,1,0,0,0,18,19,5,0,0,1,19,1,1,0,0,0,20,
        24,3,6,3,0,21,24,3,8,4,0,22,24,3,4,2,0,23,20,1,0,0,0,23,21,1,0,0,
        0,23,22,1,0,0,0,24,3,1,0,0,0,25,26,5,4,0,0,26,30,5,10,0,0,27,29,
        3,10,5,0,28,27,1,0,0,0,29,32,1,0,0,0,30,28,1,0,0,0,30,31,1,0,0,0,
        31,33,1,0,0,0,32,30,1,0,0,0,33,37,5,5,0,0,34,36,3,2,1,0,35,34,1,
        0,0,0,36,39,1,0,0,0,37,35,1,0,0,0,37,38,1,0,0,0,38,40,1,0,0,0,39,
        37,1,0,0,0,40,41,5,6,0,0,41,42,5,10,0,0,42,53,5,5,0,0,43,44,5,4,
        0,0,44,48,5,10,0,0,45,47,3,10,5,0,46,45,1,0,0,0,47,50,1,0,0,0,48,
        46,1,0,0,0,48,49,1,0,0,0,49,51,1,0,0,0,50,48,1,0,0,0,51,53,5,7,0,
        0,52,25,1,0,0,0,52,43,1,0,0,0,53,5,1,0,0,0,54,55,5,4,0,0,55,59,5,
        1,0,0,56,58,3,10,5,0,57,56,1,0,0,0,58,61,1,0,0,0,59,57,1,0,0,0,59,
        60,1,0,0,0,60,62,1,0,0,0,61,59,1,0,0,0,62,66,5,5,0,0,63,65,9,0,0,
        0,64,63,1,0,0,0,65,68,1,0,0,0,66,67,1,0,0,0,66,64,1,0,0,0,67,69,
        1,0,0,0,68,66,1,0,0,0,69,70,5,6,0,0,70,71,5,1,0,0,71,72,5,5,0,0,
        72,7,1,0,0,0,73,74,5,4,0,0,74,78,5,2,0,0,75,77,3,10,5,0,76,75,1,
        0,0,0,77,80,1,0,0,0,78,76,1,0,0,0,78,79,1,0,0,0,79,81,1,0,0,0,80,
        78,1,0,0,0,81,85,5,5,0,0,82,84,9,0,0,0,83,82,1,0,0,0,84,87,1,0,0,
        0,85,86,1,0,0,0,85,83,1,0,0,0,86,88,1,0,0,0,87,85,1,0,0,0,88,89,
        5,6,0,0,89,90,5,2,0,0,90,91,5,5,0,0,91,9,1,0,0,0,92,93,5,8,0,0,93,
        94,5,3,0,0,94,95,5,9,0,0,95,11,1,0,0,0,10,15,23,30,37,48,52,59,66,
        78,85
    ]

class HTMLParser ( Parser ):

    grammarFileName = "HTML.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'script'", "'style'", "'='", "'<'", "'>'", 
                     "'</'", "'/>'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "TAG_OPEN", "TAG_CLOSE", "TAG_OPEN_SLASH", "TAG_SLASH_CLOSE", 
                      "ATTRIBUTE_NAME", "ATTRIBUTE_VALUE", "TAG_NAME", "TEXT", 
                      "WS" ]

    RULE_document = 0
    RULE_element = 1
    RULE_tag = 2
    RULE_script = 3
    RULE_style = 4
    RULE_attribute = 5

    ruleNames =  [ "document", "element", "tag", "script", "style", "attribute" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    TAG_OPEN=4
    TAG_CLOSE=5
    TAG_OPEN_SLASH=6
    TAG_SLASH_CLOSE=7
    ATTRIBUTE_NAME=8
    ATTRIBUTE_VALUE=9
    TAG_NAME=10
    TEXT=11
    WS=12

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class DocumentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(HTMLParser.EOF, 0)

        def element(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(HTMLParser.ElementContext)
            else:
                return self.getTypedRuleContext(HTMLParser.ElementContext,i)


        def getRuleIndex(self):
            return HTMLParser.RULE_document

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDocument" ):
                listener.enterDocument(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDocument" ):
                listener.exitDocument(self)




    def document(self):

        localctx = HTMLParser.DocumentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_document)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 15
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==4:
                self.state = 12
                self.element()
                self.state = 17
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 18
            self.match(HTMLParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def script(self):
            return self.getTypedRuleContext(HTMLParser.ScriptContext,0)


        def style(self):
            return self.getTypedRuleContext(HTMLParser.StyleContext,0)


        def tag(self):
            return self.getTypedRuleContext(HTMLParser.TagContext,0)


        def getRuleIndex(self):
            return HTMLParser.RULE_element

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElement" ):
                listener.enterElement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElement" ):
                listener.exitElement(self)




    def element(self):

        localctx = HTMLParser.ElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_element)
        try:
            self.state = 23
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 20
                self.script()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 21
                self.style()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 22
                self.tag()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TagContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TAG_OPEN(self):
            return self.getToken(HTMLParser.TAG_OPEN, 0)

        def TAG_NAME(self, i:int=None):
            if i is None:
                return self.getTokens(HTMLParser.TAG_NAME)
            else:
                return self.getToken(HTMLParser.TAG_NAME, i)

        def TAG_CLOSE(self, i:int=None):
            if i is None:
                return self.getTokens(HTMLParser.TAG_CLOSE)
            else:
                return self.getToken(HTMLParser.TAG_CLOSE, i)

        def TAG_OPEN_SLASH(self):
            return self.getToken(HTMLParser.TAG_OPEN_SLASH, 0)

        def attribute(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(HTMLParser.AttributeContext)
            else:
                return self.getTypedRuleContext(HTMLParser.AttributeContext,i)


        def element(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(HTMLParser.ElementContext)
            else:
                return self.getTypedRuleContext(HTMLParser.ElementContext,i)


        def TAG_SLASH_CLOSE(self):
            return self.getToken(HTMLParser.TAG_SLASH_CLOSE, 0)

        def getRuleIndex(self):
            return HTMLParser.RULE_tag

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTag" ):
                listener.enterTag(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTag" ):
                listener.exitTag(self)




    def tag(self):

        localctx = HTMLParser.TagContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_tag)
        self._la = 0 # Token type
        try:
            self.state = 52
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 25
                self.match(HTMLParser.TAG_OPEN)
                self.state = 26
                self.match(HTMLParser.TAG_NAME)
                self.state = 30
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==8:
                    self.state = 27
                    self.attribute()
                    self.state = 32
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 33
                self.match(HTMLParser.TAG_CLOSE)
                self.state = 37
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==4:
                    self.state = 34
                    self.element()
                    self.state = 39
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 40
                self.match(HTMLParser.TAG_OPEN_SLASH)
                self.state = 41
                self.match(HTMLParser.TAG_NAME)
                self.state = 42
                self.match(HTMLParser.TAG_CLOSE)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 43
                self.match(HTMLParser.TAG_OPEN)
                self.state = 44
                self.match(HTMLParser.TAG_NAME)
                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==8:
                    self.state = 45
                    self.attribute()
                    self.state = 50
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 51
                self.match(HTMLParser.TAG_SLASH_CLOSE)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ScriptContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TAG_OPEN(self):
            return self.getToken(HTMLParser.TAG_OPEN, 0)

        def TAG_CLOSE(self, i:int=None):
            if i is None:
                return self.getTokens(HTMLParser.TAG_CLOSE)
            else:
                return self.getToken(HTMLParser.TAG_CLOSE, i)

        def TAG_OPEN_SLASH(self):
            return self.getToken(HTMLParser.TAG_OPEN_SLASH, 0)

        def attribute(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(HTMLParser.AttributeContext)
            else:
                return self.getTypedRuleContext(HTMLParser.AttributeContext,i)


        def getRuleIndex(self):
            return HTMLParser.RULE_script

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterScript" ):
                listener.enterScript(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitScript" ):
                listener.exitScript(self)




    def script(self):

        localctx = HTMLParser.ScriptContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_script)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self.match(HTMLParser.TAG_OPEN)
            self.state = 55
            self.match(HTMLParser.T__0)
            self.state = 59
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==8:
                self.state = 56
                self.attribute()
                self.state = 61
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 62
            self.match(HTMLParser.TAG_CLOSE)
            self.state = 66
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,7,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 63
                    self.matchWildcard() 
                self.state = 68
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,7,self._ctx)

            self.state = 69
            self.match(HTMLParser.TAG_OPEN_SLASH)
            self.state = 70
            self.match(HTMLParser.T__0)
            self.state = 71
            self.match(HTMLParser.TAG_CLOSE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StyleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TAG_OPEN(self):
            return self.getToken(HTMLParser.TAG_OPEN, 0)

        def TAG_CLOSE(self, i:int=None):
            if i is None:
                return self.getTokens(HTMLParser.TAG_CLOSE)
            else:
                return self.getToken(HTMLParser.TAG_CLOSE, i)

        def TAG_OPEN_SLASH(self):
            return self.getToken(HTMLParser.TAG_OPEN_SLASH, 0)

        def attribute(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(HTMLParser.AttributeContext)
            else:
                return self.getTypedRuleContext(HTMLParser.AttributeContext,i)


        def getRuleIndex(self):
            return HTMLParser.RULE_style

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStyle" ):
                listener.enterStyle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStyle" ):
                listener.exitStyle(self)




    def style(self):

        localctx = HTMLParser.StyleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_style)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.match(HTMLParser.TAG_OPEN)
            self.state = 74
            self.match(HTMLParser.T__1)
            self.state = 78
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==8:
                self.state = 75
                self.attribute()
                self.state = 80
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 81
            self.match(HTMLParser.TAG_CLOSE)
            self.state = 85
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,9,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 82
                    self.matchWildcard() 
                self.state = 87
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

            self.state = 88
            self.match(HTMLParser.TAG_OPEN_SLASH)
            self.state = 89
            self.match(HTMLParser.T__1)
            self.state = 90
            self.match(HTMLParser.TAG_CLOSE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AttributeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ATTRIBUTE_NAME(self):
            return self.getToken(HTMLParser.ATTRIBUTE_NAME, 0)

        def ATTRIBUTE_VALUE(self):
            return self.getToken(HTMLParser.ATTRIBUTE_VALUE, 0)

        def getRuleIndex(self):
            return HTMLParser.RULE_attribute

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAttribute" ):
                listener.enterAttribute(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAttribute" ):
                listener.exitAttribute(self)




    def attribute(self):

        localctx = HTMLParser.AttributeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_attribute)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92
            self.match(HTMLParser.ATTRIBUTE_NAME)
            self.state = 93
            self.match(HTMLParser.T__2)
            self.state = 94
            self.match(HTMLParser.ATTRIBUTE_VALUE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





