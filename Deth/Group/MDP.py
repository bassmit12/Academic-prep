import matplotlib.pyplot as plt
import numpy as np

class GridMDP:
    def __init__(self, grid_size=8, start_state=(0, 0), terminal_states=[(7, 7)], step_reward=-1, terminal_reward=100):
        self.grid_size = grid_size
        self.start_state = start_state
        self.terminal_states = terminal_states
        self.step_reward = step_reward
        self.terminal_reward = terminal_reward
        self.states = [(i, j) for i in range(grid_size) for j in range(grid_size)]
        self.actions = ['up', 'down', 'left', 'right']

    def is_terminal(self, state):
        return state in self.terminal_states

    def get_possible_actions(self, state):
        if self.is_terminal(state):
            return []
        actions = []
        i, j = state
        if i > 0:
            actions.append('up')
        if i < self.grid_size - 1:
            actions.append('down')
        if j > 0:
            actions.append('left')
        if j < self.grid_size - 1:
            actions.append('right')
        return actions

    def get_transition(self, state, action):
        if self.is_terminal(state):
            return [(state, 1.0)]

        i, j = state
        if action == 'up':
            next_state = (i - 1, j)
        elif action == 'down':
            next_state = (i + 1, j)
        elif action == 'left':
            next_state = (i, j - 1)
        elif action == 'right':
            next_state = (i, j + 1)
        else:
            raise ValueError("Invalid action")

        return [(next_state, 1.0)]

    def get_reward(self, state, action, next_state):
        if self.is_terminal(next_state):
            return self.terminal_reward
        return self.step_reward

    def visualize_grid(self):
        fig, ax = plt.subplots()
        ax.set_xlim(-0.5, self.grid_size - 0.5)
        ax.set_ylim(-0.5, self.grid_size - 0.5)
        ax.set_xticks(np.arange(-0.5, self.grid_size, 1))
        ax.set_yticks(np.arange(-0.5, self.grid_size, 1))
        ax.set_xticklabels([])
        ax.set_yticklabels([])
        ax.grid(which="both")

        # Mark start state
        start_x, start_y = self.start_state
        ax.add_patch(plt.Rectangle((start_y - 0.5, start_x - 0.5), 1, 1, fill=True, color="green", alpha=0.5))

        # Mark terminal states
        for (term_x, term_y) in self.terminal_states:
            ax.add_patch(plt.Rectangle((term_y - 0.5, term_x - 0.5), 1, 1, fill=True, color="red", alpha=0.5))

        # Display the plot
        plt.gca().invert_yaxis()  # Invert y-axis to match grid indexing
        plt.show()

# Example usage:
start_state = (0, 0)
terminal_states = [(7, 7), (3, 3), (6, 1)]  # Multiple terminal states
mdp = GridMDP(start_state=start_state, terminal_states=terminal_states)

print("MDP States:")
print(mdp.states)

print("\nPossible actions from state (0, 0):")
print(mdp.get_possible_actions((0, 0)))

print("\nTransition from state (0, 0) taking action 'down':")
print(mdp.get_transition((0, 0), 'down'))

print("\nReward for moving from state (0, 0) to (1, 0) taking action 'down':")
print(mdp.get_reward((0, 0), 'down', (1, 0)))

print("\nReward for moving from state (3, 2) to (3, 3) taking action 'right':")
print(mdp.get_reward((3, 2), 'right', (3, 3)))

# Visualize the grid
mdp.visualize_grid()
