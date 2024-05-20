import numpy as np

class MDP:
    def __init__(self, states, actions, transition_probabilities, rewards, discount_factor=0.9):
        self.states = states
        self.actions = actions
        self.transition_probabilities = transition_probabilities  # A dict of dicts of dicts: P(s'|s,a)
        self.rewards = rewards  # A dict of dicts: R(s,a)
        self.discount_factor = discount_factor

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

# Example usage
states = ['s1', 's2']
actions = ['a1', 'a2']
transition_probabilities = {
    's1': {
        'a1': {'s1': 0.7, 's2': 0.3},
        'a2': {'s1': 0.4, 's2': 0.6}
    },
    's2': {
        'a1': {'s1': 0.8, 's2': 0.2},
        'a2': {'s1': 0.5, 's2': 0.5}
    }
}
rewards = {
    's1': {'a1': 10, 'a2': -1},
    's2': {'a1': 1, 'a2': 5}
}
mdp = MDP(states, actions, transition_probabilities, rewards)
policy, value_function = mdp.policy_iteration()
print("Optimal Policy:", policy)
print("Value Function:", value_function)
