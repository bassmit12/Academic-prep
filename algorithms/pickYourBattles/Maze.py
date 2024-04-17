import unittest
from collections import deque
import timeit
import matplotlib.pyplot as plt


def find_shortest_path(maze, start_position):
    num_rows, num_columns = len(maze), len(maze[0])
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]  # Up, Down, Left, Right
    queue = deque([(start_position[0], start_position[1], 0)])  # (row_index, column_index, steps_taken)
    visited_positions = set()
    visited_positions.add((start_position[0], start_position[1]))

    while queue:
        current_row, current_column, steps_taken = queue.popleft()

        # Exit found
        if maze[current_row][current_column] == 2:
            return trace_back_path(maze, start_position, (current_row, current_column))

        # Check adjacent cells
        for row_offset, column_offset in directions:
            next_row, next_column = current_row + row_offset, current_column + column_offset
            if 0 <= next_row < num_rows and 0 <= next_column < num_columns:
                if (next_row, next_column) not in visited_positions and maze[next_row][next_column] != 0:
                    visited_positions.add((next_row, next_column))
                    queue.append((next_row, next_column, steps_taken + 1))

    return None  # No path to exit was found

def trace_back_path(maze, start_position, end_position):
    path = []
    current_position = end_position
    while current_position != start_position:
        path.append(current_position)
        current_row, current_column = current_position
        for row_offset, column_offset in [(-1, 0), (1, 0), (0, -1), (0, 1)]:  # Adjacent cells
            next_row, next_column = current_row + row_offset, current_column + column_offset
            if 0 <= next_row < len(maze) and 0 <= next_column < len(maze[0]) and maze[next_row][next_column] == 1:
                if (next_row, next_column) not in path:  # Check if already included to avoid loops
                    current_position = (next_row, next_column)
                    break
    path.append(start_position)  # Include start position in the path
    path.reverse()  # Reverse to show path from start to end

    # Mark the path in the maze
    for row, column in path:
        maze[row][column] = 3  # 3 could represent the path visually

    return maze

def print_maze(maze):
    green = '\033[92m'  # ANSI color code for green
    reset = '\033[0m'   # ANSI reset code to return to default text color
    for row in maze:
        for cell in row:
            if cell == 3:
                print(f"{green}3{reset}", end=' ')
            else:
                print(f"{cell}", end=' ')
        print()

class TestMazeSolver(unittest.TestCase):

    def test_path_found(self):
        maze = [
            [0, 0, 1, 0, 0],
            [0, 0, 1, 1, 0],
            [0, 0, 0, 2, 0]
        ]
        start_position = (0, 2)
        result = find_shortest_path(maze, start_position)
        expected = [
            [0, 0, 3, 0, 0],
            [0, 0, 3, 3, 0],
            [0, 0, 0, 3, 0]
        ]
        self.assertEqual(result, expected)

    def test_no_path_found(self):
        maze = [
            [0, 0, 1, 0, 0],
            [0, 0, 1, 0, 0],
            [0, 0, 0, 2, 0]
        ]
        start_position = (0, 2)
        result = find_shortest_path(maze, start_position)
        self.assertIsNone(result)

    def test_small_maze(self):
        maze = [
            [1, 2]
        ]
        start_position = (0, 0)
        result = find_shortest_path(maze, start_position)
        expected = [
            [3, 3]
        ]
        self.assertEqual(result, expected)

def setup_maze(size, path_length):
    # Create a size x size maze with a diagonal path from top-left to bottom-right
    maze = [[0] * size for _ in range(size)]
    for i in range(min(size, path_length)):
        maze[i][i] = 1
    maze[size-1][size-1] = 2  # Place the exit at the last cell of the diagonal
    return maze

def performance_test(maze_size, path_length, number_of_runs=10):
    # Move the maze setup inside the setup_code to ensure it is recognized
    setup_code = f'''
from __main__ import find_shortest_path
maze = [[0] * {maze_size} for _ in range({maze_size})]
for i in range(min({maze_size}, {path_length})):
    maze[i][i] = 1
maze[{maze_size}-1][{maze_size}-1] = 2  # Place the exit at the last cell of the diagonal
start_position = (0, 0)
'''
    
    test_code = 'find_shortest_path(maze, start_position)'

    # Use timeit.repeat to run the test multiple times and gather results
    times = timeit.repeat(setup=setup_code, stmt=test_code, number=1, repeat=number_of_runs, globals=globals())

    # Calculate the average execution time
    average_time = sum(times) / len(times)
    print(f"Average execution time for {maze_size}x{maze_size} maze over {number_of_runs} runs: {average_time:.2e} seconds")


if __name__ == "__main__":
    unittest.main(exit=False)  # Run unit tests without exiting the Python interpreter
    
    # Performance testing
    performance_test(10, 10)  
    performance_test(100, 100)
    performance_test(1000, 1000)  
    performance_test(10000, 10000)  
    
    maze = [
        [0, 0, 1, 0, 0],
        [0, 0, 1, 1, 0],
        [1, 1, 1, 1, 1],  
        [0, 0, 0, 2, 0]
    ]
    start_position = (0, 2)
    found_path = find_shortest_path(maze, start_position)
    if found_path:
        print_maze(found_path)
    else:
        print("No path found")
