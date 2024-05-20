import numpy as np
from math import isclose
import matplotlib.pyplot as plt

class MDP:
    def __init__(self, states, actions, transitions=None, gamma=0.9, eps=1e-6):
        self.states = states
        self.actions = actions
        self.transitions = transitions if transitions else {}
        self.gamma = gamma
        self.eps = eps
        self.current_state = None
        
        self.state_space = self._create_state_space()
        self.action_space = self._create_action_space()
        
    def _create_state_space(self):
        return np.arange(len(self.states))
    
    def _create_action_space(self):
        return np.arange(len(self.actions))
    
    def reset(self):
        self.current_state = self.states[len(self.states)//2]  # Start in the middle (s4)
        return self.current_state
    
    def get_actions(self):
        return self.actions
    
    def step(self, action):
        if self.current_state == 's1' or self.current_state == 's7':
            return self.current_state, 0, True, False, {}

        next_state = self.transitions[self.current_state][action]
        self.current_state = next_state

        if next_state == 's1':
            reward = -1
            terminated = True
        elif next_state == 's7':
            reward = 1
            terminated = True
        else:
            reward = 0
            terminated = False

        truncated = False

        return next_state, reward, terminated, truncated, {}
    
    def _isclose(self, a, b):
        return isclose(a, b, abs_tol=self.eps)

# Define states, actions, and transitions for the specific MDP problem
states = ['s1', 's2', 's3', 's4', 's5', 's6', 's7']
actions = ['left', 'right']

# Transitions
transitions = {
    's1': {'left': 's1', 'right': 's2'},
    's2': {'left': 's1', 'right': 's3'},
    's3': {'left': 's2', 'right': 's4'},
    's4': {'left': 's3', 'right': 's5'},
    's5': {'left': 's4', 'right': 's6'},
    's6': {'left': 's5', 'right': 's7'},
    's7': {'left': 's6', 'right': 's7'}
}

# Simulate episodes and collect rewards
def simulate_episodes(mdp, num_episodes=100):
    episode_rewards = []
    
    for episode in range(num_episodes):
        state = mdp.reset()
        total_reward = 0
        terminated = False
        
        while not terminated:
            action = np.random.choice(mdp.get_actions())  # Random action
            next_state, reward, terminated, truncated, _ = mdp.step(action)
            total_reward += reward
        
        episode_rewards.append(total_reward)
    
    return episode_rewards

# Create MDP instance
mdp = MDP(states, actions, transitions)

# Simulate and plot rewards per episode
rewards = simulate_episodes(mdp)

plt.figure(figsize=(15, 5))
plt.subplot(1, 2, 1)
plt.plot(rewards, label='Total Reward')
plt.title('Rewards per Episode')
plt.xlabel('Episode')
plt.ylabel('Total Reward')
plt.show()
