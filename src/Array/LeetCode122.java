package Array;

/**
 * Created by OovEver on 2017/11/14.
 */
public class LeetCode122 {
    public int maxProfit(int[] prices) {
        int profit = 0, i = 0;
        while (i < prices.length) {
            while (i < prices.length-1 && prices[i + 1] <= prices[i]) {
                i++;
            }
            int min = prices[i++];
            while (i < prices.length - 1 && prices[i + 1] >= prices[i]) {
                i++;
            }
            profit+=i<prices.length?prices[i++]-min:0;
        }
        return profit;
    }
}
