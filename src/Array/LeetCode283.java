package Array;

/**
 * Created by OovEver on 2017/11/14.
 */
public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int id=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[id++]=nums[i];
            }
        }
        for(int i=id;i<nums.length;i++){
            nums[i]=0;
        }

    }
}
