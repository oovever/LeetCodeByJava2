package DP;

/**
 * @Author OovEver
 * @Date 2017/12/13 13:44
 */
public class LeetCode70 {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for(int i=2;i<=n;i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
