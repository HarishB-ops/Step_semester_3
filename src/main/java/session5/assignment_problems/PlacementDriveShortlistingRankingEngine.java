package session5.assignment_problems;

/**
 * Assignment 5: Placement Drive Shortlisting & Ranking Engine
 * Two overloaded eligibility checks, plus Comparable-based ranking via Arrays.sort.
 */
public class PlacementDriveShortlistingRankingEngine {

    static class Candidate implements Comparable<Candidate> {
        String name;
        double cgpa;
        int codingScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        @Override
        public int compareTo(Candidate other) {
            // TODO: rank by composite score descending (define how composite score is derived)
            return 0;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    /** CGPA-only quick filter. */
    static boolean isEligible(double cgpa) {
        // TODO: e.g. a strong CGPA alone is enough
        return false;
    }

    /** Combined CGPA-and-coding-score filter for borderline cases. */
    static boolean isEligible(double cgpa, int codingScore) {
        // TODO: borderline CGPA can still qualify with a genuinely good coding-test score
        return false;
    }

    static String shortlistAndRank(Candidate[] candidates) {
        // TODO: filter using the overloaded isEligible(...) checks, then Arrays.sort(shortlistedArray)
        // (compareTo handles the ranking), build "1. Name (score) | 2. Name (score) | ..." string
        return "";
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
                new Candidate("Aisha", 8.2, 40),
                new Candidate("Rohit", 6.8, 65),
                new Candidate("Meena", 6.0, 90),
                new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(candidates));
    }
}
