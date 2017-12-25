package DP;

/**
 * @author OovEver
 * 2017/12/25 9:59
 */
public class LeetCode474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int[] count = count(s);
            for(int i=m;i>=count[0];i--) {
                for(int j=n;j>=count[1];j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - count[0]][j - count[1]]);
                }
            }
        }
        return dp[m][n];
    }

    /**
     * 统计s中0与1的数量
     * @param s 要统计的字符串
     * @return 字符串中0与1的数量
     */
    private int[] count(String s) {
        int[] res = new int[2];
        for(int i=0;i<s.length();i++) {
            res[s.charAt(i) - '0']++;
        }
        return res;
    }
}
