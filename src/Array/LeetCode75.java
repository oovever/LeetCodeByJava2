package Array;

public class LeetCode75 {
    public static void sortColors(int[] nums) {
        int[] numNumber = new int[3];
        for (int n : nums) {
            numNumber[n]++;
        }
        int len = 0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<numNumber[i];j++) {
                nums[len++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        sortColors(nums);

    }
}
