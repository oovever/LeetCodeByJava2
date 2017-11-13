package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/11/13.
 * 题目理解有问题，给一个数组，出现最多的元素，为该数组的度，找出一个连续子数组满足这个度
 * 思路：用两个map,第一个存储nums[i]与度
 * 第二个map存储范围
 * 遍历第一个map找到最大的度
 * 遍历第二个map找出最小的范围
 */
public class LeetCode697 {
    public int findShortestSubArray(int[] nums) {
        int degree = 0;
        int minSize = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer[]> map2 = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            degree = Math.max(degree, map.get(nums[i]));
            if(map2.get(nums[i])==null) map2.put(nums[i], new Integer[2]);
            Integer[] numsRange = map2.get(nums[i]);
            if(numsRange[0]==null) numsRange[0] = i;
            numsRange[1] = i;
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) != degree) {
                continue;
            }
            Integer[] rang = map2.get(key);
            minSize = Math.min(minSize, rang[1] - rang[0] + 1);
        }
        return minSize;
    }
}
