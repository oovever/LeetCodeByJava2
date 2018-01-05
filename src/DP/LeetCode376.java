package DP;

/**
 * @author OovEver
 * 2018/1/4 16:02
 */
public class LeetCode376 {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }
        int i = 1;
        for(;i<n;i++) {
            if (nums[i] != nums[i - 1]) {
                break;
            }
        }
        if (i == n) {
            return 1;
        }
        boolean isIncreasing = nums[i] > nums[i - 1] ? true : false;
        i++;
        int max = 2;
        for(;i<n;i++) {
            if (isIncreasing && nums[i] < nums[i - 1]) {
                isIncreasing = false;
                max++;
            } else if (!isIncreasing && nums[i] > nums[i - 1]) {
                isIncreasing = true;
                max++;
            }
        }
        return max;
    }
}
