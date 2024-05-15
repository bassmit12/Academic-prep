import numpy as np
import random

# GPT used https://chat.openai.com/share/74c3bdad-aece-48d4-9758-2015e52da654

class MDP:
    def __init__(self, states, actions, transition_matrix, rewards, discount_factor):
        """
        Initialize the MDP.
        :param states: List of states.
        :param actions: List of actions.
        :param transition_matrix: Dictionary with keys as (state, action) pairs and values as lists of (probability, next_state) tuples.
        :param rewards: Dictionary with keys as (state, action, next_state) and values as rewards.
        :param discount_factor: Discount factor for future rewards.
        """
        self.states = states
        self.actions = actions
        self.transition_matrix = transition_matrix
        self.rewards = rewards
        self.discount_factor = discount_factor
        self.value_table = {state: 0 for state in states}
        self.policy = {state: random.choice(actions) for state in states}

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
        return self.rewards[(state, action, next_state)]

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


# Example usage:

states = ['s1', 's2', 's3']
actions = ['a1', 'a2']
transition_matrix = {
    ('s1', 'a1'): [(0.8, 's1'), (0.2, 's2')],
    ('s1', 'a2'): [(0.5, 's1'), (0.5, 's3')],
    ('s2', 'a1'): [(1.0, 's1')],
    ('s2', 'a2'): [(1.0, 's3')],
    ('s3', 'a1'): [(0.3, 's1'), (0.7, 's2')],
    ('s3', 'a2'): [(0.6, 's2'), (0.4, 's3')]
}
rewards = {
    ('s1', 'a1', 's1'): 5,
    ('s1', 'a1', 's2'): 10,
    ('s1', 'a2', 's1'): -1,
    ('s1', 'a2', 's3'): 2,
    ('s2', 'a1', 's1'): 3,
    ('s2', 'a2', 's3'): 8,
    ('s3', 'a1', 's1'): 4,
    ('s3', 'a1', 's2'): 1,
    ('s3', 'a2', 's2'): 7,
    ('s3', 'a2', 's3'): 0
}
discount_factor = 0.9

mdp = MDP(states, actions, transition_matrix, rewards, discount_factor)
mdp.policy_iteration()
print("Optimal Policy:")
print(mdp.policy)
print("Value Table:")
print(mdp.value_table)
