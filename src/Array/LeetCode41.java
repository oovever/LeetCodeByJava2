package Array;

/**
 * @Author OovEver
 * @Date 2017/11/30 20:52
 */
public class LeetCode41 {
    public static int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++) {
//            判断当前位置的元素是否为应当放的元素，如位置0放1位置放2
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
//                如果不是，交换两个位置的元素
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }

        }
        for(int i=0;i<nums.length;i++) {
//            正数不连续
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(nums));

    }
}
