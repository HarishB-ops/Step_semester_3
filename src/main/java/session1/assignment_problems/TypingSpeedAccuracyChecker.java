package session1.assignment_problems;

/**
 * Assignment 2: The Typing Speed Test Accuracy Checker
 * Compares original vs typed text char by char, reports accuracy % and first mismatch.
 */
public class TypingSpeedAccuracyChecker {

    static void checkTypingAccuracy(String original, String typed) {
        // TODO: count matches at same position, compute accuracy %,
        // find position of first mismatch (or confirm none)
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}
