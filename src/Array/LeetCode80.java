package Array;

/**
 * @Author OovEver
 * @Date 2017/11/26 12:19
 */
public class LeetCode80 {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int id = 1;
        int count = 1;
        for(int i=1;i<nums.length;i++) {
            if (nums[i] == nums[i - 1] && count < 2) {
                nums[id++] = nums[i];
                count++;
            } else if (nums[i] != nums[i - 1]) {
                nums[id++] = nums[i];
                count = 1;
            }
        }
        return id;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3};
        System.out.println(removeDuplicates(nums));

    }
}
