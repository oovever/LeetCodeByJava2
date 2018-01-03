package DP;

import java.util.Arrays;

/**
 * @Author OovEver
 * @Date 2017/12/17 17:13
 */
public class LeetCode300 {
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int max = 1;
        Arrays.fill(dp, 1);
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<i;j++) {
                if (nums[i] > nums[j] && dp[j]+1>dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

}
