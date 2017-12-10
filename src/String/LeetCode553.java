package String;

/**
 * @Author OovEver
 * @Date 2017/12/10 22:42
 */
public class LeetCode553 {
    public String optimalDivision(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nums[0]);
        for(int i = 1;i<nums.length;i++) {
            if (i == 1 && nums.length > 2) {
                stringBuilder.append("/(").append(nums[i]);
            } else {
                stringBuilder.append("/").append(nums[i]);
            }
        }
        return nums.length > 2 ? stringBuilder.append(")").toString() : stringBuilder.toString();
    }
}
