package Array;

import java.util.Arrays;

/**
 * Created by OovEver on 2017/11/18.
 */
public class LeetCode561 {
    public int arrayPairSum(int[] nums) {
        if(nums.length==0||nums==null)
            return 0;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
