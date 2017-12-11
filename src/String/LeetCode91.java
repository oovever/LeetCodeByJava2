package String;

/**
 * @Author OovEver
 * @Date 2017/12/11 21:03
 */
public class LeetCode91 {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
//        dp表示第i个元素有几种decode方式
        int[] dp = new int[n + 1];
//        空元素有一种解压方式
        dp[0] = 1;
//        第一个元素的解压方式
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i=2;i<=n;i++) {
            int first = Integer.parseInt(s.substring(i - 1, i));
            int second = Integer.parseInt(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                dp[i] += dp[i - 1];
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

}
