package Array;

/**
 * @Author OovEver
 * @Date 2017/11/30 22:32
 */
public class LeetCode154 {
    public static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        int min = nums[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            min = Math.min(min, nums[mid]);
            if (nums[mid] < nums[high]) {
                high = mid - 1;
            } else if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high--;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1};
        System.out.println(findMin(nums));

    }
}
