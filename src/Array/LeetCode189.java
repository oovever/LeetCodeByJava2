package Array;

/**
 * Created by OovEver on 2017/11/18.
 */
public class LeetCode189 {
    public  void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k == 0||k == nums.length) {
            return;
        }
//        int []temp = new int[nums.length];
//        for(int i=0;i<nums.length;i++) {
//            temp[i] = nums[i];
//        }
//        for(int i=0;i<k;i++) {
//            nums[i] = nums[nums.length-k+i];
//        }
//        for(int i=k;i<nums.length;i++) {
//            nums[i] = temp[i - k];
//        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    private void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

    }
}
