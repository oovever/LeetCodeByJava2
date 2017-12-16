package DP;

/**
 * @Author OovEver
 * @Date 2017/12/15 10:06
 */
public class LeetCode673 {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int res = 0;
        int max_len = 0;
//        以nums[i]结尾的最长子序列的长度
        int[] len = new int[n];
//        以nums[i]结尾的最长子序列的个数
        int[] count = new int[n];
        for(int i=0;i<n;i++) {
            len[i] = count[i] = 1;
            for(int j=0;j<i;j++) {
                if (nums[i] > nums[j]) {
                    if(len[i]==len[j]+1) count[i] += count[j];
                    if (len[i] < len[j] + 1) {
                        len[i] = len[j] + 1;
                        count[i] = count[j];
                    }
                }
            }
            if(max_len==len[i]) res += count[i];
            if (max_len < len[i]) {
                max_len = len[i];
                res = count[i];
            }
        }
        return res;
    }
}
