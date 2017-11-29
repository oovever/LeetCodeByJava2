package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author OovEver
 * @Date 2017/11/29 15:57
 */
public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = map.containsKey(n - 1) ? map.getOrDefault(n - 1, 0) : 0;
                int right = map.containsKey(n + 1) ? map.getOrDefault(n + 1, 0) : 0;
                int sum = left + right + 1;
                map.put(n, sum);
                res = Math.max(res, sum);
//                更新boundary
                map.put(n - left, sum);
                map.put(n + res, sum);

            } else {
//                数字重复
                continue;
            }

        }
        return res;
    }
}
