package Array;

import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/11/26 22:38
 */
public class LeetCode120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0) {
            return 0;
        }
        int n = triangle.size();
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for(int i=1;i<n;i++) {
            for(int j=0;j<triangle.get(i).size();j++) {
                if (j == 0) {
                    dp[i][j] = triangle.get(i).get(j) + dp[i - 1][j];
                } else if (j == triangle.get(i).size() - 1) {
                    dp[i][j] = triangle.get(i).get(j) + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
                }

            }
        }
        int min = Integer.MAX_VALUE;
        for(int j=0;j<triangle.get(n-1).size();j++) {
            min = Math.min(min, dp[n - 1][j]);
        }
        return min;
    }
}
