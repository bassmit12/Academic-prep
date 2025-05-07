import sys
from antlr4 import *
from HTMLLexer import HTMLLexer
from HTMLParser import HTMLParser
from antlr4.tree.Tree import TerminalNodeImpl

def print_tree(node, level=0):
    if isinstance(node, TerminalNodeImpl):
        print("  " * level + node.getText())
    else:
        print("  " * level + type(node).__name__)
        if hasattr(node, 'children') and node.children:
            for child in node.children:
                print_tree(child, level + 1)

def main():
    if len(sys.argv) != 2:
        print("Usage: python parse_html.py <input_file>")
        return

    input_file = sys.argv[1]

    with open(input_file, 'r', encoding='utf-8') as file:
        html_input = file.read()

    input_stream = InputStream(html_input)
    lexer = HTMLLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = HTMLParser(stream)
    tree = parser.document()

    print_tree(tree)

if __name__ == '__main__':
    main()
