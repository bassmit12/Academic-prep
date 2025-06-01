import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Generate all strings in L((a + bb)*) of length exactly 5
        System.out.println("All strings in L((a + bb)*) of length exactly 5:");
        
        List<String> result = generateStrings(5);
        for (String str : result) {
            System.out.println(str);
        }
        
        System.out.println("Total count: " + result.size());
    }
    
    public static List<String> generateStrings(int targetLength) {
        List<String> result = new ArrayList<>();
        generateStringsHelper("", targetLength, result);
        return result;
    }
    
    private static void generateStringsHelper(String current, int remainingLength, List<String> result) {
        // Base case: if we've reached the target length
        if (remainingLength == 0) {
            result.add(current);
            return;
        }
        
        // If we can add 'a', do it
        if (remainingLength >= 1) {
            generateStringsHelper(current + "a", remainingLength - 1, result);
        }
        
        // If we can add 'bb', do it
        if (remainingLength >= 2) {
            generateStringsHelper(current + "bb", remainingLength - 2, result);
        }
    }
}