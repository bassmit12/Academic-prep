
import random
import time

# Time complexity of O(1) since there are no loops
def max_index(seq, i, j):
    # Compare elements at indices i and j, return the index of the maximum
    if seq[i] >= seq[j]:
        return i
    else:
        return j

# Time complexity of O(i) as there is a loop but the only thing that matters is the index of the list
def reverse(seq, i):
    start = 0
    end = i
    # Swap elements from the start and end of the prefix until they meet in the middle
    while start < end:
        seq[start], seq[end] = seq[end], seq[start]
        start += 1
        end -= 1

# Time complexity is O(n^2) as there is a nested loop
def reverse_sort(seq):
    # Iterate over the sequence backwards, ignoring the last element
    for i in range(len(seq)-1, 0, -1):
        # Find the index of the maximum element within the current prefix
        max_idex = max(range(i+1), key=lambda j: seq[j])
        # If the maximum is not at the end of the prefix, reverse the prefix up to the maximum and the entire prefix
        if max_idex != i:
            reverse(seq, max_idex)
            reverse(seq, i)

def test_max():
    assert max_index([3, 2, 1], 0, 1) == 0
    assert max_index([3, 2, 1], 1, 2) == 1
    assert max_index([3, 2, 1], 0, 2) == 0

def test_reverse():
    seq = [1, 2, 3, 4]
    reverse(seq, 2)
    assert seq == [3, 2, 1, 4]

def test_reverse_sort():
    seq = [4, 2, 1, 3]
    reverse_sort(seq)
    assert seq == [1, 2, 3, 4]
def test_reverse_sort_edge_cases():
    # Test empty sequence
    seq = []
    reverse_sort(seq)
    assert seq == []

    # Test sequence with one element
    seq = [42]
    reverse_sort(seq)
    assert seq == [42]

def test_reverse_sort_extreme_inputs():
    # Test sequence with all elements equal
    seq = [1] * 100
    reverse_sort(seq)
    assert seq == [1] * 100

    # Test sequence already sorted in reverse order
    seq = list(range(100, 0, -1))
    reverse_sort(seq)
    assert seq == list(range(1, 101))

def test_reverse_sort_special_cases():
    # Test sequence with negative integers
    seq = [-3, 0, 2, -1, 4]
    reverse_sort(seq)
    assert seq == [-3, -1, 0, 2, 4]

    # Test sequence with duplicates
    seq = [3, 2, 1, 3, 2, 1]
    reverse_sort(seq)
    assert seq == [1, 1, 2, 2, 3, 3]

    # Test large sequence
    seq = list(range(10000, 0, -1))
    reverse_sort(seq)
    assert seq == list(range(1, 10001))

def performance_test_reverse_sort():
    seq = [random.randint(0, 1000) for _ in range(1000)]

    start_time = time.time()
    reverse_sort(seq)
    duration = time.time() - start_time

    print("Time elapsed for sorting 1000 elements:", duration)

def run_tests():
    test_max()
    test_reverse()
    test_reverse_sort()
    test_reverse_sort_edge_cases()
    test_reverse_sort_extreme_inputs
    test_reverse_sort_special_cases
    performance_test_reverse_sort()

def main():
    discs = [4, 2, 1, 3]
    print("Original sequence:", discs)

    reverse_sort(discs)

    print("Sorted sequence:", discs)

    try:
        run_tests()
        print("All tests passed successfully!")
    except AssertionError as e:
        print("Some tests failed:", e)

if __name__ == "__main__":
    # Time complexity is = O(1) + O(i) + O(n^2) 
    # We take the biggest of the above so the time complexity of the reverse sorting algorithm is O(n^2)
    main()



