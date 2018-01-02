package DP;

/**
 * @author OovEver
 * 2017/12/27 10:51
 */
public class LeetCode213 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
//        偷第一个房间 就不能偷最后一个房间，不偷第一个房间就可以偷最后一个房间，转化为比较两个House RobberI的问题
        return Math.max(maxRob(nums, 0, nums.length - 2), maxRob(nums, 1, nums.length - 1));
    }

    private int maxRob(int[] nums, int start, int end) {
        int n = end - start + 1;
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);
        for(int i=2;i<n;i++) {
            dp[i] = Math.max(dp[i - 2] + nums[start + i], dp[i - 1]);
        }
        return dp[n - 1];
    }
}
