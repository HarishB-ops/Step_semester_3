package session4.assignment_problems;

/**
 * A2: Maximum Subarray
 * Finds the largest sum of a contiguous subarray using Kadane's algorithm.
 */
public class MaximumSubarray {

    static int maxSubArray(int[] nums) {
        // TODO: Kadane's algorithm - at each element, decide whether to extend
        // the current running subarray or start fresh from this element
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(maxSubArray(new int[]{-3, -1, -2}));
    }
}
