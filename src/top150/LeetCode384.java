package top150;

import java.util.Random;

/**
 * @author OovEver
 * 2018/1/30 23:37
 */
public class LeetCode384 {
    class Solution {
        private int[] nums;
        Random random;
        public Solution(int[] nums) {
            this.nums = nums;
            random = new Random();
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return nums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            if (nums == null) {
                return nums;
            }
            int[] a = nums.clone();
            for(int j=1;j<a.length;j++) {
                int i = random.nextInt(j + 1);
                swap(a, i, j);
            }
            return a;
        }

        private void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

}
