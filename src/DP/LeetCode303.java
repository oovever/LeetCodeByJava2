package DP;

/**
 * @Author OovEver
 * @Date 2017/12/13 13:28
 */
public class LeetCode303 {
    class NumArray {
        int[]dp;
        public NumArray(int[] nums) {
            if (nums == null || nums.length == 0) {
                return;
            }
            int n = nums.length;
            dp = new int[n];
            dp[0] = nums[0];
            for(int i=1;i<n;i++) {
                dp[i] += nums[i] + dp[i - 1];
            }

        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return dp[j];
            } else {
                return dp[j] - dp[i - 1];
            }
        }
    }
}
