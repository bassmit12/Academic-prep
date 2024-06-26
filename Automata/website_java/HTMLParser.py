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
        4,1,7,54,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,
        1,0,5,0,16,8,0,10,0,12,0,19,9,0,1,0,1,0,1,1,1,1,3,1,25,8,1,1,1,1,
        1,1,1,3,1,30,8,1,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,
        1,4,1,5,1,5,5,5,47,8,5,10,5,12,5,50,9,5,1,6,1,6,1,6,0,0,7,0,2,4,
        6,8,10,12,0,0,51,0,17,1,0,0,0,2,29,1,0,0,0,4,31,1,0,0,0,6,35,1,0,
        0,0,8,39,1,0,0,0,10,48,1,0,0,0,12,51,1,0,0,0,14,16,3,2,1,0,15,14,
        1,0,0,0,16,19,1,0,0,0,17,15,1,0,0,0,17,18,1,0,0,0,18,20,1,0,0,0,
        19,17,1,0,0,0,20,21,5,0,0,1,21,1,1,0,0,0,22,24,3,4,2,0,23,25,3,10,
        5,0,24,23,1,0,0,0,24,25,1,0,0,0,25,26,1,0,0,0,26,27,3,6,3,0,27,30,
        1,0,0,0,28,30,3,8,4,0,29,22,1,0,0,0,29,28,1,0,0,0,30,3,1,0,0,0,31,
        32,5,2,0,0,32,33,3,12,6,0,33,34,5,4,0,0,34,5,1,0,0,0,35,36,5,3,0,
        0,36,37,3,12,6,0,37,38,5,4,0,0,38,7,1,0,0,0,39,40,5,2,0,0,40,41,
        3,12,6,0,41,42,5,1,0,0,42,43,5,4,0,0,43,9,1,0,0,0,44,47,3,2,1,0,
        45,47,5,6,0,0,46,44,1,0,0,0,46,45,1,0,0,0,47,50,1,0,0,0,48,46,1,
        0,0,0,48,49,1,0,0,0,49,11,1,0,0,0,50,48,1,0,0,0,51,52,5,5,0,0,52,
        13,1,0,0,0,5,17,24,29,46,48
    ]

