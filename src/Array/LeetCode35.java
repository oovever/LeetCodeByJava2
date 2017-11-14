package Array;

/**
 * Created by OovEver on 2017/11/14.
 */
public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
//        if(nums[0]>=target)
//            return 0;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]>=target&&nums[i-1]<target){
//                return i;
//            }
//        }
//        return nums.length;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low++;
            } else if (nums[mid] > target) {
                high--;
            }
        }
        return low;
    }
}
