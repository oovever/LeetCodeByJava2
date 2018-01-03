package DP;

/**
 * @author OovEver
 * 2018/1/3 16:40
 * 1的个数等于除了最低位1的个数加上最低位1的个数
 */
public class LeetCode338 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        for(int i=1;i<num+1;i++) {
            res[i] = res[i / 2] + i % 2;
        }
        return res;
    }
}
