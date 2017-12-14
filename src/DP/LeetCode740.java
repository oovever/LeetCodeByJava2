package DP;

/**
 * @Author OovEver
 * @Date 2017/12/14 20:22
 */
public class LeetCode740 {
    public int deleteAndEarn(int[] nums) {
        int[] count = new int[10001];
        for (int n : nums) {
            count[n] += n;
        }
        int[] dp = new int[10003];
        for(int i=10000;i>=0;i--) {
            dp[i] = Math.max(count[i] + dp[i + 2], dp[i + 1]);
        }
        return dp[0];
    }
}
