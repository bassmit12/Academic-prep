import numpy as np
import random

class MDP:
    def __init__(self, grid_height, grid_width, discount_factor, slippery_p=0.0, cost_of_living=0.0):
        """
        Initialize the MDP.
        :param grid_height: Number of rows in the grid.
        :param grid_width: Number of columns in the grid.
        :param discount_factor: Discount factor for future rewards.
        :param slippery_p: Probability of slipping.
        :param cost_of_living: Cost of living penalty.
        """
        self.grid_height = grid_height
        self.grid_width = grid_width
        self.states = self.generate_states()
        self.actions = ['left', 'right', 'up', 'down']
        self.transition_matrix = self.generate_transitions(slippery_p)
        self.rewards = self.generate_rewards(cost_of_living)
        self.discount_factor = discount_factor
        self.value_table = {state: 0 for state in self.states}
        self.policy = {state: random.choice(self.actions) for state in self.states}

    def generate_states(self):
        return [f'S{i}' for i in range(self.grid_height * self.grid_width)]

    def generate_transitions(self, slippery_p):
        transitions = {}
        for state in self.states:
            state_num = int(state[1:])
            transitions[state] = {}
            for action in self.actions:
                next_state_num = self.get_next_state(state_num, action)
                if next_state_num is not None:
                    next_state = f'S{next_state_num}'
                    if slippery_p > 0:
                        transitions[state][action] = [(1 - slippery_p, next_state), (slippery_p, state)]
                    else:
                        transitions[state][action] = [(1.0, next_state)]
                else:
                    transitions[state][action] = [(1.0, state)]
        return transitions

    def get_next_state(self, current_state, action):
        row, col = divmod(current_state, self.grid_width)
        if action == 'left':
            col -= 1
        elif action == 'right':
            col += 1
        elif action == 'up':
            row -= 1
        elif action == 'down':
            row += 1
        if 0 <= row < self.grid_height and 0 <= col < self.grid_width:
            return row * self.grid_width + col
        return None

    def generate_rewards(self, cost_of_living):
        rewards = {}
        bottom_row_start = (self.grid_height - 1) * self.grid_width
        for i in range(self.grid_width):
            state = f'S{bottom_row_start + i}'
            if i == self.grid_width - 1:
                for action in self.actions:
                    rewards[(state, action, state)] = 1 - cost_of_living
            else:
                for action in self.actions:
                    rewards[(state, action, state)] = -1 - cost_of_living
        return rewards

    def transition(self, state, action):
        """
        Transition to a new state based on the current state and action.
        :param state: Current state.
        :param action: Action taken.
        :return: New state.
        """
        probabilities, next_states = zip(*self.transition_matrix[(state, action)])
        next_state = np.random.choice(next_states, p=probabilities)
        return next_state

    def reward(self, state, action, next_state):
        """
        Get the reward for a transition.
        :param state: Current state.
        :param action: Action taken.
        :param next_state: New state.
        :return: Reward.
        """
        return self.rewards.get((state, action, next_state), -self.cost_of_living)

    def evaluate_policy(self, iterations=1000):
        """
        Evaluate the current policy.
        :param iterations: Number of iterations to run the evaluation.
        """
        for _ in range(iterations):
            new_value_table = {}
            for state in self.states:
                action = self.policy[state]
                value = sum(prob * (self.reward(state, action, next_state) + self.discount_factor * self.value_table[next_state])
                            for prob, next_state in self.transition_matrix[(state, action)])
                new_value_table[state] = value
            self.value_table = new_value_table

    def improve_policy(self):
        """
        Improve the current policy.
        """
        for state in self.states:
            action_values = {}
            for action in self.actions:
                value = sum(prob * (self.reward(state, action, next_state) + self.discount_factor * self.value_table[next_state])
                            for prob, next_state in self.transition_matrix[(state, action)])
                action_values[action] = value
            self.policy[state] = max(action_values, key=action_values.get)

    def policy_iteration(self, iterations=10):
        """
        Perform policy iteration.
        :param iterations: Number of iterations to run policy iteration.
        """
        for _ in range(iterations):
            self.evaluate_policy()
            self.improve_policy()

    def value_iteration(self, iterations=1000):
        """
        Perform value iteration.
        :param iterations: Number of iterations to run value iteration.
        """
        for _ in range(iterations):
            new_value_table = {}
            for state in self.states:
                action_values = []
                for action in self.actions:
                    value = sum(prob * (self.reward(state, action, next_state) + self.discount_factor * self.value_table[next_state])
                                for prob, next_state in self.transition_matrix[(state, action)])
                    action_values.append(value)
                new_value_table[state] = max(action_values)
            self.value_table = new_value_table
        # Update the policy based on the new value table
        self.improve_policy()


# Example usage with a 3x5 grid:

grid_height = 3
grid_width = 5
discount_factor = 0.9
slippery_p = 0.1
cost_of_living = 0.05

mdp = MDP(grid_height, grid_width, discount_factor, slippery_p, cost_of_living)
mdp.policy_iteration()
print("Optimal Policy:")
print(mdp.policy)
print("Value Table:")
print(mdp.value_table)
