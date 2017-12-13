package DP;

/**
 * @Author OovEver
 * @Date 2017/12/13 13:49
 */
public class LeetCode198 {
    public int rob(int[] nums) {
        if (nums==null||nums.length==0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for(int i=2;i<n;i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n-1];
    }
}
