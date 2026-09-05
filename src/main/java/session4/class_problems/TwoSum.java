package session4.class_problems;

import java.util.Arrays;

/**
 * L1: Two Sum
 * Finds two indices whose values sum to target, using nested loops.
 */
public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        // TODO: nested loops, check every pair (i, j), i != j
        // if nums[i] + nums[j] == target, return new int[]{i, j}
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}
