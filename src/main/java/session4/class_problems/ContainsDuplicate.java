package session4.class_problems;

/**
 * L3: Contains Duplicate
 * Checks whether any value appears more than once, using nested loops.
 */
public class ContainsDuplicate {

    static boolean containsDuplicate(int[] nums) {
        // TODO: nested loops comparing every i against every j != i
        // return true immediately on a match, false if none found
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}
