package Array;

/**
 * @Author OovEver
 * @Date 2017/11/26 23:43
 */
public class LeetCode55 {
    public static boolean canJump(int[] nums) {
        int last = nums.length - 1;
        for(int i=nums.length-2;i>=0;i--) {
            if(i+nums[i]>=last) last = i;
        }
        return last == 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 0, 0};
        System.out.println(canJump(nums));

    }
}
