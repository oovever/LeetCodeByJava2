package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author OovEver
 * 2018/1/9 22:47
 */
public class LeetCode645 {
    public int[] findErrorNums(int[] nums) {
        int[] digit = new int[nums.length + 1];
        int repeat = -1;
        int notContain = -1;
        for(int i=0;i<nums.length;i++) {
            digit[nums[i]]++;
        }
        for(int i=1;i<=nums.length;i++) {
            if (digit[i] > 1) {
                repeat = i;
            }
            if (digit[i] == 0) {
                notContain = i;
            }
        }
        if (repeat != -1 && notContain != -1) {
            return new int[]{repeat, notContain};
        }
        if (notContain == -1) {
            if (repeat > 1) {
                return new int[]{repeat, repeat - 1};
            } else {
                return new int[]{repeat, repeat + 1};
            }
        }
        return new int[]{};

    }

}
