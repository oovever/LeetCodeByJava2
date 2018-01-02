package DP;

import java.util.Arrays;

/**
 * @Author OovEver
 * @Date 2017/12/17 17:25
 */
public class LeetCode279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i<=n;i++) {
            int min = Integer.MAX_VALUE;
            int j = 1;
            while (i - j * j >= 0) {
                min = Math.min(dp[i - j * j] + 1, min);
                j++;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
