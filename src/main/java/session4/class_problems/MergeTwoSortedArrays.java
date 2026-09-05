package session4.class_problems;

import java.util.Arrays;

/**
 * L4: Merge Two Sorted Arrays
 * Merges two sorted arrays into one sorted array using two pointers.
 */
public class MergeTwoSortedArrays {

    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // TODO: two index pointers starting at 0, new result array of size arr1.length + arr2.length
        // while loop comparing current elements, copy smaller, advance that pointer
        // once one array is exhausted, copy the rest of the other directly
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6})));
        System.out.println(Arrays.toString(mergeSortedArrays(new int[]{}, new int[]{1, 2, 3})));
    }
}
