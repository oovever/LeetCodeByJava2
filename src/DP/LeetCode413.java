package DP;

/**
 * @author OovEver
 * 2018/1/4 22:53
 */
public class LeetCode413 {
    public int numberOfArithmeticSlices(int[] A) {
        int curr = 0, sum = 0;
        for(int i=2;i<A.length;i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                curr++;
                sum += curr;
            } else {
                curr = 0;
            }
        }
        return sum;
    }
}
