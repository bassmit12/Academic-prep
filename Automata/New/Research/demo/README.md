# Regex Learning Game

## Overview
This interactive game helps users learn regular expressions through engaging challenges. The game presents examples of strings that should match or not match a pattern, and the user tries to create the correct regex that satisfies all examples.

## Research Context
This application is part of a research project investigating whether gamification can enhance the learning and recall of regular expression syntax. By turning abstract regex learning into an engaging, practical experience, we aim to improve comprehension and retention.

## Features
- 10+ pre-built regex challenges with varying difficulty levels
- Interactive command-line interface
- Immediate feedback on regex solutions
- Detailed explanations of regex patterns
- Ability to create and save custom challenges
- Score tracking to measure progress

## How to Play
1. Start the game by compiling and running the RegexGame.java file
2. Choose from the main menu options:
   - Play all challenges in sequence
   - Select a specific challenge
   - Create a new challenge
   - View game instructions
3. For each challenge:
   - Read the description and example strings
   - Enter your regex pattern
   - Get immediate feedback on your solution
   - See a detailed explanation of the correct regex pattern

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- ANTLR 4.13.2 or compatible version

### Installation
1. Ensure you have Java and ANTLR installed
2. Clone or download this repository
3. Navigate to the project directory

### Compilation and Running
1. First, compile the grammar file:
```
java org.antlr.v4.Tool RegexGame.g4 -o gen
```

2. Compile the Java files:
```
javac -cp ".;lib/antlr-4.13.2-complete.jar" gen/RegexGame*.java RegexGame.java -d obj
```

3. Run the game:
```
java -cp "obj;lib/antlr-4.13.2-complete.jar" RegexGame
```

On Unix/Linux/Mac, use colons instead of semicolons in the classpath:
```
java -cp "obj:lib/antlr-4.13.2-complete.jar" RegexGame
```

## Challenge Format
The game uses a custom format for challenge files with the .rgx extension. Each file contains:
- A CHALLENGE section with difficulty, description, and sample strings
- A SOLUTION section with the correct regex and explanation

You can create your own challenges through the game interface or by directly editing .rgx files.

## Research Outcomes
This game is designed to evaluate how interactive learning affects regex comprehension. If you're using this as part of a research study, consider:
- Tracking time spent on each challenge
- Measuring accuracy rates
- Collecting qualitative feedback on the learning experience
- Comparing results with traditional learning methods

## License
This project is open-source and free for educational and research purposes.