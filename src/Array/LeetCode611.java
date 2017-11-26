package Array;

import java.util.Arrays;
import java.util.jar.JarEntry;

/**
 * @Author OovEver
 * @Date 2017/11/26 21:49
 */
public class LeetCode611 {
    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int first = 0;
        int res = 0;
        while (first < nums.length - 2) {
            int second = first + 1;
            while (second < nums.length - 1) {
                int twoSum = nums[first] + nums[second];
                int third = second + 1;
                while (third<nums.length&&nums[third] < twoSum) {
                    res++;
                    third++;
                }
                second++;
            }
            first++;
        }
        return res;
    }

//    Arrays.sort(A);
//    int count = 0, n = A.length;
//    for (int i=n-1;i>=2;i--) {
//        int l = 0, r = i-1;
//        while (l < r) {
//            if (A[l] + A[r] > A[i]) {
//                count += r-l;
//                r--;
//            }
//            else l++;
//        }
//    }
//    return count;
}
