package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/9 10:17
 */
public class LeetCode594 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int result = 0;
        for (int k : map.keySet()) {
            if (map.containsKey(k + 1)) {
                result = Math.max(result, map.get(k) + map.get(k + 1));
            }
        }
        return result;
    }
}
