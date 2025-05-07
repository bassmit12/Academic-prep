import sys
import os
from antlr4 import *
from ImageToTextLexer import ImageToTextLexer
from ImageToTextParser import ImageToTextParser
from PIL import Image
import pytesseract

def main(argv):
    # Check if an input command is provided
    if len(argv) < 1:
        print("Usage: python image_to_text.py \"extract text from image <file_path>\"")
        return

    input_command = " ".join(argv)
    print(f"Input Command: {input_command}")

    # Set up the ANTLR input stream and lexer
    input_stream = InputStream(input_command)
    lexer = ImageToTextLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ImageToTextParser(stream)
    tree = parser.imageToTextCommand()

    # Extract the file path from the parse tree
    file_path = tree.FILE().getText()
    print(f"File Path: {file_path}")

    # Ensure the file path is properly formatted and check for file existence
    if not os.path.isfile(file_path):
        print(f"File not found: {file_path}")
        return

    # Use PIL and pytesseract to extract text from the image
    try:
        print(f"Opening image {file_path}...")
        image = Image.open(file_path)
        print("Extracting text from image...")
        extracted_text = pytesseract.image_to_string(image)
        print(f"Extracted Text from {file_path}:\n{extracted_text}")
    except Exception as e:
        print(f"Error processing image: {e}")

if __name__ == '__main__':
    main(sys.argv[1:])
