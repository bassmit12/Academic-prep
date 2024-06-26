import numpy as np
import matplotlib.pyplot as plt
import networkx as nx

def create_graph():
    n = int(input("Enter the number of vertices in the graph: "))
    p = float(input("Enter the probability of an edge between any two vertices (0 to 1): "))
    G = nx.Graph()
    G.add_nodes_from(range(n))
    for i in range(n):
        for j in range(i + 1, n):
            if np.random.random() < p:
                G.add_edge(i, j)
    return G

def ensure_connectivity(G):
    if not nx.is_connected(G):
        components = list(nx.connected_components(G))
        for i in range(len(components) - 1):
            G.add_edge(list(components[i])[-1], list(components[i+1])[0])
        print("Edges were added to ensure the graph is connected.")
    else:
        print("The graph is already connected.")

def display_graph(G):
    pos = nx.spring_layout(G)
    color_map = []
    for node in G:
        if len(G[node]) == 0:
            color_map.append('red')  # Isolated vertices
        elif len(G[node]) == 1:
            color_map.append('blue')  # Pendant vertices
        else:
            color_map.append('green')  # All other vertices
    
    plt.figure(figsize=(8, 8))
    nx.draw(G, pos, with_labels=True, node_color=color_map, edge_color='k', node_size=700, font_size=16)
    plt.title("Graph Visualization with Kernelization")
    plt.show()

    print("Adjacency Matrix:")
    print(nx.adjacency_matrix(G).todense())

G = create_graph()
ensure_connectivity(G)
display_graph(G)
