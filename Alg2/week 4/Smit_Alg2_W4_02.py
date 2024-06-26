import numpy as np
import matplotlib.pyplot as plt
import networkx as nx

# Function to create a graph based on number of vertices and edge probability
def create_graph(n, p):
    G = nx.Graph()
    G.add_nodes_from(range(n))
    for i in range(n):
        for j in range(i + 1, n):
            if np.random.random() < p:
                G.add_edge(i, j)
    return G

# Function to ensure at least two neighbors per vertex and graph connectivity
def ensure_two_neighbors(G):
    for node in list(G.nodes):
        while len(G[node]) < 2:
            possible_nodes = set(G.nodes) - set(G[node]) - {node}
            if possible_nodes:
                G.add_edge(node, np.random.choice(list(possible_nodes)))
            else:
                break
    ensure_connectivity(G)

def ensure_connectivity(G):
    if not nx.is_connected(G):
        components = list(nx.connected_components(G))
        for i in range(len(components) - 1):
            G.add_edge(list(components[i])[-1], list(components[i+1])[0])

# Function to display the graph
def display_graph(G, title):
    pos = nx.spring_layout(G)
    plt.figure(figsize=(8, 8))
    nx.draw(G, pos, with_labels=True, node_color='orange', edge_color='black', node_size=500, font_size=16)
    plt.title(title)
    plt.show()

# Smart vertex cover using backtracking
def smart_vertex_cover(G):
    best_cover = list(G.nodes)
    def backtrack(current_cover, nodes, index):
        if len(current_cover) >= len(best_cover):
            return
        if all(edge[0] in current_cover or edge[1] in current_cover for edge in G.edges):
            if len(current_cover) < len(best_cover):
                best_cover[:] = current_cover
            return
        if index >= len(nodes):
            return
        backtrack(current_cover + [nodes[index]], nodes, index + 1)
        if not all(neighbor in current_cover for neighbor in G[nodes[index]]):
            new_cover = list(current_cover)
            for neighbor in G[nodes[index]]:
                if neighbor not in new_cover:
                    new_cover.append(neighbor)
            backtrack(new_cover, nodes, index + 1)

    sorted_nodes = sorted(G.nodes(), key=lambda x: len(G[x]), reverse=True)
    backtrack([], sorted_nodes, 0)
    return best_cover

# Graph parameters
graph_parameters = [
    (10, 0.3),  # Small graph, low probability
    (15, 0.4),  # Medium graph, medium probability
    (20, 0.5)   # Larger graph, higher probability
]

# Process each graph
for i, (n, p) in enumerate(graph_parameters, start=1):
    G = create_graph(n, p)
    ensure_two_neighbors(G)
    display_graph(G, f'Graph {i} with {n} Vertices and Edge Probability {p}')
    vertex_cover = smart_vertex_cover(G)
    print(f"Vertex Cover for Graph {i}: {vertex_cover}")
