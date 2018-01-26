package top100;

import java.util.PriorityQueue;

/**
 * @author OovEver
 * 2018/1/25 20:41
 */
public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) return Integer.MAX_VALUE;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++) {
            p.add(nums[i]);
            if (p.size() > k) {
                p.poll();
            }
        }
        return p.poll();
    }

}
