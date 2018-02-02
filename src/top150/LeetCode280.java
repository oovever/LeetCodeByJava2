package top150;

/**
 * @author OovEver
 * 2018/2/1 13:52
 */
public class LeetCode280 {
    public void wiggleSort(int[] nums) {
        /* condition: nums[odd] >= nums[even]
         * 1. sort => [1, 2, 3, 4, 5, 6] => swap(i, i+1)
         * 2. swap if a. nums[i] < nums[i+1] i = odd
         *            b. nums[i] > nums[i+1] i = even
         */
        for(int i = 0; i < nums.length - 1; i++) {
            if(i % 2 == 1 && nums[i] < nums[i+1]) swap(nums, i, i+1);
            if(i % 2 == 0 && nums[i] > nums[i+1]) swap(nums, i, i+1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        LeetCode280 test = new LeetCode280();
        int[] nums = {3, 5, 2, 1, 6, 4,};
        test.wiggleSort(nums);
        for(int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }
    }
}
