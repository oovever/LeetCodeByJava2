package Array;

import java.util.HashSet;
import java.util.Set;

public class LeetCode287 {
    public int findDuplicate(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return n;
            }
        }
        return res;
    }
}
