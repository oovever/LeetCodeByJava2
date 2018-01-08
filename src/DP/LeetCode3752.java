package DP;

/**
 * @author OovEver
 * 2018/1/8 13:46
 */
public class LeetCode3752 {
    public static int getMoneyAmount(int n) {
//        其中dp[i][j]表示从数字i到j之间猜中任意一个数字最少需要花费的钱数
        int[][] dp = new int[n + 1][n + 1];
//        j代表当前的处理长度
        for(int j=2;j<=n;j++) {
            for(int i=j-1;i>0;i--) {
                int globalMin = Integer.MIN_VALUE;
                for(int k=i+1;k<j;k++) {
                    int localMax =k+ Math.max(dp[i][k - 1], dp[k + 1][j]);
                    globalMin = Math.min(globalMin, localMax);
                }
                dp[i][j] = i + 1 == j ? i : globalMin;
            }
        }
        return dp[1][n];
    }


    public static void main(String[] args) {
        System.out.println(getMoneyAmount(4));

    }
}
