package Array;

import java.util.HashMap;

/**
 * Created by OovEver on 2017/11/13.
 * 开始时候以为数组中的元素是有序的，直接用i!=nums[i]判断的，导致不是排序的数组
 * 失败。使用hashmap，将数组的值和索引存到map中，然后从0到nums.length遍历数组，寻找不连续的数，如果没找到，则不连续的数为最后一个数，即nums.length(),但是消耗了额外的空间。
 * 2.求和
 * 3.异或，因为两个相同的数异或为0，所以剩下的数一定为那个未出现的数
 * 4.二分查找
 */
public class LeetCode268 {
    public int missingNumber(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            map.put(nums[i], i);
//        }
//        for(int i=0;i<nums.length;i++) {
//            if (!map.containsKey(i)) {
//                return i;
//            }
//        }
//        return nums.length;

//        int res = nums.length;
//        for(int i=0; i<nums.length; i++){
//            res ^= i;
//            res ^= nums[i];
//        }
//        return res;

        int len = nums.length;
        int sum = (0 + len) * (len + 1) / 2;
        for(int i=0;i<nums.length;i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(0^1);
    }
}
