package Array;

/**
 * @Author OovEver
 * @Date 2017/11/26 13:46
 */
public class LeetCode209 {
    public static int minSubArrayLen(int s, int[] nums) {
        int len = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            while (sum >= s) {
                len = Math.min(len, i - start + 1);
                sum -= nums[start];
                start += 1;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));

    }
}
