package DP;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/3 10:34
 */
public class LeetCode523 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int runningSum = 0;
       for(int i=0;i<nums.length;i++) {
            runningSum += nums[i];
            if (k != 0) {
                runningSum %= k;
            }
            Integer prev = map.get(runningSum);
           if (prev != null) {
//               连续子数组的长度需要大于2
               if (i - prev > 1) {
                   return true;
               }
           } else {
               map.put(runningSum, i);
           }
        }
        return false;
    }
}
