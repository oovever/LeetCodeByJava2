package top100;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author OovEver
 * 2018/1/28 22:07
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(Collections.reverseOrder());
        int[] res = new int[nums.length + 1 - k];
        for(int i=0;i<nums.length;i++) {
            if (i >= k) {
                priorityQueue.remove(nums[i - k]);
            }
            priorityQueue.offer(nums[i]);
            if(i + 1 >= k) res[i + 1 - k] = priorityQueue.peek();
        }
        return res;
    }
}
