import itertools

def check_vertex_cover(edges, selected_vertices):
    """ Check if the selected vertices cover all edges. """
    for edge in edges:
        if not (edge[0] in selected_vertices or edge[1] in selected_vertices):
            return False
    return True

def find_minimum_vertex_cover(vertices, edges, max_size):
    """ Find the minimum vertex cover by checking all combinations up to max_size vertices. """
    for r in range(1, max_size + 1):
        for combination in itertools.combinations(vertices, r):
            if check_vertex_cover(edges, combination):
                return combination
    return None

# Define the edges of the graph
edges = [('A', 'B'), ('B', 'C'), ('C', 'E'), ('C', 'D'), ('D', 'E'), ('B', 'D')]
vertices = ['A', 'B', 'C', 'D', 'E']

X = 3

# Finding the minimum vertex cover
min_vertex_cover = find_minimum_vertex_cover(vertices, edges, X)

if min_vertex_cover:
    print("A minimum vertex cover found:", min_vertex_cover)
else:
    print("No vertex cover found within the defined size limit.")
