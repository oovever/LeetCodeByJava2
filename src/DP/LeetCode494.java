package DP;

/**
 * @author OovEver
 * 2017/12/25 10:21
 */
public class LeetCode494 {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum < S || (S + sum) % 2 > 0) {
            return 0;
        }
        return subsetSum(nums, (sum + S) / 2);
    }

    public int subsetSum(int[] nums, int s) {
        int[] dp = new int[s + 1];
        dp[0] = 1;
        for (int n : nums) {
            for(int i=s;i>=n;i--) {
                dp[i] += dp[i - n];
            }

        }
        return dp[s];
    }
}
