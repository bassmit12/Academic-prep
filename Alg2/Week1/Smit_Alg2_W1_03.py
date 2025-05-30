import numpy as np
import matplotlib.pyplot as plt
import networkx as nx

def create_graph():
    # Get the number of vertices from the user
    n = int(input("Enter the number of vertices in the graph: "))
    
    # Get the probability of an edge between any two vertices
    p = float(input("Enter the probability of an edge between any two vertices (0 to 1): "))
    
    # Create a graph using NetworkX
    G = nx.Graph()
    
    # Add vertices to the graph
    G.add_nodes_from(range(n))
    
    # Add edges based on the probability p
    for i in range(n):
        for j in range(i + 1, n):
            if np.random.random() < p:
                G.add_edge(i, j)
    
    return G

def ensure_connectivity(G):
    # Check if the graph is connected
    if not nx.is_connected(G):
        # Get all connected components
        components = list(nx.connected_components(G))
        # Connect each component
        for i in range(len(components) - 1):
            # Add an edge between last node of current component and first node of the next
            G.add_edge(list(components[i])[-1], list(components[i+1])[0])
        print("Edges were added to ensure the graph is connected.")
    else:
        print("The graph is already connected.")

def display_graph(G):
    # Draw the graph
    plt.figure(figsize=(8, 8))
    pos = nx.spring_layout(G)  # positions for all nodes
    nx.draw(G, pos, with_labels=True, node_color='skyblue', edge_color='k', node_size=700, font_size=16)
    plt.title("Graph Visualization")
    plt.show()

    # Print the adjacency matrix
    adjacency_matrix = nx.adjacency_matrix(G).todense()
    print("Adjacency Matrix:")
    print(adjacency_matrix)

# Create and display the graph
G = create_graph()
ensure_connectivity(G)
display_graph(G)
