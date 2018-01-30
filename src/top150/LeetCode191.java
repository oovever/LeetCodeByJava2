package top150;

/**
 * @author OovEver
 * 2018/1/30 21:22
 */
public class LeetCode191 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
