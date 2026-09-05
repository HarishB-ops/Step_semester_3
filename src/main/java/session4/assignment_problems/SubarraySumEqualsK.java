package session4.assignment_problems;

/**
 * A4: Subarray Sum Equals K
 * Counts contiguous subarrays whose sum equals k, using prefix sums + a hash map.
 */
public class SubarraySumEqualsK {

    static int subarraySum(int[] nums, int k) {
        // TODO: running prefix sum + HashMap<Integer, Integer> of prefixSum -> frequency
        // at each position, count how many earlier prefix sums equal (currentSum - k)
        // remember to seed the map with prefixSum 0 occurring once (empty prefix)
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(subarraySum(new int[]{1, -1, 0}, 0));
    }
}
