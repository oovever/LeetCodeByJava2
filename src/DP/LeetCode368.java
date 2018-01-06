package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author OovEver
 * 2018/1/4 23:23
 */
public class LeetCode368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        int []dp=new int[nums.length];
        Arrays.fill(dp, 1);
//        dp[i]表示0到i中最大的可整除子序列中元素的个数
        for (int i=1;i<nums.length;i++) {
            for(int j=i-1;j>=0;j--) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int maxIndex = 0;
        for(int i=1;i<nums.length;i++) {
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = nums[maxIndex];
        int curDp = dp[maxIndex];
        for(int i=maxIndex;i>=0;i--) {
            if (temp%nums[i]==0 && curDp == dp[i]) {
                res.add(nums[i]);
                temp = nums[i];
                curDp--;
            }
        }
        return res;
    }
}
