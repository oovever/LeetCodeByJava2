package Array;

import java.util.Arrays;

public class LeetCode414 {
    public static int thirdMax(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        if (nums.length < 3) {
            return nums[nums.length - 1];
        }
        int n = nums.length;
        int num = 1;
        for(int i=nums.length-1;i>0;i--) {
            if (nums[i] != nums[i - 1]) {
                num++;
            }
            if (num == 3) {
                return nums[i-1];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(thirdMax(nums));
    }
}
