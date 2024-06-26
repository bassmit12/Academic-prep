# main.py

import sys
from antlr4 import *
from HTMLLexer import HTMLLexer
from HTMLParser import HTMLParser


# Custom listener class that will print messages when entering and exiting HTML elements
class HTMLPrintListener(ParseTreeListener):
    # Called when the parser enters an HTML element
    def enterHtmlElement(self, ctx: HTMLParser.HtmlElementContext):
        print("Entering HTML element:", ctx.getText())

    # Called when the parser exits an HTML element
    def exitHtmlElement(self, ctx: HTMLParser.HtmlElementContext):
        print("Exiting HTML element:", ctx.getText())


def main(argv):
    # Read the input file
    input_stream = FileStream(argv[1])

    # Create a lexer that will break the input into tokens
    lexer = HTMLLexer(input_stream)

    # Create a token stream from the lexer
    stream = CommonTokenStream(lexer)

    # Create a parser that will process the token stream
    parser = HTMLParser(stream)

    # Parse the input to create a parse tree
    tree = parser.htmlDocument()

    # Create a listener instance
    printer = HTMLPrintListener()

    # Create a parse tree walker that will traverse the tree and trigger callbacks
    walker = ParseTreeWalker()

    # Walk the parse tree using the listener
    walker.walk(printer, tree)


# Entry point of the script
if __name__ == '__main__':
    main(sys.argv)
