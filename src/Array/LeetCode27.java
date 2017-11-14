package Array;

/**
 * Created by OovEver on 2017/11/13.
 * 与26题类似，判断数组中的元素是否与val相等，如果不等，则从nums[0]位置处放入数组
 */
public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int id=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val) nums[id++]=nums[i];
        }
        return id;
    }
}
