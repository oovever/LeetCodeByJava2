package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by OovEver on 2017/11/13.
 *1. 最简单的方式，将两个数组合并之后排序
 *2.更简单的方法，两点法，因为之前两个数组是已经排序的，所以，直接从后向前遍历两个数组
 * ，每次把两个数组中，相对较大的值，放到nums1的末尾。
 */
public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for(int i=m;i<m+n;i++) {
//            nums1[i] = nums2[i - m];
//        }
//        Arrays.sort(nums1);
        while (n>0) nums1[m + n - 1] = (m == 0 || nums2[n - 1] > nums1[m - 1]) ? nums2[--n] : nums1[--m];

    }
}
