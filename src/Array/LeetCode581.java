package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/11/16.
 */
public class LeetCode581 {
    //    public int findUnsortedSubarray(int[] nums) {
//        if (nums.length < 1 || nums == null) {
//            return 0;
//        }
//        if (nums.length == 1) {
//            return 1;
//        }
//
//        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;
//        int minI = 0;
//        int maxI = 0;
//        for(int i=0;i<nums.length;i++) {
//            if (min > nums[i]) {
//                min = nums[i];
//                minI = i;
//            }
//            if (max < nums[i]) {
//                max = nums[i];
//                maxI = i;
//            }
//
//        }
//    }
    public static int findUnsortedSubarray(int[] A) {
//
//        int   n    = nums.length;
//        int[] temp = new int[n];
//        for (int i = 0; i < n; i++) temp[i] = nums[i];
//        Arrays.sort(temp);
//
//        int start = 0;
//        while (start < n && nums[start] == temp[start]) start++;
//        System.out.println(start);
//        int end = n - 1;
//        while (end > start && nums[end] == temp[end]) end--;
//        System.out.println(end);
//        return end - start + 1;
        int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
        for (int i=1;i<n;i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[n-1-i]);
            if (A[i] < max) end = i;
            if (A[n-1-i] > min) beg = n-1-i;
        }
        return end - beg + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 5, 6};
        System.out.println(findUnsortedSubarray(nums));
    }
}
