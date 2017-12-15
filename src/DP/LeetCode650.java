package DP;

/**
 * @Author OovEver
 * @Date 2017/12/15 10:18
 */
public class LeetCode650 {
    public int minSteps(int n) {
        int[] dp = new int[n + 1];
        for(int i=2;i<=n;i++) {
//            所需最大次数，则复制一次，一直粘贴
            dp[i] = i;
            for(int j=i-1;j>1;j--) {
                if (i % j == 0) {
                    dp[i] = dp[j] + (i / j);
                    break;
                }
            }
        }
        return dp[n];
    }
}
