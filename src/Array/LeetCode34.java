package Array;

/**
 * @Author OovEver
 * @Date 2017/11/27 13:22
 */
public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int start = -1;
        int end = -1;
        while (low <=high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                start = mid;
                break;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (start != -1) {
            end = start;
            while (start>=1&&nums[start] == nums[start - 1]) {
                start--;
            }
            while (end <= nums.length - 2 && nums[end] == nums[end + 1]) {
                end++;
            }

        }
        return new int[]{start, end};
    }
}
