import sys
import time
import collections
import re

class TreeNode:
    def __init__(self, value):
        self.value = value
        self.count = 1
        self.left = None
        self.right = None

def linear_setup(text):
    # Preprocess the text for linear search
    words = re.findall(r'\w+', text.lower())
    word_counts = collections.Counter(words)
    return word_counts

def linear_count(word, word_counts):
    # Linear search for counting occurrences
    return word_counts.get(word.lower(), 0)

def binary_setup(text):
    # Preprocess the text for binary search
    words = re.findall(r'\w+', text.lower())
    root = None
    for word in words:
        root = insert(root, word)
    return root

def insert(root, word):
    if root is None:
        return TreeNode(word)
    elif word == root.value:
        root.count += 1
    elif word < root.value:
        root.left = insert(root.left, word)
    else:
        root.right = insert(root.right, word)
    return root

def binary_count(word, root):
    # Binary search for counting occurrences
    node = find_node(root, word.lower())
    return node.count if node else 0

def find_node(root, word):
    if root is None or root.value == word:
        return root
    if word < root.value:
        return find_node(root.left, word)
    return find_node(root.right, word)

def read_text_from_file(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        text = file.read()
    return text


def test_linear_vs_binary(text, words_to_find):
    linear_start = time.time()
    linear_word_counts = linear_setup(text)
    for word in words_to_find:
        count = linear_count(word, linear_word_counts)
        print(f"Linear: '{word}' count: {count}")
    linear_end = time.time()
    print(f"Linear search took {linear_end - linear_start} seconds")

    binary_start = time.time()
    binary_root = binary_setup(text)
    for word in words_to_find:
        count = binary_count(word, binary_root)
        print(f"Binary: '{word}' count: {count}")
    binary_end = time.time()
    print(f"Binary search took {binary_end - binary_start} seconds")

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python script.py <text_file>")
        sys.exit(1)

    file_path = sys.argv[1]
    text = read_text_from_file(file_path)

    words_to_find = ["text", "document", "linear", "binary"]

    test_linear_vs_binary(text, words_to_find)
