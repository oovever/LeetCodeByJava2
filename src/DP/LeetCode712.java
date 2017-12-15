package DP;

/**
 * @Author OovEver
 * @Date 2017/12/15 9:17
 */
public class LeetCode712 {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int max = Integer.MAX_VALUE;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
//        dp[i][j]表示从当前位置开始，两个字符串删除得到最小的ASCii和使两个字符串相等
        int[][] dp = new int[m + 1][n + 1];
        for(int i=m;i>=0;i--) {
            for(int j=n;j>=0;j--) {
                if (i < m || j < n) {
                    dp[i][j] = i < m && j < n && a[i] == b[j] ? dp[i + 1][j + 1] : Math.min((i < m ? a[i] + dp[i + 1][j] : max), j < n ? b[j] + dp[i][j + 1] : max);
                }
            }
        }
        return dp[0][0];
    }
}
