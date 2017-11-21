package Array;

import java.util.HashSet;
import java.util.Set;

public class LeetCode532 {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> used = new HashSet<>();
        int count = 0;
        if (k == 0) {
            for (int i=0;i<nums.length;i++) {
                if (set.contains(nums[i]) && !used.contains(nums[i])) {
                    count++;
                    used.add(nums[i]);
                } else {
                    set.add(nums[i]);
                }
            }
            return count;
        }
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++) {
            if (!used.contains(nums[i]) && set.contains(nums[i] + k)) {
                count++;
                used.add(nums[i]);
            }
        }
        return count;
    }
}
