package Array;

import java.util.HashMap;

/**
 * Created by OovEver on 2017/11/13.
 * 很简单的思路，运用hashmap，首先将数组中所有元素的值与所处位置放入map
 * 之后进行遍历，看不等于当前位置的key值是否为target-nums[i]
 * 如果是，则返回(当前位置,target-nums[i]的位置)
 */
public class LeetCode1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], i);
        }
        System.out.println(map.get(1));
        for(int i=0;i<nums.length;i++) {
            if (map.containsKey(target - nums[i])&&map.get(target-nums[i])!=i) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }

}
