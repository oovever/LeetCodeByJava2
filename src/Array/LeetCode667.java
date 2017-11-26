package Array;

/**
 * @Author OovEver
 * @Date 2017/11/26 12:53
 */
public class LeetCode667 {
    public static int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int num = 1;
        int i = 0;
        for (i = 0; i < k && i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = num++;
            } else {
                res[i] = n;
                n--;
            }
        }
        for(;i<res.length;i++) {
            if (k % 2 == 0) {
                res[i] = n;
                n--;
            } else if (k % 2 != 0) {
                res[i] = num;
                num++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(constructArray(10, 9));
    }
}
