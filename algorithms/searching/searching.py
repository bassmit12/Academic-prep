import sys
import time
import collections
import re


class TreeNode:
    def __init__(self, value):
        # Initialize TreeNode with value and count
        self.value = value
        self.count = 1
        self.left = None
        self.right = None


def linear_setup(text):
    # Count occurrences of words in a linear manner
    words = re.findall(r'\w+', text.lower())
    word_counts = collections.Counter(words)
    return word_counts


def linear_count(word, word_counts):
    # Retrieve count of a word from word_counts dictionary
    return word_counts.get(word.lower(), 0)


def binary_setup(text):
    # Build binary search tree for counting occurrences
    words = re.findall(r'\w+', text.lower())
    root = None
    for word in words:
        root = insert(root, word)
    return root


def insert(root, word):
    # Insert a new node into the binary search tree
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
    # Find node with given word value in the binary search tree
    if root is None or root.value == word:
        return root
    if word < root.value:
        return find_node(root.left, word)
    return find_node(root.right, word)


def read_text_from_file(file_path):
    # Read text from file
    with open(file_path, 'r', encoding='utf-8') as file:
        text = file.read()
    return text


def linear_test(text, words_to_find):
    # Test linear counting method
    print("Linear Test:")
    linear_start = time.time()
    linear_word_counts = linear_setup(text)
    linear_passed = True
    for word in words_to_find:
        count = linear_count(word, linear_word_counts)
        if count != words_to_find.count(word):
            linear_passed = False
        print(f"Linear: '{word}' count: {count}")
    linear_end = time.time()
    if linear_passed:
        print("Linear unit test: passed")
    else:
        print("Linear unit test: failed")
    print(f"Linear search took {linear_end - linear_start} seconds")
    print("")


def binary_test(text, words_to_find):
    # Test binary counting method
    print("Binary Test:")
    binary_start = time.time()
    binary_root = binary_setup(text)
    binary_passed = True
    for word in words_to_find:
        count = binary_count(word, binary_root)
        if count != words_to_find.count(word):
            binary_passed = False
        print(f"Binary: '{word}' count: {count}")
    binary_end = time.time()
    if binary_passed:
        print("Binary unit test: passed")
    else:
        print("Binary unit test: failed")
    print(f"Binary search took {binary_end - binary_start} seconds")
    print("")


def additional_performance_test():
    # Test performance with small text
    small_text = "This is a small line of text with repeated words text text."
    small_words_to_find = ["text", "line", "small"]

    print("\nAdditional Performance Test:")
    small_linear_start = time.time()
    small_linear_word_counts = linear_setup(small_text)
    for word in small_words_to_find:
        count = linear_count(word, small_linear_word_counts)
        print(f"Linear: '{word}' count: {count}")
    small_linear_end = time.time()
    print(f"Linear search for small text took {small_linear_end - small_linear_start} seconds")

    small_binary_start = time.time()
    small_binary_root = binary_setup(small_text)
    for word in small_words_to_find:
        count = binary_count(word, small_binary_root)
        print(f"Binary: '{word}' count: {count}")
    small_binary_end = time.time()
    print(f"Binary search for small text took {small_binary_end - small_binary_start} seconds")


def large_text_test():
    # Test performance with large text
    large_text = "word " * 10000
    large_words_to_find = ["word"]
    print("\nLarge Text Test:")
    large_linear_word_counts = linear_setup(large_text)
    for word in large_words_to_find:
        count = linear_count(word, large_linear_word_counts)
        if count == 10000:
            print("Test passed")
        else:
            print(f"Linear: '{word}' count: {count}")
            break

    large_binary_root = binary_setup(large_text)
    for word in large_words_to_find:
        count = binary_count(word, large_binary_root)
        if count == 10000:
            print("Test passed")
        else:
            print(f"Binary: '{word}' count: {count}")
            break

def empty_text_test():
    # Test handling of empty text
    empty_text = ""
    words_to_find = ["word"]
    print("\nEmpty Text Test:")
    empty_linear_word_counts = linear_setup(empty_text)
    for word in words_to_find:
        count = linear_count(word, empty_linear_word_counts)
        if count == 0:
            print("Test passed")
        else:
            print(f"Linear: '{word}' count: {count}")
            break

    empty_binary_root = binary_setup(empty_text)
    for word in words_to_find:
        count = binary_count(word, empty_binary_root)
        if count == 0:
            print("Test passed")
        else:
            print(f"Binary: '{word}' count: {count}")
            break



if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python script.py <text_file>")
        sys.exit(1)

    file_path = sys.argv[1]
    text = read_text_from_file(file_path)

    words_to_find = ["text", "document", "linear", "binary", "word"]

    linear_test(text, words_to_find)
    binary_test(text, words_to_find)
    additional_performance_test()
    large_text_test()
    empty_text_test()
