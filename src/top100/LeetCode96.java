package top100;

/**
 * @author OovEver
 * 2018/1/25 19:35
 */
public class LeetCode96 {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int level=2;level<=n;level++) {
            for(int root=1;root<=level;root++) {
                dp[level] += dp[level - root] * dp[root - 1];
            }
        }
        return dp[n];
    }
}
