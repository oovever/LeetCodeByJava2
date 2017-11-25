package Array;

public class LeetCode152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int r = nums[0];
        int imax = r;
        int imin = r;
        for (int i=1;i<nums.length;i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i], imax * nums[i]);
            imin = Math.min(nums[i], imin * nums[i]);
            r = Math.max(r, imax);
        }
        return r;
    }
}
