import numpy as np

class LinearMDP:
    def __init__(self, num_states, slip_prob, cost_of_living, terminal_states, discount_factor=0.9, start_state='S1'):
        self.states = [f'S{i}' for i in range(num_states)]
        self.terminal_states = terminal_states  # Terminal states should be a dictionary with states as keys and rewards as values
        self.actions = ['right']
        self.slip_prob = slip_prob
        self.cost_of_living = cost_of_living
        self.discount_factor = discount_factor
        self.start_state = start_state

        self.transition_probabilities = self.build_transition_probabilities()
        self.rewards = self.build_rewards()

    def build_transition_probabilities(self):
        transition_probabilities = {s: {'right': {}} for s in self.states}
        for i in range(1, len(self.states) - 1):
            if self.states[i] not in self.terminal_states:
                transition_probabilities[self.states[i]]['right'][self.states[i]] = self.slip_prob
                transition_probabilities[self.states[i]]['right'][self.states[i + 1]] = 1 - self.slip_prob

        for terminal_state in self.terminal_states:
            transition_probabilities[terminal_state]['right'][terminal_state] = 1.0  # Terminal state

        return transition_probabilities

    def build_rewards(self):
        rewards = {s: {'right': self.cost_of_living} for s in self.states}
        for terminal_state, reward in self.terminal_states.items():
            rewards[terminal_state]['right'] = reward
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

# Example usage with parameters
num_states = 5  # Total states including terminal states
slip_prob = 0.2  # Probability of slipping
cost_of_living = -0.1  # Cost of living
start_state = 'S1'  # Define the starting state
terminal_states = {'S0': -1, 'S4': 1}  # Custom terminal states with rewards

linear_mdp = LinearMDP(num_states, slip_prob, cost_of_living, terminal_states, start_state=start_state)
policy, value_function = linear_mdp.policy_iteration()
print("Optimal Policy:", policy)
print("Value Function:", value_function)
print("Starting State:", linear_mdp.start_state)
