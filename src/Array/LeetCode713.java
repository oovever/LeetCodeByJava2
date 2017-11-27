package Array;

import java.util.jar.JarEntry;

/**
 * @Author OovEver
 * @Date 2017/11/27 0:18
 */
public class LeetCode713 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k < 2) {
            return 0;
        }
        int result = 0;
        int product = 1;
        for(int i=0,right=0;right<nums.length;right++) {
            product *= nums[right];
            while (i <=right && product >= k) {
                product /= nums[i++];
            }
            result += right - i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));

    }
}
