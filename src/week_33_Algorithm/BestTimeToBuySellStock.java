package week_33_Algorithm;

public class BestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            }
            if (prices[i] - minValue > profit) {
                profit = prices[i] - minValue;

            }

        }
        return profit;
    }

    public static void main(String[] args) {
//        int[] prices = {,1,5,3,6,4};
//        int n = prices.length;
//        int min = 2147483647;
//        int profit = 0;
//
//        for (int i = 0; i < n; i++) {
//             min = Math.min(min, prices[i]);
//             profit = Math.max(profit, prices[i] - min);
//        }
//        System.out.println(profit);




        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}



//        You are given an array prices where prices[i] is the price of a given stock on the ith day.
//        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day
//        in the future to sell that stock.
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//        Example 1:
//        Input: prices = [7,1,5,3,6,4]

//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5
//        (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not
//        allowed because you must buy before you sell.

//        Example 2:
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.
//        Constraints:
//        1 <= prices.length <= 105
//        0 <= prices[i] <= 104