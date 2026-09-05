package session5.class_problems;

/**
 * Problem 2: Duplicate Player Pick Checker
 * Finds the first repeated player name in a lineup using nested loops.
 */
public class DuplicatePlayerPickChecker {

    static String findDuplicatePick(String[] playerNames) {
        // TODO: for each name, compare only against names that come after it (avoid checking pairs twice)
        // return "Duplicate Found: <name>" for the first duplicate, scanning in order
        // return "No Duplicates Found" if none exist
        return "";
    }

    public static void main(String[] args) {
        System.out.println(findDuplicatePick(new String[]{"Kohli", "Bumrah", "Kohli", "Rohit"}));
        System.out.println(findDuplicatePick(new String[]{"Kohli", "Bumrah", "Rohit"}));
    }
}
