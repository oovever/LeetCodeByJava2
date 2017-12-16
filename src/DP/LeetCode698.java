package DP;

/**
 * @Author OovEver
 * @Date 2017/12/16 14:16
 */
public class LeetCode698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (k<=0||sum % k != 0) {
            return false;
        }
        int target = sum / k;
        int[] visited = new int[nums.length];
        return canPartition(nums, visited, 0, k, 0, target);
    }

    public boolean canPartition(int[] nums, int[] visited, int start_index, int k, int cur_sum, int target) {
        if (k == 1) {
            return true;
        }
        if(cur_sum==target) return canPartition(nums, visited, 0, k - 1, 0, target);
        for(int i=start_index;i<nums.length;i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                if (canPartition(nums, visited, i + 1, k, cur_sum + nums[i],  target)) {
                    return true;
                }
                visited[i] = 0;
            }

        }
        return false;
    }
}
