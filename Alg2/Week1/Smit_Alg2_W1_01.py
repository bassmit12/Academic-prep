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
display_graph(G)
