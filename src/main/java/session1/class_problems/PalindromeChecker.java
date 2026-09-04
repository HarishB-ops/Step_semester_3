package session1.class_problems;

/**
 * Problem 2: Palindrome Checker (3 Approaches)
 * Verifies a palindrome using iterative, recursive, and array-reversal
 * methods, and confirms all three agree.
 */
public class PalindromeChecker {

    static boolean isPalindromeIterative(String text) {
        // TODO: compare characters from both ends moving inward
        return false;
    }

    static boolean isPalindromeRecursive(String text) {
        // TODO: recursively compare first and last chars, shrinking the substring
        return false;
    }

    static boolean isPalindromeArrayReversal(String text) {
        // TODO: convert to char[], reverse it, compare to original
        return false;
    }

    public static void main(String[] args) {
        String[] samples = {"madam", "hello"};
        for (String text : samples) {
            boolean iterative = isPalindromeIterative(text);
            boolean recursive = isPalindromeRecursive(text);
            boolean arrayReversal = isPalindromeArrayReversal(text);

            System.out.println("\"" + text + "\" -> Iterative: " + result(iterative)
                    + " | Recursive: " + result(recursive)
                    + " | Array Reversal: " + result(arrayReversal));
        }
    }

    private static String result(boolean isPalindrome) {
        return isPalindrome ? "Palindrome" : "Not Palindrome";
    }
}
