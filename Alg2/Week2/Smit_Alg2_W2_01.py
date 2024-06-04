def check_vertex_cover_and_find_missing(edges, selected_vertices):
    """ Check if the selected vertices cover all edges, and find the first missing edge if not. """
    for edge in edges:
        if not (edge[0] in selected_vertices or edge[1] in selected_vertices):
            return False, edge  # Return False and the first missing edge
    return True, None  # Return True and None if all edges are covered

# Define the edges of the graph
edges = [('A', 'B'), ('B', 'C'), ('C', 'E'), ('C', 'D'), ('D', 'E'), ('B', 'D')]

# Get user input for the vertices
selected_vertices = input("Enter the vertices for checking vertex cover (e.g., A B E): ").split()

# Check if the input vertices satisfy the vertex cover and find any missing edge
is_cover, missing_edge = check_vertex_cover_and_find_missing(edges, selected_vertices)

if is_cover:
    print("Your selection satisfies the vertex cover.")
else:
    print("Your selection does not satisfy the vertex cover. Missing edge:", missing_edge)
