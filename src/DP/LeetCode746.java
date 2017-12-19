package DP;

/**
 * @Author OovEver
 * @Date 2017/12/19 11:47
 */
public class LeetCode746 {
    public static int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }
        if (cost.length < 2) {
            return cost[0];
        } else if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int[] dp = new int[cost.length + 1];
        for(int i=0;i<cost.length;i++) {
            dp[i] = cost[i];
        }
        for(int i=2;i<=cost.length;i++) {
            dp[i] +=Math.min(dp[i - 1], dp[i - 2]);
        }
        return dp[cost.length];
    }

    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }
}
