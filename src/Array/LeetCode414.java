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


//        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;
//        for (int num : nums) {
//            if (num == max1 || num == max2 || num == max3) continue;
//            if (num > max1) {
//                max3 = max2;
//                max2 = max1;
//                max1 = num;
//            } else if (num > max2) {
//                max3 = max2;
//                max2 = num;
//            } else if (num > max3) {
//                max3 = num;
//            } /* else discard */
//        }
//        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(thirdMax(nums));
    }
}
