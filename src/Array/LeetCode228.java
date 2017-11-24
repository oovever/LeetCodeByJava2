package Array;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int start = nums[0];
        int end = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                end = nums[i + 1];
                continue;
            }else if (nums[i + 1] != nums[i] + 1) {
                end = nums[i];
                if (start == end) {
                    res.add(String.valueOf(start));
                    start = end = nums[i + 1];
                } else {
                    res.add(String.valueOf(start) + "->" + String.valueOf(end));
                    start = end = nums[i + 1];
                }
            }
        }
        if (start == end) {
            res.add(String.valueOf(start));
        }else {
            res.add(String.valueOf(start) + "->" + String.valueOf(end));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums));
    }
}
