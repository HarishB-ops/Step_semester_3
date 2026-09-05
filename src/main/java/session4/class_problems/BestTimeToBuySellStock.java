package session4.class_problems;

/**
 * L2: Best Time to Buy and Sell Stock
 * Finds the max profit from one buy + one later sell, in a single pass.
 */
public class BestTimeToBuySellStock {

    static int maxProfit(int[] prices) {
        // TODO: track lowest price seen so far, track largest profit seen so far
        // return 0 if prices only ever fall
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
