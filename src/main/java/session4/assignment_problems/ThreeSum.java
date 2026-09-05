package session4.assignment_problems;

import java.util.Arrays;

/**
 * A3: 3Sum
 * Finds all unique triplets that sum to zero, using sort + two pointers.
 */
public class ThreeSum {

    static int[][] threeSum(int[] nums) {
        // TODO: sort the array first
        // for each index i, use two pointers moving inward across the rest of the array
        // to find pairs summing to -nums[i]; skip duplicate values at every level
        return new int[0][0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(threeSum(new int[]{-1, 0, 1, 2, -1, -4})));
        System.out.println(Arrays.deepToString(threeSum(new int[]{0, 0, 0})));
    }
}
