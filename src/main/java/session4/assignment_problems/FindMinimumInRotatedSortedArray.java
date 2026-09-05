package session4.assignment_problems;

/**
 * A5: Find Minimum in Rotated Sorted Array
 * Finds the minimum element in a rotated sorted array using modified binary search.
 */
public class FindMinimumInRotatedSortedArray {

    static int findMin(int[] nums) {
        // TODO: binary search - at each step compare mid element to the rightmost element
        // to decide which half the minimum must be hiding in
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{11, 13, 15, 17}));
    }
}
