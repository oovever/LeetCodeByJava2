package Array;

/**
 * Created by OovEver on 2017/11/14.
 */
public class LeetCode121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices == null) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for(int i=1;i<prices.length;i++) {
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return max;
    }
}
