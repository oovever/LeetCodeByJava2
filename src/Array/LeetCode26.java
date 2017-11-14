package Array;

/**
 * Created by OovEver on 2017/11/13.
 */
public class LeetCode26 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int id = 1;
        for(int i=1;i<nums.length;i++) {
//           直到找到不与第一位重复的放到第二位
            if(nums[i]!=nums[i-1]) nums[id++] = nums[i];
        }
        return id;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2,2};
        System.out.println(removeDuplicates(nums));

    }
}
