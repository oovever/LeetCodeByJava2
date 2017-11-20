package Array;

public class LeetCode724 {
    public static int pivotIndex(int[] nums) {
        if(nums==null||nums.length<=1){
            return -1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if (sum - nums[0] == 0) {
            return 0;
        }
        int sum2=0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum2 += nums[i];
            if (sum - sum2-nums[i+1] == sum2) {
                return i + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
