from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker
from PersonalInfoLexer import PersonalInfoLexer
from PersonalInfoParser import PersonalInfoParser

def main():
    # Load the input file
    input_stream = FileStream("test.txt")

    # Create the lexer and token stream
    lexer = PersonalInfoLexer(input_stream)
    stream = CommonTokenStream(lexer)

    # Create the parser and parse the input
    parser = PersonalInfoParser(stream)
    tree = parser.document()  # 'document' is the entry point in the grammar

    # Print the parse tree
    print(tree.toStringTree(recog=parser))

if __name__ == '__main__':
    main()
