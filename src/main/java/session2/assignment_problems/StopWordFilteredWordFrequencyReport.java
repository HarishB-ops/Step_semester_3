package session2.assignment_problems;

/**
 * Assignment 5: Stop-Word-Filtered Word Frequency Report
 * Counts word frequency in feedback text, excluding common filler/stop words.
 */
public class StopWordFilteredWordFrequencyReport {

    private static final String[] STOP_WORDS = {"the", "was", "and", "a", "is", "of", "in"};

    static void printFilteredWordFrequency(String feedback) {
        // TODO: lowercase the text, strip punctuation (periods/commas) using replace()
        // split on whitespace using split("\\s+")
        // skip any word in STOP_WORDS
        // count frequency of each remaining unique word (a HashMap is fine)
        // print each word with its count, sorted by count descending
    }

    public static void main(String[] args) {
        printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}
