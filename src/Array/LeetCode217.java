package Array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            if (map.get(nums[i]) >= 2) {
                return true;
            }

        }
        return false;


//        Set<Integer> set = new HashSet<Integer>();
//        for(int i : nums)
//            if(!set.add(i))// if there is same
//                return true;
//        return false;
    }
}
