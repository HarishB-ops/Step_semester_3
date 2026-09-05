package session5.assignment_problems;

import java.util.Arrays;

/**
 * Assignment 3: Top-3 Podium Finder
 * Finds the top 3 scores in a single pass without sorting the whole array.
 */
public class Top3PodiumFinder {

    static int[] findTopThreeScores(int[] scores) {
        // TODO: track three running variables (first, second, third), update all three
        // correctly as you scan once, left to right. Handle ties per the example.
        // return the three scores in descending order
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTopThreeScores(new int[]{45, 82, 79, 90, 33, 90, 61})));
    }
}
