package Array;

public class LeetCode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int maxLen = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxLen = Math.max(maxLen, count);
                count = 0;
            }
        }
        maxLen = Math.max(maxLen, count);
        return maxLen;
    }
}
