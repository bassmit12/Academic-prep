# Generated from HTML.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .HTMLParser import HTMLParser
else:
    from HTMLParser import HTMLParser

# This class defines a complete listener for a parse tree produced by HTMLParser.
class HTMLListener(ParseTreeListener):

    # Enter a parse tree produced by HTMLParser#document.
    def enterDocument(self, ctx:HTMLParser.DocumentContext):
        pass

    # Exit a parse tree produced by HTMLParser#document.
    def exitDocument(self, ctx:HTMLParser.DocumentContext):
        pass


    # Enter a parse tree produced by HTMLParser#element.
    def enterElement(self, ctx:HTMLParser.ElementContext):
        pass

    # Exit a parse tree produced by HTMLParser#element.
    def exitElement(self, ctx:HTMLParser.ElementContext):
        pass


    # Enter a parse tree produced by HTMLParser#tag.
    def enterTag(self, ctx:HTMLParser.TagContext):
        pass

    # Exit a parse tree produced by HTMLParser#tag.
    def exitTag(self, ctx:HTMLParser.TagContext):
        pass


    # Enter a parse tree produced by HTMLParser#script.
    def enterScript(self, ctx:HTMLParser.ScriptContext):
        pass

    # Exit a parse tree produced by HTMLParser#script.
    def exitScript(self, ctx:HTMLParser.ScriptContext):
        pass


    # Enter a parse tree produced by HTMLParser#style.
    def enterStyle(self, ctx:HTMLParser.StyleContext):
        pass

    # Exit a parse tree produced by HTMLParser#style.
    def exitStyle(self, ctx:HTMLParser.StyleContext):
        pass


    # Enter a parse tree produced by HTMLParser#attribute.
    def enterAttribute(self, ctx:HTMLParser.AttributeContext):
        pass

    # Exit a parse tree produced by HTMLParser#attribute.
    def exitAttribute(self, ctx:HTMLParser.AttributeContext):
        pass



del HTMLParser