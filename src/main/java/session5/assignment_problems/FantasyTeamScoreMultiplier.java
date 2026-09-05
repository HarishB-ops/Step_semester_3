package session5.class_problems;

import java.util.Arrays;

/**
 * Problem 1: Fantasy Team Score Multiplier
 * Applies captain (2x) and vice-captain (1.5x) multipliers directly on the array.
 */
public class FantasyTeamScoreMultiplier {

    static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        // TODO: modify playerScores in place - no return value
        // playerScores[captainIndex] *= 2, playerScores[viceCaptainIndex] *= 1.5
    }

    public static void main(String[] args) {
        double[] scores = {40, 55, 30, 62};
        applyMultipliers(scores, 1, 3);
        System.out.println(Arrays.toString(scores));
    }
}
