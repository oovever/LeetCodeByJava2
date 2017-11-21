package Array;

import java.util.Arrays;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        for(int i=1;i<n;i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count > n / 2) {
                    return nums[i];
                }
            } else {
                count = 1;
            }
        }
        if (count > n / 2) {
            return nums[n - 1];
        }
        return 0;
    }
}
