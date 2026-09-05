package session5.assignment_problems;

/**
 * Assignment 4: Hackathon Seating Grid Optimizer
 * Classifies each seating row as "Quiet Zone" or "Buzzing Zone" based on its average.
 */
public class HackathonSeatingGridOptimizer {

    /** Computes the average of one row. Reused once per row - no inline recomputation. */
    private static double rowAverage(int[] row) {
        // TODO: sum all values in row, divide by row.length
        return 0;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {
        // TODO: for each row, call rowAverage(row) once, compare to threshold
        // below threshold -> "Quiet Zone", at/above -> "Buzzing Zone"
        // rows may vary in length (jagged grid) - don't assume equal length
        return "";
    }

    public static void main(String[] args) {
        int[][] seatingScores = {
                {40, 50, 45},
                {85, 90, 95},
                {30, 20, 25}
        };
        System.out.println(classifyRows(seatingScores, 60));
    }
}
