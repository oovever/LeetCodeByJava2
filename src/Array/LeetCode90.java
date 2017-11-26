package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/11/26 13:25
 */
public class LeetCode90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTracking(res, new ArrayList<>(), 0, nums);
        return res;
    }

    private void backTracking(List<List<Integer>> res, List<Integer> listItem, int start,int []nums) {
        res.add(new ArrayList<>(listItem));
        for(int i=start;i<nums.length;i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            listItem.add(nums[i]);
            backTracking(res, listItem, i + 1, nums);
            listItem.remove(listItem.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        LeetCode90 test = new LeetCode90();
        System.out.println(test.subsetsWithDup(nums));

    }
}
