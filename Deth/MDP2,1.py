class MDP:
    def __init__(self, states, actions, transitions, rewards, terminal_states, slippery_p=0.0, cost_of_living=0.0):
        self.states = states
        self.actions = actions
        self.transitions = transitions
        self.rewards = rewards
        self.terminal_states = terminal_states
        self.slippery_p = slippery_p
        self.cost_of_living = cost_of_living

    def transition(self, current_state, action):
        import random
        if random.random() < self.slippery_p:
            # Implement slipping logic: remain in the same state or move unpredictably
            return random.choice([current_state, self.transitions[current_state][action]])
        else:
            return self.transitions[current_state][action]

    def get_reward(self, current_state, action):
        return self.rewards.get((current_state, action), -self.cost_of_living)

    def is_terminal(self, state):
        return state in self.terminal_states

states = ['S0', 'S1', 'S2', 'S3', 'S4', 'S5']
actions = {'left': -1, 'right': 1}
transitions = {
    'S0': {'left': 'S0', 'right': 'S1'},
    'S1': {'left': 'S0', 'right': 'S2'},
    'S2': {'left': 'S1', 'right': 'S3'},
    'S3': {'left': 'S2', 'right': 'S4'},
    'S4': {'left': 'S3', 'right': 'S5'},
    'S5': {'left': 'S4', 'right': 'S5'}
}
rewards = {
    ('S1', 'left'): -1,
    ('S1', 'right'): -1,
    ('S5', 'left'): 1,
    ('S5', 'right'): 1
}
terminal_states = ['S0', 'S5']

# Example of initializing the MDP with slipping and cost parameters
mdp = MDP(states, actions, transitions, rewards, terminal_states, slippery_p=0.1, cost_of_living=0.05)
