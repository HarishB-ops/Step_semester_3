package session5.assignment_problems;

/**
 * Assignment 2: Duplicate Team Name Finder
 * Finds the first repeated team name using nested loops.
 */
public class DuplicateTeamNameFinder {

    static String findDuplicateTeam(String[] teamNames) {
        // TODO: compare each name only against names that come after it
        // return "Duplicate Found: <name>" for the first duplicate, or "No Duplicates Found"
        return "";
    }

    public static void main(String[] args) {
        System.out.println(findDuplicateTeam(new String[]{"ByteForce", "CodeCrafters", "ByteForce"}));
        System.out.println(findDuplicateTeam(new String[]{"ByteForce", "CodeCrafters", "NullPointers"}));
    }
}
