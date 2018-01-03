package DP;

import java.util.Arrays;

/**
 * @author OovEver
 * 2018/1/3 16:11
 */
public class LeetCode377 {
    public static int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
//        dp[i]表示，以i为target有多少种组成情况
        int[] dp = new int[target + 1];
        for(int i=1;i<target+1;i++) {
            for (int num : nums) {
                if (i < num) {
                    break;
                }
                if (i == num) {
                    dp[i] += 1;
                } else {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(combinationSum4(nums, 4));
    }
}
