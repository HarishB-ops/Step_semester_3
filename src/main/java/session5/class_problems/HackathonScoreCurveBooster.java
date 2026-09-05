package session5.assignment_problems;

import java.util.Arrays;

/**
 * Assignment 1: Hackathon Score Curve Booster
 * Boosts every score in place by a flat bonus, then prints via Arrays.toString.
 */
public class HackathonScoreCurveBooster {

    static void curveScores(int[] scores, int bonus) {
        // TODO: modify scores in place - add bonus to every element, no return value
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 60};
        curveScores(scores, 10);
        System.out.println(Arrays.toString(scores));
    }
}
