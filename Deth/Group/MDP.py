import matplotlib.pyplot as plt
import numpy as np
from matplotlib.offsetbox import OffsetImage, AnnotationBbox

class GridMDP:
    def __init__(self, grid_size=10, start_state=(0, 0), terminal_states=None, ice_states=None, mud_states=None, dog_states=None, bank_states=None, slip_probability=0, exit_states=None, step_reward=0, terminal_reward=-100, exit_reward=20):
        self.grid_size = grid_size
        self.start_state = start_state
        self.terminal_states = terminal_states if terminal_states is not None else []
        self.ice_states = ice_states if ice_states is not None else []
        self.mud_states = mud_states if mud_states is not None else []
        self.dog_states = dog_states if dog_states is not None else []
        self.bank_states = bank_states if bank_states is not None else []
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
        return state == self.exit_state or state in self.exit_states

    def get_possible_actions(self, state):
        if state == self.exit_state or self.is_terminal(state) or self.is_exit(state):
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

        if state in self.ice_states:
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
        elif state in self.mud_states:
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
        elif state in self.dog_states:
            transitions.append((intended_next_state, 1 - self.slip_probability))
            if self.slip_probability > 0:
                transitions.append((state, self.slip_probability))  # Go back to the same state
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

# Example usage:
start_state = (0, 4)
terminal_states = [(7, 4), (8, 3), (8, 5), (7, 8)]  # Multiple terminal states
ice_states = [(2, 7), (3, 4), (6, 1), (6, 6), (6, 8), (8, 2)]  # Ice states with a chance to slip
mud_states = [(0, 2), (0, 7), (1, 8), (2, 8), (3, 8),(4, 1),(5, 5), (5, 9), (6, 0)]  # Mud states with a chance to slip
dog_states = [(3, 1), (2, 6), (5, 3), (9, 5), (9, 8)]  # Dog states with a chance to slip
bank_states = [(8, 4)]  # Bank states
exit_states = [(4, 0), (6, 9)]  # Exit states where the agent can leave the grid
mdp = GridMDP(start_state=start_state, terminal_states=terminal_states, ice_states=ice_states, mud_states=mud_states, dog_states=dog_states, bank_states=bank_states, exit_states=exit_states)

def visualize_grid(mdp):
    fig, ax = plt.subplots()
    ax.set_xlim(-0.5, mdp.grid_size - 0.5)
    ax.set_ylim(-0.5, mdp.grid_size - 0.5)
    ax.set_xticks(np.arange(-0.5, mdp.grid_size, 1))
    ax.set_yticks(np.arange(-0.5, mdp.grid_size, 1))
    ax.set_xticklabels([])
    ax.set_yticklabels([])
    ax.grid(which="both")

    # Mark start state
    start_x, start_y = mdp.start_state
    ax.add_patch(plt.Rectangle((start_y - 0.5, start_x - 0.5), 1, 1, fill=True, color="green", alpha=0.5))

    # Mark terminal states
    for (term_x, term_y) in mdp.terminal_states:
        term_img = plt.imread('./assets/term.png') 
        imagebox = OffsetImage(term_img, zoom=0.1)
        ab = AnnotationBbox(imagebox, (term_y, term_x), frameon=False)
        ax.add_artist(ab)

    # Mark ice states
    for (slip_x, slip_y) in mdp.ice_states:
        ice_img = plt.imread('./assets/ice.png') 
        imagebox = OffsetImage(ice_img, zoom=0.1)
        ab = AnnotationBbox(imagebox, (slip_y, slip_x), frameon=False)
        ax.add_artist(ab)

    # Mark mud states
    for (mud_x, mud_y) in mdp.mud_states:
        mud_img = plt.imread('./assets/mud.png') 
        imagebox = OffsetImage(mud_img, zoom=0.1)
        ab = AnnotationBbox(imagebox, (mud_y, mud_x), frameon=False)
        ax.add_artist(ab)

    # Mark dog states
    for (dog_x, dog_y) in mdp.dog_states:
        dog_img = plt.imread('./assets/dog.png') 
        imagebox = OffsetImage(dog_img, zoom=0.1)
        ab = AnnotationBbox(imagebox, (dog_y, dog_x), frameon=False)
        ax.add_artist(ab)

    # Mark bank states
    for (bank_x, bank_y) in mdp.bank_states:
        bank_img = plt.imread('./assets/bank.png') 
        imagebox = OffsetImage(bank_img, zoom=0.1)
        ab = AnnotationBbox(imagebox, (bank_y, bank_x), frameon=False)
        ax.add_artist(ab)

    # Mark exit states with tunnel icon
    for (exit_x, exit_y) in mdp.exit_states:
        tunnel_img = plt.imread('./assets/exit.png') 
        imagebox = OffsetImage(tunnel_img, zoom=0.1)
        ab = AnnotationBbox(imagebox, (exit_y, exit_x), frameon=False)
        ax.add_artist(ab)

    # Display the plot
    plt.gca().invert_yaxis()  # Invert y-axis to match grid indexing
    plt.show()

visualize_grid(mdp)
input('Press any key to exit')
