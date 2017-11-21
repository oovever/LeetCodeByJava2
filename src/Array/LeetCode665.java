package Array;

/**
 * Created by OovEver on 2017/11/18.
 */
public class LeetCode665 {
    public boolean checkPossibility(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return true;
        }
        int modify = 0;
        for(int i=1;i<nums.length;i++) {
            if (nums[i - 1] > nums[i]) {
                if(modify++>0) return false;
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
