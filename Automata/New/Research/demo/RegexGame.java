import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * RegexGame - An interactive game to learn regular expressions
 * 
 * This program implements a game where users can:
 * 1. See example strings that should match or not match a regex pattern
 * 2. Guess the regex pattern that satisfies the examples
 * 3. Check their answer against the solution
 * 4. Get explanations about the regex patterns
 */
public class RegexGame {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String CHALLENGES_DIR = "challenges";
    private static final String DEFAULT_CHALLENGE = "challenges/challenge1.rgx";
    private static int score = 0;
    private static int totalChallenges = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Regex Learning Game!");
        System.out.println("==================================");
        System.out.println("This game will help you learn regular expressions through fun challenges.");
        System.out.println("You'll be shown examples of strings that should match or not match a pattern.");
        System.out.println("Your task is to write the correct regex pattern that satisfies all examples.");
        System.out.println();

        try {
            // Create challenges directory if it doesn't exist
            Files.createDirectories(Paths.get(CHALLENGES_DIR));
            
            // Create sample challenges if they don't exist
            createSampleChallenges();
            
            // Main game loop
            mainMenu();
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void mainMenu() {
        while (true) {
            System.out.println("\nREGEX LEARNING GAME - MAIN MENU");
            System.out.println("1. Play all challenges in sequence");
            System.out.println("2. Select a specific challenge");
            System.out.println("3. Create a new challenge");
            System.out.println("4. View game instructions");
            System.out.println("5. Exit game");
            System.out.print("\nEnter your choice (1-5): ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    playAllChallenges();
                    break;
                case "2":
                    selectChallenge();
                    break;
                case "3":
                    createNewChallenge();
                    break;
                case "4":
                    showInstructions();
                    break;
                case "5":
                    System.out.println("\nThank you for playing the Regex Learning Game!");
                    System.out.println("Your final score: " + score + "/" + totalChallenges);
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void playAllChallenges() {
        try {
            List<Path> challengeFiles = Files.list(Paths.get(CHALLENGES_DIR))
                .filter(path -> path.toString().endsWith(".rgx"))
                .collect(java.util.stream.Collectors.toList());
            
            if (challengeFiles.isEmpty()) {
                System.out.println("No challenges found. Creating sample challenges...");
                createSampleChallenges();
                challengeFiles = Files.list(Paths.get(CHALLENGES_DIR))
                    .filter(path -> path.toString().endsWith(".rgx"))
                    .collect(java.util.stream.Collectors.toList());
            }
            
            // Sort files numerically based on the number in the filename
            challengeFiles.sort((path1, path2) -> {
                String name1 = path1.getFileName().toString();
                String name2 = path2.getFileName().toString();
                
                // Extract numbers from filenames
                Matcher matcher1 = Pattern.compile("\\d+").matcher(name1);
                Matcher matcher2 = Pattern.compile("\\d+").matcher(name2);
                
                if (matcher1.find() && matcher2.find()) {
                    int num1 = Integer.parseInt(matcher1.group());
                    int num2 = Integer.parseInt(matcher2.group());
                    return Integer.compare(num1, num2);
                }
                
                // Fallback to alphabetical sorting if no numbers found
                return name1.compareTo(name2);
            });
            
            score = 0;
            totalChallenges = challengeFiles.size();
            
            for (Path challengeFile : challengeFiles) {
                playChallenge(challengeFile.toString());
            }
            
            System.out.println("\nYou've completed all challenges!");
            System.out.println("Your final score: " + score + "/" + totalChallenges);
            
        } catch (IOException e) {
            System.err.println("Error listing challenge files: " + e.getMessage());
        }
    }

    private static void selectChallenge() {
        try {
            List<Path> challengeFiles = Files.list(Paths.get(CHALLENGES_DIR))
                .filter(path -> path.toString().endsWith(".rgx"))
                .collect(java.util.stream.Collectors.toList());
            
            if (challengeFiles.isEmpty()) {
                System.out.println("No challenges found. Creating sample challenges...");
                createSampleChallenges();
                challengeFiles = Files.list(Paths.get(CHALLENGES_DIR))
                    .filter(path -> path.toString().endsWith(".rgx"))
                    .collect(java.util.stream.Collectors.toList());
            }
            
            // Sort files numerically based on the number in the filename
            challengeFiles.sort((path1, path2) -> {
                String name1 = path1.getFileName().toString();
                String name2 = path2.getFileName().toString();
                
                // Extract numbers from filenames
                Matcher matcher1 = Pattern.compile("\\d+").matcher(name1);
                Matcher matcher2 = Pattern.compile("\\d+").matcher(name2);
                
                if (matcher1.find() && matcher2.find()) {
                    int num1 = Integer.parseInt(matcher1.group());
                    int num2 = Integer.parseInt(matcher2.group());
                    return Integer.compare(num1, num2);
                }
                
                // Fallback to alphabetical sorting if no numbers found
                return name1.compareTo(name2);
            });
            
            System.out.println("\nAvailable challenges:");
            for (int i = 0; i < challengeFiles.size(); i++) {
                String filename = challengeFiles.get(i).getFileName().toString();
                String difficulty = getDifficultyFromFile(challengeFiles.get(i).toString());
                System.out.printf("%d. %s (%s)%n", i + 1, filename, difficulty);
            }
            
            System.out.print("\nEnter the challenge number you want to play (1-" + challengeFiles.size() + "): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= challengeFiles.size()) {
                    playChallenge(challengeFiles.get(choice - 1).toString());
                } else {
                    System.out.println("Invalid choice. Please enter a valid challenge number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
            
        } catch (IOException e) {
            System.err.println("Error listing challenge files: " + e.getMessage());
        }
    }

    private static String getDifficultyFromFile(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            if (content.contains("Difficulty: \"Easy\"")) return "Easy";
            if (content.contains("Difficulty: \"Medium\"")) return "Medium";
            if (content.contains("Difficulty: \"Hard\"")) return "Hard";
            if (content.contains("Difficulty: \"Expert\"")) return "Expert";
            return "Unknown";
        } catch (IOException e) {
            return "Unknown";
        }
    }

    private static void playChallenge(String challengeFilePath) {
        try {
            String fileContent = new String(Files.readAllBytes(Paths.get(challengeFilePath)));
            
            // Split the file into challenge and solution parts
            String[] parts = fileContent.split("SOLUTION:");
            if (parts.length < 2) {
                System.out.println("Invalid challenge file format: " + challengeFilePath);
                return;
            }
            
            String challengePart = parts[0];
            String solutionPart = "SOLUTION:" + parts[1];
            
            // Parse challenge
            CharStream challengeInput = CharStreams.fromString(challengePart);
            RegexGameLexer challengeLexer = new RegexGameLexer(challengeInput);
            CommonTokenStream challengeTokens = new CommonTokenStream(challengeLexer);
            RegexGameParser challengeParser = new RegexGameParser(challengeTokens);
            
            // Parse solution
            CharStream solutionInput = CharStreams.fromString(solutionPart);
            RegexGameLexer solutionLexer = new RegexGameLexer(solutionInput);
            CommonTokenStream solutionTokens = new CommonTokenStream(solutionLexer);
            RegexGameParser solutionParser = new RegexGameParser(solutionTokens);
            
            // Get challenge information
            RegexGameParser.ChallengeContext challengeContext = challengeParser.challenge();
            String difficulty = unquote(challengeContext.difficulty().TEXT().getText());
            String description = unquote(challengeContext.description().TEXT().getText());
            
            // Get matching and non-matching samples
            List<String> matchingSamples = new ArrayList<>();
            List<String> nonMatchingSamples = new ArrayList<>();
            
            for (RegexGameParser.SampleItemContext sampleItemContext : challengeContext.samples().sampleItem()) {
                if (sampleItemContext.match() != null) {
                    matchingSamples.add(unquote(sampleItemContext.match().TEXT().getText()));
                } else if (sampleItemContext.nonMatch() != null) {
                    nonMatchingSamples.add(unquote(sampleItemContext.nonMatch().TEXT().getText()));
                }
            }
            
            // Get solution
            RegexGameParser.SolutionContext solutionContext = solutionParser.solution();
            String correctRegex = unquote(solutionContext.regex().TEXT().getText());
            String explanation = unquote(solutionContext.explanation().TEXT().getText());
            
            // Display challenge
            System.out.println("\n==============================================");
            System.out.println("CHALLENGE: " + Paths.get(challengeFilePath).getFileName());
            System.out.println("Difficulty: " + difficulty);
            System.out.println("==============================================");
            System.out.println(description);
            System.out.println("\nStrings that SHOULD match the pattern:");
            for (String sample : matchingSamples) {
                System.out.println("  ✓ \"" + sample + "\"");
            }
            
            System.out.println("\nStrings that should NOT match the pattern:");
            for (String sample : nonMatchingSamples) {
                System.out.println("  ✗ \"" + sample + "\"");
            }
            
            // Get user's regex guess
            System.out.println("\nEnter your regex pattern (without delimiters like / /):");
            System.out.print("> ");
            String userRegex = scanner.nextLine().trim();
            
            // Remove surrounding quotes if the user included them
            if (userRegex.startsWith("\"") && userRegex.endsWith("\"")) {
                userRegex = userRegex.substring(1, userRegex.length() - 1);
            }
            
            // Check if user's regex is correct
            boolean isCorrect = testRegex(userRegex, matchingSamples, nonMatchingSamples);
            
            if (isCorrect) {
                System.out.println("\n✓ Correct! Your regex pattern works for all examples.");
                score++;
                
                // Show brief explanation for correct answers without asking
                System.out.println("\nEXPLANATION:");
                System.out.println(explanation);
            } else {
                System.out.println("\n✗ Your regex pattern doesn't work for all examples.");
                
                // Show detailed results
                System.out.println("\nTesting your pattern: " + userRegex);
                testRegexDetailed(userRegex, matchingSamples, nonMatchingSamples);
                
                // Ask if user wants to see the solution only when they got it wrong
                System.out.print("\nWould you like to see the solution? (y/n): ");
                String showSolution = scanner.nextLine().trim().toLowerCase();
                
                if (showSolution.equals("y") || showSolution.equals("yes")) {
                    System.out.println("\nSOLUTION:");
                    System.out.println("Regex pattern: " + correctRegex);
                    System.out.println("\nExplanation:");
                    System.out.println(explanation);
                    
                    // Test correct solution
                    System.out.println("\nTesting the correct pattern:");
                    testRegexDetailed(correctRegex, matchingSamples, nonMatchingSamples);
                }
            }
            
        } catch (IOException e) {
            System.err.println("Error reading challenge file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error parsing challenge: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static boolean testRegex(String regex, List<String> matchingSamples, List<String> nonMatchingSamples) {
        try {
            Pattern pattern = Pattern.compile(regex);
            
            // All matching samples must match
            for (String sample : matchingSamples) {
                if (!pattern.matcher(sample).matches()) {
                    return false;
                }
            }
            
            // All non-matching samples must not match
            for (String sample : nonMatchingSamples) {
                if (pattern.matcher(sample).matches()) {
                    return false;
                }
            }
            
            return true;
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid regex syntax: " + e.getMessage());
            return false;
        }
    }

    private static void testRegexDetailed(String regex, List<String> matchingSamples, List<String> nonMatchingSamples) {
        try {
            Pattern pattern = Pattern.compile(regex);
            
            // Test matching samples
            System.out.println("\nSamples that SHOULD match:");
            for (String sample : matchingSamples) {
                boolean matches = pattern.matcher(sample).matches();
                System.out.println("  " + (matches ? "✓" : "✗") + " \"" + sample + "\"");
            }
            
            // Test non-matching samples
            System.out.println("\nSamples that should NOT match:");
            for (String sample : nonMatchingSamples) {
                boolean matches = pattern.matcher(sample).matches();
                System.out.println("  " + (!matches ? "✓" : "✗") + " \"" + sample + "\"");
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid regex syntax: " + e.getMessage());
        }
    }

    private static void createNewChallenge() {
        System.out.println("\nCREATE NEW CHALLENGE");
        System.out.println("====================");
        
        // Get challenge details
        System.out.print("Enter challenge difficulty (Easy, Medium, Hard, Expert): ");
        String difficulty = scanner.nextLine().trim();
        
        System.out.print("Enter challenge description: ");
        String description = scanner.nextLine().trim();
        
        // Get matching samples
        List<String> matchingSamples = new ArrayList<>();
        System.out.println("\nEnter strings that SHOULD match the regex (enter empty line when done):");
        while (true) {
            System.out.print("> ");
            String sample = scanner.nextLine().trim();
            if (sample.isEmpty()) break;
            matchingSamples.add(sample);
        }
        
        // Get non-matching samples
        List<String> nonMatchingSamples = new ArrayList<>();
        System.out.println("\nEnter strings that should NOT match the regex (enter empty line when done):");
        while (true) {
            System.out.print("> ");
            String sample = scanner.nextLine().trim();
            if (sample.isEmpty()) break;
            nonMatchingSamples.add(sample);
        }
        
        // Get solution
        System.out.print("\nEnter the correct regex pattern: ");
        String regex = scanner.nextLine().trim();
        
        System.out.print("Enter explanation for the regex pattern: ");
        String explanation = scanner.nextLine().trim();
        
        // Create challenge file
        try {
            // Generate a unique filename
            String filename = "challenge_" + System.currentTimeMillis() + ".rgx";
            Path filePath = Paths.get(CHALLENGES_DIR, filename);
            
            // Format challenge content
            StringBuilder content = new StringBuilder();
            content.append("CHALLENGE:\n");
            content.append("Difficulty: \"").append(difficulty).append("\"\n");
            content.append("Description: \"").append(description).append("\"\n");
            content.append("Samples: ");
            
            for (int i = 0; i < matchingSamples.size(); i++) {
                content.append("Match: \"").append(matchingSamples.get(i)).append("\"");
                if (i < matchingSamples.size() - 1 || !nonMatchingSamples.isEmpty()) {
                    content.append("; ");
                }
            }
            
            for (int i = 0; i < nonMatchingSamples.size(); i++) {
                content.append("NonMatch: \"").append(nonMatchingSamples.get(i)).append("\"");
                if (i < nonMatchingSamples.size() - 1) {
                    content.append("; ");
                }
            }
            
            content.append("\nEND_CHALLENGE\n\n");
            content.append("SOLUTION:\n");
            content.append("Regex: \"").append(regex).append("\"\n");
            content.append("Explanation: \"").append(explanation).append("\"\n");
            content.append("END_SOLUTION\n");
            
            // Write to file
            Files.write(filePath, content.toString().getBytes());
            
            System.out.println("\nChallenge created successfully: " + filename);
            
        } catch (IOException e) {
            System.err.println("Error creating challenge file: " + e.getMessage());
        }
    }

    private static void showInstructions() {
        System.out.println("\nREGEX LEARNING GAME - INSTRUCTIONS");
        System.out.println("==================================");
        System.out.println("This game helps you learn regular expressions through interactive challenges.");
        System.out.println("\nHow to play:");
        System.out.println("1. You'll be presented with a challenge showing examples of strings that should");
        System.out.println("   match or not match a specific regex pattern.");
        System.out.println("2. Your task is to write a regex pattern that correctly matches all the positive");
        System.out.println("   examples and doesn't match any of the negative examples.");
        System.out.println("3. After submitting your answer, the game will test it against all examples");
        System.out.println("   and tell you if it's correct.");
        System.out.println("4. You can then see the solution with an explanation of how the regex works.");
        System.out.println("\nRegular Expression Basics:");
        System.out.println("- . matches any single character");
        System.out.println("- * means 'zero or more' of the previous item");
        System.out.println("- + means 'one or more' of the previous item");
        System.out.println("- ? means 'zero or one' of the previous item");
        System.out.println("- [abc] matches any character in the brackets");
        System.out.println("- [^abc] matches any character NOT in the brackets");
        System.out.println("- \\d matches any digit (same as [0-9])");
        System.out.println("- \\w matches any word character (same as [a-zA-Z0-9_])");
        System.out.println("- ^ matches the start of a string");
        System.out.println("- $ matches the end of a string");
        System.out.println("- (abc) groups items together");
        System.out.println("- a|b means 'a or b'");
        System.out.println("- {n} means exactly 'n' of the previous item");
        System.out.println("- {n,} means 'n or more' of the previous item");
        System.out.println("- {n,m} means 'between n and m' of the previous item");
        System.out.println("\nPress Enter to return to the main menu...");
        scanner.nextLine();
    }

    private static void createSampleChallenges() throws IOException {
        createChallenge1();
        createChallenge2();
        createChallenge3();
        createChallenge4();
        createChallenge5();
        createChallenge6();
        createChallenge7();
        createChallenge8();
        createChallenge9();
        createChallenge10();
    }

    // Sample challenges implementation
    private static void createChallenge1() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Easy\"\n" +
            "Description: \"Create a regex that matches strings containing only digits.\"\n" +
            "Samples: Match: \"123\"; Match: \"456789\"; Match: \"0\"; NonMatch: \"abc\"; NonMatch: \"123abc\"; NonMatch: \"abc123\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^\\d+$\"\n" +
            "Explanation: \"This regex uses ^\\d+$ where ^ marks the start of the string, \\d+ means one or more digits, and $ marks the end of the string. This ensures the entire string consists only of digits.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge1.rgx"), content.getBytes());
    }

    private static void createChallenge2() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Easy\"\n" +
            "Description: \"Create a regex that matches valid email addresses (simple version).\"\n" +
            "Samples: Match: \"user@example.com\"; Match: \"john.doe@company.co.uk\"; Match: \"info@site-name.net\"; NonMatch: \"invalid@\"; NonMatch: \"@example.com\"; NonMatch: \"user@.com\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$\"\n" +
            "Explanation: \"This regex matches an email with username before @, domain name after @, and a TLD of at least 2 letters. [\\w.-]+ allows letters, digits, underscores, dots, and hyphens in both username and domain.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge2.rgx"), content.getBytes());
    }

    private static void createChallenge3() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Easy\"\n" +
            "Description: \"Create a regex that matches strings starting with 'A' and ending with 'Z'.\"\n" +
            "Samples: Match: \"AZ\"; Match: \"ABCZ\"; Match: \"A123Z\"; NonMatch: \"ABC\"; NonMatch: \"BAZ\"; NonMatch: \"az\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^A.*Z$\"\n" +
            "Explanation: \"This regex uses ^ to match the start of the string, followed by 'A'. The .* matches zero or more of any character, and Z$ ensures the string ends with 'Z'.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge3.rgx"), content.getBytes());
    }

    private static void createChallenge4() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Medium\"\n" +
            "Description: \"Create a regex that matches valid US phone numbers in format XXX-XXX-XXXX.\"\n" +
            "Samples: Match: \"123-456-7890\"; Match: \"555-123-4567\"; Match: \"999-888-7777\"; NonMatch: \"123-456-789\"; NonMatch: \"123-4567890\"; NonMatch: \"(123)456-7890\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^\\d{3}-\\d{3}-\\d{4}$\"\n" +
            "Explanation: \"This regex matches exactly 3 digits (\\d{3}), followed by a hyphen, then 3 more digits, another hyphen, and finally 4 digits. The ^ and $ ensure the entire string matches this pattern.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge4.rgx"), content.getBytes());
    }

    private static void createChallenge5() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Medium\"\n" +
            "Description: \"Create a regex that matches valid hexadecimal color codes (like #FFF or #F0F0F0).\"\n" +
            "Samples: Match: \"#FFF\"; Match: \"#000\"; Match: \"#F5A942\"; Match: \"#f5a942\"; NonMatch: \"FFF\"; NonMatch: \"#FFFF\"; NonMatch: \"#FFG\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^#([0-9A-Fa-f]{3}|[0-9A-Fa-f]{6})$\"\n" +
            "Explanation: \"This regex matches a # followed by either exactly 3 or exactly 6 hexadecimal digits (0-9, A-F, or a-f). The pipe symbol | acts as 'or' to allow either format.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge5.rgx"), content.getBytes());
    }

    private static void createChallenge6() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Medium\"\n" +
            "Description: \"Create a regex that matches dates in format MM/DD/YYYY.\"\n" +
            "Samples: Match: \"01/01/2000\"; Match: \"12/31/1999\"; Match: \"05/15/2022\"; NonMatch: \"1/1/2000\"; NonMatch: \"13/01/2000\"; NonMatch: \"01/32/2000\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$\"\n" +
            "Explanation: \"This regex validates MM as 01-12, DD as 01-31, and YYYY as any 4 digits. It doesn't check for invalid dates like 02/31/2000, but it ensures the basic format is correct.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge6.rgx"), content.getBytes());
    }

    private static void createChallenge7() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Hard\"\n" +
            "Description: \"Create a regex that validates strong passwords: at least 8 characters, containing uppercase, lowercase, number, and special character.\"\n" +
            "Samples: Match: \"P@ssw0rd\"; Match: \"Str0ng!Pass\"; Match: \"C0mplex$\"; NonMatch: \"password\"; NonMatch: \"PASSWORD123\"; NonMatch: \"Pass word\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};:'\\\"\\\\|,.<>\\/?]).{8,}$\"\n" +
            "Explanation: \"This regex uses positive lookaheads (?=...) to ensure the password contains lowercase, uppercase, digit, and special character, followed by a minimum length check of 8 characters.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge7.rgx"), content.getBytes());
    }

    private static void createChallenge8() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Hard\"\n" +
            "Description: \"Create a regex that matches valid IPv4 addresses.\"\n" +
            "Samples: Match: \"192.168.1.1\"; Match: \"10.0.0.1\"; Match: \"255.255.255.255\"; NonMatch: \"256.0.0.1\"; NonMatch: \"192.168.1\"; NonMatch: \"192.168.1.1.1\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$\"\n" +
            "Explanation: \"This regex matches each octet of an IPv4 address, ensuring each number is between 0 and 255. It uses a group for the first three octets (with a dot after each) and then matches the final octet.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge8.rgx"), content.getBytes());
    }

    private static void createChallenge9() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Hard\"\n" +
            "Description: \"Create a regex that matches valid URLs (http or https).\"\n" +
            "Samples: Match: \"http://example.com\"; Match: \"https://www.example.co.uk/path\"; Match: \"https://site.com/path?query=value\"; NonMatch: \"example.com\"; NonMatch: \"http://\"; NonMatch: \"http:/example.com\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^https?://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%&=]*)?$\"\n" +
            "Explanation: \"This regex matches http:// or https:// followed by a domain name with at least one subdomain, and an optional path. The domain part uses ([\\w-]+\\.)+ to ensure at least one period in the domain.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge9.rgx"), content.getBytes());
    }

    private static void createChallenge10() throws IOException {
        String content = "CHALLENGE:\n" +
            "Difficulty: \"Expert\"\n" +
            "Description: \"Create a regex that validates balanced parentheses (this is tricky as regular expressions typically can't count).\"\n" +
            "Samples: Match: \"()\"; Match: \"(())\"; Match: \"()()()\"; NonMatch: \"(\"; NonMatch: \")()\"; NonMatch: \"(()\"\n" +
            "END_CHALLENGE\n\n" +
            "SOLUTION:\n" +
            "Regex: \"^(?:[^()]*\\((?:[^()]*\\)[^()]*\\()*[^()]*\\)[^()]*)*$\"\n" +
            "Explanation: \"This is a complex regex that attempts to match balanced parentheses. It works for simple cases but has limitations, as true parenthesis matching requires a context-free grammar, not a regular expression. It uses nested groups to match pairs of parentheses.\"\n" +
            "END_SOLUTION";
        Files.write(Paths.get(CHALLENGES_DIR, "challenge10.rgx"), content.getBytes());
    }

    // Helper methods
    private static String getText(String input) {
        return input;
    }
    
    private static String unquote(String text) {
        if (text.startsWith("\"") && text.endsWith("\"")) {
            return text.substring(1, text.length() - 1).replace("\\\"", "\"").replace("\\\\", "\\");
        }
        return text;
    }
}