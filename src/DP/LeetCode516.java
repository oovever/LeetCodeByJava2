package DP;

/**
 * @author OovEver
 * 2017/12/25 11:03
 */
public class LeetCode516 {
    public int longestPalindromeSubseq(String s) {
//        dp[i][j]表示i到j范围最长的回文串
//        dp[i][j] = dp[i+1][j-1] + 2 if s.charAt(i) == s.charAt(j)
//        otherwise, dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1])
        int[][] dp = new int[s.length()][s.length()];
        for(int i=s.length()-1;i>=0;i--) {
            dp[i][i] = 1;
            for(int j=i+1;j<s.length();j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];

    }
}
