class GridMDP:
    def __init__(self, grid_size=8, start_state=(0, 0), terminal_state=(7, 7), step_reward=-1, terminal_reward=100):
        self.grid_size = grid_size
        self.start_state = start_state
        self.terminal_state = terminal_state
        self.step_reward = step_reward
        self.terminal_reward = terminal_reward
        self.states = [(i, j) for i in range(grid_size) for j in range(grid_size)]
        self.actions = ['up', 'down', 'left', 'right']

    def is_terminal(self, state):
        return state == self.terminal_state

    def get_possible_actions(self, state):
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
        if self.is_terminal(state):
            return 0
        if next_state == self.terminal_state:
            return self.terminal_reward
        return self.step_reward

# Example usage:
start_state = (0, 0)
terminal_state = (7, 7)
mdp = GridMDP(start_state=start_state, terminal_state=terminal_state)

#print("MDP States:")
#print(mdp.states)

#print("\nPossible actions from state (0, 0):")
#print(mdp.get_possible_actions((0, 0)))

#print("\nTransition from state (0, 0) taking action 'down':")
#print(mdp.get_transition((0, 0), 'down'))

#print("\nReward for moving from state (0, 0) to (1, 0) taking action 'down':")
#print(mdp.get_reward((0, 0), 'down', (1, 0)))

