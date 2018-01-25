package top100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OovEver
 * 2018/1/25 16:45
 */
public class LeetCode46 {
    public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    // Arrays.sort(nums); // not necessary
    backtrack(list, new ArrayList<>(), nums);
    return list;
}

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(permute(nums));
    }
}
