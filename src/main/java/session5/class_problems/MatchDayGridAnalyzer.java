package session5.class_problems;

/**
 * Problem 4: Match Day Grid Analyzer
 * Classifies each match row as "Power Surge" or "Normal" based on its average.
 */
public class MatchDayGridAnalyzer {

    /** Computes the average of one row. Reused once per match - no inline recomputation. */
    private static double rowAverage(int[] row) {
        // TODO: sum all values in row, divide by row.length
        return 0;
    }

    static String classifyMatches(int[][] runsPerOver, int threshold) {
        // TODO: for each row, call rowAverage(row) once, compare to threshold
        // >= threshold -> "Power Surge", below -> "Normal"
        // build result like "Match 0: Normal | Match 1: Power Surge | Match 2: Normal"
        return "";
    }

    public static void main(String[] args) {
        int[][] runsPerOver = {
                {4, 6, 8},
                {10, 12, 14},
                {2, 3, 1}
        };
        System.out.println(classifyMatches(runsPerOver, 8));
    }
}
