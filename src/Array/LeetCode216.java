package Array;

import java.util.ArrayList;
import java.util.List;

public class LeetCode216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), n, k, 1);
        return res;

    }

    private void helper(List<List<Integer>> res, List<Integer> list, int target, int k,int start) {
        if (list.size() > k) {
            return;
        }
        if (list.size() == k && target == 0) {
            List<Integer> li = new ArrayList<>(list);
            res.add(li);
            return;
        }
        for(int i=start;i<=9;i++) {
            if (target - i >= 0) {
                list.add(i);
                helper(res, list, target - i, k, i + 1);
                list.remove(list.size() - 1);
            }

        }
    }
}
