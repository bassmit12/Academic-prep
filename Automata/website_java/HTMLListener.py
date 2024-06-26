# Generated from HTML.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .HTMLParser import HTMLParser
else:
    from HTMLParser import HTMLParser

# This class defines a complete listener for a parse tree produced by HTMLParser.
class HTMLListener(ParseTreeListener):

    # Enter a parse tree produced by HTMLParser#htmlDocument.
    def enterHtmlDocument(self, ctx:HTMLParser.HtmlDocumentContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlDocument.
    def exitHtmlDocument(self, ctx:HTMLParser.HtmlDocumentContext):
        pass


    # Enter a parse tree produced by HTMLParser#htmlElement.
    def enterHtmlElement(self, ctx:HTMLParser.HtmlElementContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlElement.
    def exitHtmlElement(self, ctx:HTMLParser.HtmlElementContext):
        pass


    # Enter a parse tree produced by HTMLParser#openTag.
    def enterOpenTag(self, ctx:HTMLParser.OpenTagContext):
        pass

    # Exit a parse tree produced by HTMLParser#openTag.
    def exitOpenTag(self, ctx:HTMLParser.OpenTagContext):
        pass


    # Enter a parse tree produced by HTMLParser#closeTag.
    def enterCloseTag(self, ctx:HTMLParser.CloseTagContext):
        pass

    # Exit a parse tree produced by HTMLParser#closeTag.
    def exitCloseTag(self, ctx:HTMLParser.CloseTagContext):
        pass


    # Enter a parse tree produced by HTMLParser#selfClosingTag.
    def enterSelfClosingTag(self, ctx:HTMLParser.SelfClosingTagContext):
        pass

    # Exit a parse tree produced by HTMLParser#selfClosingTag.
    def exitSelfClosingTag(self, ctx:HTMLParser.SelfClosingTagContext):
        pass


    # Enter a parse tree produced by HTMLParser#htmlContent.
    def enterHtmlContent(self, ctx:HTMLParser.HtmlContentContext):
        pass

    # Exit a parse tree produced by HTMLParser#htmlContent.
    def exitHtmlContent(self, ctx:HTMLParser.HtmlContentContext):
        pass


    # Enter a parse tree produced by HTMLParser#tagName.
    def enterTagName(self, ctx:HTMLParser.TagNameContext):
        pass

    # Exit a parse tree produced by HTMLParser#tagName.
    def exitTagName(self, ctx:HTMLParser.TagNameContext):
        pass



del HTMLParser