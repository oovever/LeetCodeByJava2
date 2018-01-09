package HashTable;

/**
 * @author OovEver
 * 2018/1/9 22:30
 */
public class LeetCode136 {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i=1;i<nums.length;i++) {
            res ^= nums[i];
        }
        return res;
    }
}
