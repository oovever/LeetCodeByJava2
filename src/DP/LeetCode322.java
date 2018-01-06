package DP;

import java.util.Arrays;

/**
 * @author OovEver
 * 2018/1/6 14:41
 */
public class LeetCode322 {
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        for (int i=0;i<coins.length;i++) {
            if (coins[i] == amount) {
                return 1;
            }
        }
//        dp[i]表示组成i元钱需要的最少的硬币的个数
        int[] dp = new int[amount + 1];
        for(int i=0;i<coins.length;i++) {
            if (coins[i] <= amount) {
                dp[coins[i]] = 1;
            }
        }
        for(int i=0;i<coins.length;i++) {
            for(int j=coins[i];j<=amount;j++) {
                if (dp[j] != 0 && dp[j - coins[i]] != 0) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                } else if (dp[j - coins[i]] != 0) {
                    dp[j] = dp[j - coins[i]] + 1;
                }
            }
        }
        if (dp[amount] == 0) {
            return -1;
        }
        return dp[amount];
    }

}
