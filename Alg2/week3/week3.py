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
            # Add an edge between the last node of the current component and the first node of the next
            G.add_edge(list(components[i])[-1], list(components[i+1])[0])
        print("Edges were added to ensure the graph is connected.")
    else:
        print("The graph is already connected.")

def display_graph(G):
    # Layout for the nodes
    pos = nx.spring_layout(G)

    # Identify special vertices
    isolated = list(nx.isolates(G))
    pendant = [n for n in G.nodes() if G.degree(n) == 1]
    tops = set()
    for n in pendant:
        neighbors = list(G.neighbors(n))
        if neighbors:
            tops.update(neighbors)

    # Draw the graph
    plt.figure(figsize=(8, 8))
    # Draw regular nodes
    nx.draw_networkx_nodes(G, pos, nodelist=set(G.nodes()) - set(isolated) - set(pendant) - tops, node_color='skyblue')
    # Draw isolated nodes
    nx.draw_networkx_nodes(G, pos, nodelist=isolated, node_color='red')
    # Draw pendant nodes
    nx.draw_networkx_nodes(G, pos, nodelist=pendant, node_color='green')
    # Draw tops nodes
    nx.draw_networkx_nodes(G, pos, nodelist=tops, node_color='gold')

    nx.draw_networkx_edges(G, pos)
    nx.draw_networkx_labels(G, pos)
    plt.title("Graph Visualization with Kernelization")
    plt.show()

    # Print the adjacency matrix
    adjacency_matrix = nx.adjacency_matrix(G).todense()
    print("Adjacency Matrix:")
    print(adjacency_matrix)

# Main execution
G = create_graph()
ensure_connectivity(G)
display_graph(G)
