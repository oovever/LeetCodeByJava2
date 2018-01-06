package DP;

/**
 * @author OovEver
 * 2018/1/5 11:20
 */
public class LeetCode576 {
//   public static int findPaths(int m, int n, int N, int i, int j) {
//        long[][][] dp = new long[N + 1][m][n];
//        for(int step=1;step<N+1;step++) {
//            for(int row=0;row<m;row++) {
//                for (int col=0;col<n;col++) {
//                    dp[step][row][col] = ((row == 0 ? 1 : dp[step - 1][row - 1][col]) +
//                            (row == m - 1 ? 1 : dp[step - 1][row + 1][col]) +
//                            (col == 0 ? 1 : dp[step - 1][row][col - 1]) +
//                            (col == n - 1 ? 1 : dp[step - 1][row][col + 1])
//                    )% 1000000007;
//                }
//            }
//        }
//        return (int)dp[N][i][j];
//    }
     public static int findPaths(int m, int n, int N, int i, int j) {
         if (N <= 0) return 0;
         final int MOD = 1000000007;
         int[][] count = new int[m][n];
         count[i][j] = 1;
         int result = 0;
         int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
         for (int step = 0; step < N; step++) {
             int[][] temp = new int[m][n];
             for (int r = 0; r < m; r++) {
                 for (int c = 0; c < n; c++) {
                     for (int[] d : dirs) {
                         int nr = r + d[0];
                         int nc = c + d[1];
                         if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                             result = (result + count[r][c]) % MOD;
                         } else {
                             temp[nr][nc] = (temp[nr][nc] + count[r][c]) % MOD;
                         }
                     }
                 }

             }
             count = temp;
         }
         return result;
     }
    public static void main(String[] args) {
        System.out.println(findPaths(3, 3, 2, 1, 1));
    }
}
