package session4.class_problems;

import java.util.Arrays;

/**
 * L5: Rotate Array
 * Rotates an array to the right by k positions.
 */
public class RotateArray {

    static int[] rotateArray(int[] nums, int k) {
        // TODO: reduce k with k = k % nums.length
        // create new array; for each i, newArray[(i + k) % nums.length] = nums[i]
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2}, 3)));
    }
}
