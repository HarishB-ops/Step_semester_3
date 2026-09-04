package session1.class_problems;

/**
 * Problem 4: First Non-Repeating Character
 * Finds the first character in a string whose frequency is exactly 1.
 */
public class FirstNonRepeatingCharacter {

    static char findFirstNonRepeatingChar(String text) {
        // TODO: count frequency of every char, then scan left to right
        // return the first one with frequency == 1, or a sentinel if none found
        return '\0';
    }

    public static void main(String[] args) {
        String[] samples = {"swiss", "aabbcc"};
        for (String text : samples) {
            char result = findFirstNonRepeatingChar(text);
            if (result == '\0') {
                System.out.println("\"" + text + "\" -> No Non-Repeating Character Found");
            } else {
                System.out.println("\"" + text + "\" -> First Non-Repeating Character: '" + result + "'");
            }
        }
    }
}
