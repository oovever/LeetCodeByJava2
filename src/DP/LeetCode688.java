package DP;

/**
 * @Author OovEver
 * @Date 2017/12/16 14:29
 */
public class LeetCode688 {
    int[][] moves = {{1, 2}, {1, -2}, {2, 1}, {2, -1}, {-1, 2}, {-1, -2}, {-2, 1}, {-2, -1}};
    public double knightProbability(int N, int K, int r, int c) {
        double[][][] dp = new double[K + 1][N][N];
        return helper(dp, N, K, r, c) / Math.pow(8.0, K);
    }

    private double helper(double[][][] dp, int N, int k, int r, int c) {
        if(r<0||r>=N||c<0||c>=N) return 0.0;
        if (k == 0) {
            return 1.0;
        }
//        如果遇到之前遍历过的直接返回
        if (dp[k][r][c] != 0.0) return dp[k][r][c];
        for(int i=0;i<8;i++) {
            dp[k][r][c] += helper(dp, N, k - 1, r + moves[i][0], c + moves[i][1]);
        }
        return dp[k][r][c];
    }
}
