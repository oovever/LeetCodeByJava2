package Array;

/**
 * @Author OovEver
 * @Date 2017/11/27 17:16
 */
public class LeetCode31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return;
        }
        int index = n - 1;
        while (index > 0) {
            if (nums[index - 1] < nums[index]) {
                break;
            }
            index--;
        }
        if (index == 0) {
            reverseSort(nums, 0, n - 1);
        } else {
            int val = nums[index - 1];
            int j = n - 1;
            while (j >= index) {
                if (nums[j] > val) {
                    break;
                }
                j--;
            }
            swap(nums, index - 1, j);
            reverseSort(nums, index, n - 1);
        }

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverseSort(int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        for(int i=start;i<=(start+end)/2;i++) {
            swap(nums, i, start + end - i);
        }
    }
}
