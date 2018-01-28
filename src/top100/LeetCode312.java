package top100;

/**
 * @author OovEver
 * 2018/1/27 23:33
 */
public class LeetCode312 {
    public int maxCoins(int[] iNums) {
        int[] nums = new int[iNums.length + 2];
        int n = 1;
        for(int x:iNums) nums[n++] = x;
        nums[0] = nums[n++] = 1;
        // dp[i][j]表示从i到j这个window范围内，能组成的最大值
        int[][] dp = new int[n][n];
        // 设置window间隔
        for (int k = 2; k < n; ++k)
            for (int left = 0; left < n - k; ++left) {
                // window[left, right]
                int right = left + k;
                for (int i = left + 1; i < right; ++i)
                    dp[left][right] = Math.max(dp[left][right],
                            nums[left] * nums[i] * nums[right] + dp[left][i] + dp[i][right]);
            }

        return dp[0][n - 1];
    }
}
