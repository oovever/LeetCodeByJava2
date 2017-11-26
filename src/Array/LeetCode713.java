package Array;

import java.util.jar.JarEntry;

/**
 * @Author OovEver
 * @Date 2017/11/27 0:18
 */
public class LeetCode713 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        long p = 1l;
        int i = 0;
        int j = 0;
        int total = 0;
        while(j < n){
            p *= nums[j];
            while(i <= j&&p >= k){
                p /= nums[i];
                i++;
            }
            total += (j - i + 1);
            j++;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));

    }
}
