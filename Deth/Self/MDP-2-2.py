import numpy as np
import matplotlib.pyplot as plt
from matplotlib.patches import FancyArrowPatch

class GridMDP:
    def __init__(self, num_rows, num_cols, slip_prob, cost_of_living, terminal_states, discount_factor=0.9, start_state=(0, 0)):
        self.num_rows = num_rows
        self.num_cols = num_cols
        self.states = [(r, c) for r in range(num_rows) for c in range(num_cols)]
        self.terminal_states = terminal_states  # Terminal states should be a dictionary with (row, col) as keys and rewards as values
        self.actions = ['right', 'left', 'up', 'down']
        self.slip_prob = slip_prob
        self.cost_of_living = cost_of_living
        self.discount_factor = discount_factor
        self.start_state = start_state

        self.transition_probabilities = self.build_transition_probabilities()
        self.rewards = self.build_rewards()

    def build_transition_probabilities(self):
        transition_probabilities = {s: {a: {} for a in self.actions} for s in self.states}
        for (r, c) in self.states:
            if (r, c) not in self.terminal_states:
                for (dr, dc), action in [((0, 1), 'right'), ((0, -1), 'left'), ((-1, 0), 'up'), ((1, 0), 'down')]:
                    new_r, new_c = r + dr, c + dc
                    if 0 <= new_r < self.num_rows and 0 <= new_c < self.num_cols:
                        transition_probabilities[(r, c)][action][(r, c)] = self.slip_prob
                        transition_probabilities[(r, c)][action][(new_r, new_c)] = 1 - self.slip_prob
                    else:
                        transition_probabilities[(r, c)][action][(r, c)] = 1.0

        for terminal_state in self.terminal_states:
            for action in self.actions:
                transition_probabilities[terminal_state][action][terminal_state] = 1.0  # Terminal state

        return transition_probabilities

    def build_rewards(self):
        rewards = {s: {a: self.cost_of_living for a in self.actions} for s in self.states}
        for terminal_state, reward in self.terminal_states.items():
            for action in self.actions:
                rewards[terminal_state][action] = reward
        return rewards

    def get_transition_prob(self, state, action, next_state):
        return self.transition_probabilities[state][action].get(next_state, 0)

    def get_reward(self, state, action):
        return self.rewards[state].get(action, 0)

    def policy_evaluation(self, policy, tol=1e-6):
        value_function = {s: 0 for s in self.states}
        while True:
            delta = 0
            for s in self.states:
                v = value_function[s]
                action = policy[s]
                value_function[s] = sum(
                    self.get_transition_prob(s, action, next_s) *
                    (self.get_reward(s, action) + self.discount_factor * value_function[next_s])
                    for next_s in self.states
                )
                delta = max(delta, abs(v - value_function[s]))
            if delta < tol:
                break
        return value_function

    def policy_iteration(self, tol=1e-6):
        policy = {s: np.random.choice(self.actions) for s in self.states}
        while True:
            value_function = self.policy_evaluation(policy, tol)
            policy_stable = True
            for s in self.states:
                old_action = policy[s]
                policy[s] = max(
                    self.actions,
                    key=lambda a: sum(
                        self.get_transition_prob(s, a, next_s) *
                        (self.get_reward(s, a) + self.discount_factor * value_function[next_s])
                        for next_s in self.states
                    )
                )
                if old_action != policy[s]:
                    policy_stable = False
            if policy_stable:
                break
        return policy, value_function

    def visualize_policy(self, policy):
        action_map = {'right': (0, 0.3), 'left': (0, -0.3), 'up': (-0.3, 0), 'down': (0.3, 0)}
        fig, ax = plt.subplots(figsize=(self.num_cols + 1, self.num_rows + 1))
        ax.set_xlim(-0.5, self.num_cols - 0.5)
        ax.set_ylim(-0.5, self.num_rows - 0.5)
        ax.set_xticks(np.arange(-0.5, self.num_cols, 1))
        ax.set_yticks(np.arange(-0.5, self.num_rows, 1))
        ax.grid(True)

        # Draw arrows for each state according to the policy
        for r in range(self.num_rows):
            for c in range(self.num_cols):
                state = (r, c)
                if state in self.terminal_states:
                    reward = self.terminal_states[state]
                    color = 'green' if reward > 0 else 'red'
                    ax.add_patch(plt.Rectangle((c - 0.5, r - 0.5), 1, 1, color=color, alpha=0.3))
                    ax.text(c, r, f'T\n{reward}', ha='center', va='center', fontsize=12, fontweight='bold')
                else:
                    dr, dc = action_map[policy[state]]
                    arrow = FancyArrowPatch((c, r), (c + dc, r + dr), mutation_scale=20, color='blue', lw=2)
                    ax.add_patch(arrow)

        # Add row and column numbers
        for r in range(self.num_rows):
            ax.text(-1, r, f'{r}', ha='center', va='center', fontsize=12, fontweight='bold')
        for c in range(self.num_cols):
            ax.text(c, -1, f'{c}', ha='center', va='center', fontsize=12, fontweight='bold')

        # Draw the optimal path from the start state to a terminal state
        current_state = self.start_state
        while current_state not in self.terminal_states:
            r, c = current_state
            dr, dc = action_map[policy[current_state]]
            next_state = (r + int(np.sign(dr)), c + int(np.sign(dc)))
            ax.arrow(c, r, np.sign(dc)*0.8, np.sign(dr)*0.8, head_width=0.2, head_length=0.2, fc='red', ec='red')
            current_state = next_state

        ax.set_xticklabels([])
        ax.set_yticklabels([])
        plt.gca().invert_yaxis()
        plt.show()

# Example usage with parameters
num_rows = 3  # Number of rows
num_cols = 5  # Number of columns
slip_prob = 0.2  # Probability of slipping
cost_of_living = -0.1  # Cost of living
start_state = (2, 0)  # Define the starting state
terminal_states = {
    (2, 1): -1,
    (2, 2): -1,
    (2, 3): -1,
    (2, 4): 1}  # Custom terminal states with rewards

grid_mdp = GridMDP(num_rows, num_cols, slip_prob, cost_of_living, terminal_states, start_state=start_state)
policy, value_function = grid_mdp.policy_iteration()
print("Optimal Policy:", policy)
print("Value Function:", value_function)
print("Starting State:", grid_mdp.start_state)

# Visualize the policy
grid_mdp.visualize_policy(policy)
