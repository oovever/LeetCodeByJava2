package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode229 {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > len / 3) {
                if(!res.contains(n))
                res.add(n);
            }
        }
        return res;
    }
}
