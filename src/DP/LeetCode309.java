package DP;

/**
 * @author OovEver
 * 2018/1/7 20:23
 */
public class LeetCode309 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int buy = Integer.MIN_VALUE;
        int prebuy = 0;
        int sell = 0;
        int presell = 0;
        for (int price : prices) {
            prebuy = buy;
            buy = Math.max(presell - price, prebuy);
            presell = sell;
            sell = Math.max(presell, prebuy + price);
        }
        return sell;
    }
}
