package top150;

/**
 * @author OovEver
 * 2018/1/30 20:04
 */
public class LeetCode371 {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
