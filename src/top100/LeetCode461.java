package top100;

/**
 * @author OovEver
 * 2018/1/23 22:12
 */
public class LeetCode461 {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int res = 0;
        while (xor != 0) {
            res += xor & 1;
            xor=xor>> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
}
