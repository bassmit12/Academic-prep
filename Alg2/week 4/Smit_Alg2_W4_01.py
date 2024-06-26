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
        print("Edges were added to ensure the graph is connected.")
    else:
        print("The graph is already connected.")

def display_graph(G):
    pos = nx.spring_layout(G)
    color_map = ['green' if len(G[node]) > 1 else 'blue' for node in G]
    plt.figure(figsize=(8, 8))
    nx.draw(G, pos, with_labels=True, node_color=color_map, edge_color='k', node_size=700, font_size=16)
    plt.title("Graph Visualization with Kernelization")
    plt.show()

def smart_vertex_cover(G):
    best_cover = list(G.nodes)  # Start with a trivial vertex cover: all nodes
    def backtrack(current_cover, nodes, index):
        if len(current_cover) >= len(best_cover):
            return  # Prune search if the current cover is not smaller
        if all(edge[0] in current_cover or edge[1] in current_cover for edge in G.edges):
            if len(current_cover) < len(best_cover):
                best_cover[:] = current_cover
            return
        if index >= len(nodes):
            return
        # Include this node
        backtrack(current_cover + [nodes[index]], nodes, index + 1)
        # Exclude this node and include all its neighbors
        if not all(neighbor in current_cover for neighbor in G[nodes[index]]):
            new_cover = list(current_cover)
            for neighbor in G[nodes[index]]:
                if neighbor not in new_cover:
                    new_cover.append(neighbor)
            backtrack(new_cover, nodes, index + 1)

    sorted_nodes = sorted(G.nodes(), key=lambda x: len(G[x]), reverse=True)
    backtrack([], sorted_nodes, 0)
    return best_cover

G = create_graph()
ensure_two_neighbors(G)
display_graph(G)
vertex_cover = smart_vertex_cover(G)
print("Vertex Cover Found:", vertex_cover)
