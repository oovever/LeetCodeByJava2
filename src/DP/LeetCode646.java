package DP;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author OovEver
 * @Date 2017/12/17 16:41
 */
public class LeetCode646 {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        for(int i=0;i<pairs.length;i++) {
            for(int j=0;j<i;j++) {
                dp[i] = Math.max(pairs[i][0] > pairs[j][1] ? dp[j] + 1 : dp[j], dp[i]);
            }
        }
        return dp[pairs.length-1];
    }


}
