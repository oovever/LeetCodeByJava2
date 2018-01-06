package DP;

/**
 * @author OovEver
 * 2018/1/6 16:43
 */
public class LeetCode416 {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for(int i=0;i<nums.length;i++) {
            for(int j=target;j>=nums[i];j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[target];
    }
}
