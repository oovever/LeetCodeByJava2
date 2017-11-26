package Array;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author OovEver
 * @Date 2017/11/26 14:35
 */
public class LeetCode560 {
    public static int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-174, 703, 438, 871, -241, 781, 429, -215, 177, 273, -628, 106, 235, -410, 145, -793, -451, 913, 807, 596, -982, 709, 585, -629, 966, 623, 947, -467, -405, 552, -858, 8, -252, -128, -659, -233, -836, 588, 324, -817, 175, -329, 510, -388, 878, 398, 231, 730, 66, -528, 857, 383, 928, -924, 199, -750, -868, -652, -133, 408, 391, 685, 483, -31, -986, 945, 271, 778, -96, 677, -961, -130, 990, -891, -431, -317, -676, 479, -919, -20, -814, 3, -89, 34, -292, 548, 201, -119, -94, -442, -934, -491, 208, -722, 115, 527, 73, 636, -681, 857};
        System.out.println(subarraySum(nums, -469));
    }
}
