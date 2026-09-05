package session5.class_problems;

import java.util.Arrays;

/**
 * Problem 5: Fantasy League Auto-Draft Ranking Engine
 * Two overloaded draftability checks, plus Comparable-based ranking via Arrays.sort.
 */
public class FantasyLeagueAutoDraftRankingEngine {

    static class Player implements Comparable<Player> {
        String name;
        int matchesPlayed;
        double battingAverage;
        boolean injured;

        public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        @Override
        public int compareTo(Player other) {
            // TODO: rank by fantasy points descending (define how fantasy points are derived)
            return 0;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    /** Experience-only rule for established players. */
    static boolean isDraftable(int matchesPlayed) {
        // TODO: e.g. matchesPlayed >= 10 qualifies regardless of fitness
        return false;
    }

    /** Combined matches-and-fitness rule for everyone else. */
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        // TODO: decide thresholds - reasonably experienced AND currently fit
        return false;
    }

    static String draftAndRank(Player[] players) {
        // TODO: filter using the overloaded isDraftable(...) checks, then Arrays.sort(draftableArray)
        // (compareTo handles the ranking), build "1. Name | 2. Name | ..." string
        return "";
    }

    public static void main(String[] args) {
        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rahul", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };
        System.out.println(draftAndRank(players));
    }
}
