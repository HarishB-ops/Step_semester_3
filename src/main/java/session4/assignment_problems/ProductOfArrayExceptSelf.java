package session4.assignment_problems;

import java.util.Arrays;

/**
 * A1: Product of Array Except Self
 * For each index, computes the product of all other elements, no division, O(n).
 */
public class ProductOfArrayExceptSelf {

    static int[] productExceptSelf(int[] nums) {
        // TODO: forward pass - answer[i] = running product of everything to the left of i
        // backward pass - multiply in running product of everything to the right of i
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}
