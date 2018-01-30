package top150;

/**
 * @author OovEver
 * 2018/1/30 21:33
 */
public class LeetCode172 {
    public static int trailingZeroes(int n) {
        return n / 5 == 0 ? 0 : n /5 + trailingZeroes(n / 5);
    }
}
