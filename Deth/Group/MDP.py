import matplotlib.pyplot as plt
import numpy as np

class GridMDP:
    def __init__(self, grid_size=8, start_state=(0, 0), terminal_states=None, slippery_states=None, slip_probability=0.2, exit_states=None, step_reward=-1, terminal_reward=100, exit_reward=50):
        self.grid_size = grid_size
        self.start_state = start_state
        self.terminal_states = terminal_states if terminal_states is not None else []
        self.slippery_states = slippery_states if slippery_states is not None else []
        self.exit_states = exit_states if exit_states is not None else []
        self.slip_probability = slip_probability
        self.step_reward = step_reward
        self.terminal_reward = terminal_reward
        self.exit_reward = exit_reward
        self.states = [(i, j) for i in range(grid_size) for j in range(grid_size)]
        self.actions = ['up', 'down', 'left', 'right']
        self.exit_state = 'exit'  # Special state to signify the agent has exited the grid

    def is_terminal(self, state):
        return state in self.terminal_states

    def is_exit(self, state):
        return state in self.exit_states

    def get_possible_actions(self, state):
        if self.is_terminal(state) or self.is_exit(state):
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
        if self.is_terminal(state) or self.is_exit(state):
            return [(state, 1.0)]

        i, j = state
        intended_next_state = state

        if action == 'up' and i > 0:
            intended_next_state = (i - 1, j)
        elif action == 'down' and i < self.grid_size - 1:
            intended_next_state = (i + 1, j)
        elif action == 'left' and j > 0:
            intended_next_state = (i, j - 1)
        elif action == 'right' and j < self.grid_size - 1:
            intended_next_state = (i, j + 1)

        transitions = []

        if state in self.slippery_states:
            transitions.append((intended_next_state, 1 - self.slip_probability))
            for alt_action in self.actions:
                if alt_action != action:
                    if alt_action == 'up' and i > 0:
                        alt_next_state = (i - 1, j)
                    elif alt_action == 'down' and i < self.grid_size - 1:
                        alt_next_state = (i + 1, j)
                    elif alt_action == 'left' and j > 0:
                        alt_next_state = (i, j - 1)
                    elif alt_action == 'right' and j < self.grid_size - 1:
                        alt_next_state = (i, j + 1)
                    else:
                        continue
                    transitions.append((alt_next_state, self.slip_probability / 3))
        else:
            transitions.append((intended_next_state, 1.0))
        
        # Check if the intended next state is an exit state
        if intended_next_state in self.exit_states:
            transitions = [(self.exit_state, 1.0)]
        
        return transitions

    def get_reward(self, state, action, next_state):
        if self.is_terminal(next_state):
            return self.terminal_reward
        if self.is_exit(next_state):
            return self.exit_reward
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

        # Mark slippery states
        for (slip_x, slip_y) in self.slippery_states:
            ax.add_patch(plt.Rectangle((slip_y - 0.5, slip_x - 0.5), 1, 1, fill=True, color="blue", alpha=0.5))

        # Mark exit states
        for (exit_x, exit_y) in self.exit_states:
            ax.add_patch(plt.Rectangle((exit_y - 0.5, exit_x - 0.5), 1, 1, fill=True, color="yellow", alpha=0.5))

        # Display the plot
        plt.gca().invert_yaxis()  # Invert y-axis to match grid indexing
        plt.show()

# Example usage:
start_state = (0, 0)
terminal_states = [(7, 7), (3, 3), (6, 1)]  # Multiple terminal states
slippery_states = [(2, 2), (5, 5)]  # Slippery states with a chance to slip
exit_states = [(1, 1), (6, 6)]  # Exit states where the agent can leave the grid
mdp = GridMDP(start_state=start_state, terminal_states=terminal_states, slippery_states=slippery_states, exit_states=exit_states)

print("MDP States:")
print(mdp.states)

print("\nPossible actions from state (0, 0):")
print(mdp.get_possible_actions((0, 0)))

print("\nTransition from state (0, 0) taking action 'down':")
print(mdp.get_transition((0, 0), 'down'))

print("\nReward for moving from state (0, 0) to (1, 0) taking action 'down':")
print(mdp.get_reward((0, 0), 'down', (1, 0)))

print("\nTransition from slippery state (2, 2) taking action 'right':")
print(mdp.get_transition((2, 2), 'right'))

print("\nTransition from exit state (1, 1) taking action 'right':")
print(mdp.get_transition((1, 1), 'right'))

# Visualize the grid
mdp.visualize_grid()
