package Array;

import java.util.Arrays;

public class LeetCode16 {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int min = nums[0]+nums[1]+nums[2];
        int sum;
        for(int i=0;i<nums.length-2;i++) {
                int lo = i + 1;
                int hi = nums.length - 1;
                while (lo < hi) {
                    sum = nums[lo] + nums[hi] + nums[i];
                    if (Math.abs(target - min) > Math.abs(target - sum)) {
                        min = sum;
                        if (min == target) {
                            return min;
                        }
                    }
                    if (sum > target) {
                        hi--;
                    } else {
                        lo++;
                    }

                }
            }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0};
        System.out.println(threeSumClosest(nums, 100));
    }
}