class HTMLParser ( Parser ):

    grammarFileName = "HTML.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'/'", "'<'", "'</'", "'>'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "TAG_OPEN_START", "TAG_OPEN_END", 
                      "TAG_CLOSE_END", "TAG_NAME", "TEXT", "WS" ]

    RULE_htmlDocument = 0
    RULE_htmlElement = 1
    RULE_openTag = 2
    RULE_closeTag = 3
    RULE_selfClosingTag = 4
    RULE_htmlContent = 5
    RULE_tagName = 6

    ruleNames =  [ "htmlDocument", "htmlElement", "openTag", "closeTag", 
                   "selfClosingTag", "htmlContent", "tagName" ]

    EOF = Token.EOF
    T__0=1
    TAG_OPEN_START=2
    TAG_OPEN_END=3
    TAG_CLOSE_END=4
    TAG_NAME=5
    TEXT=6
    WS=7

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class HtmlDocumentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(HTMLParser.EOF, 0)

        def htmlElement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(HTMLParser.HtmlElementContext)
            else:
                return self.getTypedRuleContext(HTMLParser.HtmlElementContext,i)


        def getRuleIndex(self):
            return HTMLParser.RULE_htmlDocument

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHtmlDocument" ):
                listener.enterHtmlDocument(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHtmlDocument" ):
                listener.exitHtmlDocument(self)




    def htmlDocument(self):

        localctx = HTMLParser.HtmlDocumentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_htmlDocument)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 17
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==2:
                self.state = 14
                self.htmlElement()
                self.state = 19
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 20
            self.match(HTMLParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HtmlElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def openTag(self):
            return self.getTypedRuleContext(HTMLParser.OpenTagContext,0)


        def closeTag(self):
            return self.getTypedRuleContext(HTMLParser.CloseTagContext,0)


        def htmlContent(self):
            return self.getTypedRuleContext(HTMLParser.HtmlContentContext,0)


        def selfClosingTag(self):
            return self.getTypedRuleContext(HTMLParser.SelfClosingTagContext,0)


        def getRuleIndex(self):
            return HTMLParser.RULE_htmlElement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHtmlElement" ):
                listener.enterHtmlElement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHtmlElement" ):
                listener.exitHtmlElement(self)




    def htmlElement(self):

        localctx = HTMLParser.HtmlElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_htmlElement)
        try:
            self.state = 29
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 22
                self.openTag()
                self.state = 24
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
                if la_ == 1:
                    self.state = 23
                    self.htmlContent()


                self.state = 26
                self.closeTag()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 28
                self.selfClosingTag()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OpenTagContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TAG_OPEN_START(self):
            return self.getToken(HTMLParser.TAG_OPEN_START, 0)

        def tagName(self):
            return self.getTypedRuleContext(HTMLParser.TagNameContext,0)


        def TAG_CLOSE_END(self):
            return self.getToken(HTMLParser.TAG_CLOSE_END, 0)

        def getRuleIndex(self):
            return HTMLParser.RULE_openTag

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpenTag" ):
                listener.enterOpenTag(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpenTag" ):
                listener.exitOpenTag(self)




    def openTag(self):

        localctx = HTMLParser.OpenTagContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_openTag)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 31
            self.match(HTMLParser.TAG_OPEN_START)
            self.state = 32
            self.tagName()
            self.state = 33
            self.match(HTMLParser.TAG_CLOSE_END)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CloseTagContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TAG_OPEN_END(self):
            return self.getToken(HTMLParser.TAG_OPEN_END, 0)

        def tagName(self):
            return self.getTypedRuleContext(HTMLParser.TagNameContext,0)


        def TAG_CLOSE_END(self):
            return self.getToken(HTMLParser.TAG_CLOSE_END, 0)

        def getRuleIndex(self):
            return HTMLParser.RULE_closeTag

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCloseTag" ):
                listener.enterCloseTag(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCloseTag" ):
                listener.exitCloseTag(self)




    def closeTag(self):

        localctx = HTMLParser.CloseTagContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_closeTag)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(HTMLParser.TAG_OPEN_END)
            self.state = 36
            self.tagName()
            self.state = 37
            self.match(HTMLParser.TAG_CLOSE_END)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SelfClosingTagContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TAG_OPEN_START(self):
            return self.getToken(HTMLParser.TAG_OPEN_START, 0)

        def tagName(self):
            return self.getTypedRuleContext(HTMLParser.TagNameContext,0)


        def TAG_CLOSE_END(self):
            return self.getToken(HTMLParser.TAG_CLOSE_END, 0)

        def getRuleIndex(self):
            return HTMLParser.RULE_selfClosingTag

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSelfClosingTag" ):
                listener.enterSelfClosingTag(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSelfClosingTag" ):
                listener.exitSelfClosingTag(self)




    def selfClosingTag(self):

        localctx = HTMLParser.SelfClosingTagContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_selfClosingTag)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 39
            self.match(HTMLParser.TAG_OPEN_START)
            self.state = 40
            self.tagName()
            self.state = 41
            self.match(HTMLParser.T__0)
            self.state = 42
            self.match(HTMLParser.TAG_CLOSE_END)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HtmlContentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def htmlElement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(HTMLParser.HtmlElementContext)
            else:
                return self.getTypedRuleContext(HTMLParser.HtmlElementContext,i)


        def TEXT(self, i:int=None):
            if i is None:
                return self.getTokens(HTMLParser.TEXT)
            else:
                return self.getToken(HTMLParser.TEXT, i)

        def getRuleIndex(self):
            return HTMLParser.RULE_htmlContent

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHtmlContent" ):
                listener.enterHtmlContent(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHtmlContent" ):
                listener.exitHtmlContent(self)




    def htmlContent(self):

        localctx = HTMLParser.HtmlContentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_htmlContent)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==2 or _la==6:
                self.state = 46
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [2]:
                    self.state = 44
                    self.htmlElement()
                    pass
                elif token in [6]:
                    self.state = 45
                    self.match(HTMLParser.TEXT)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 50
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TagNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TAG_NAME(self):
            return self.getToken(HTMLParser.TAG_NAME, 0)

        def getRuleIndex(self):
            return HTMLParser.RULE_tagName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTagName" ):
                listener.enterTagName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTagName" ):
                listener.exitTagName(self)




    def tagName(self):

        localctx = HTMLParser.TagNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_tagName)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 51
            self.match(HTMLParser.TAG_NAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





