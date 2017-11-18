package Array;

/**
 * Created by OovEver on 2017/11/18.
 */
public class LeetCode674 {
    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int len = 1;
        int maxLen = 1;
        for(int i=1;i<nums.length;i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                maxLen = Math.max(len, maxLen);
                len = 1;
            }
        }
        maxLen = Math.max(len, maxLen);
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2};
        System.out.println(findLengthOfLCIS(nums));
    }
}
