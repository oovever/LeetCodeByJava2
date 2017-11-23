package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
                int lo=i+1;
                int hi = nums.length - 1;
            }
        }
    }
}
