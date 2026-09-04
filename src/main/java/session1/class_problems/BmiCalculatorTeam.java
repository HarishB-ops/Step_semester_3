package session1.class_problems;

/**
 * Problem 3: BMI Calculator for a Team
 * Computes BMI and wellness status for a team, prints a summary table.
 */
public class BmiCalculatorTeam {

    /** Classifies a BMI value into Underweight / Normal / Overweight / Obese. */
    static String getBmiStatus(double bmi) {
        // TODO: <18.5 Underweight, 18.5-24.9 Normal, 25-29.9 Overweight, >=30 Obese
        return "";
    }

    static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("Person | Height (m) | Weight (kg) | BMI | Status");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getBmiStatus(bmi);
            System.out.printf("Person %d | %.2f | %.2f | %.2f | %s%n",
                    i + 1, heights[i], weights[i], bmi, status);
        }
    }

    public static void main(String[] args) {
        double[] heights = {1.75, 1.60};
        double[] weights = {70, 90};
        printWellnessReport(heights, weights);
    }
}
