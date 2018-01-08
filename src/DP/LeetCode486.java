package DP;

/**
 * @author OovEver
 * 2018/1/8 13:27
 */
public class LeetCode486 {
    public static boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
//        dp[i][j]表示第一个人比第二个人能多取得多少分数
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++) {
            dp[i][i] = nums[i];
        }
        for(int len=1;len<n;len++) {
            for(int i=0;i<n-len;i++) {
                int j = i + len;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);

            }
        }
        return dp[0][n - 1] >= 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 2};
        System.out.println(PredictTheWinner(nums));
    }
}
