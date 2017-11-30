package Array;

import java.util.Stack;

/**
 * @Author OovEver
 * @Date 2017/11/30 21:50
 */
public class LeetCode84 {
    public static int largestRectangleArea(int[] height) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<height.length;i++) {
            if (stack.empty() || stack.peek() < height[i]) {
                stack.push(height[i]);
            } else {
                int count = 0;
                while (!stack.empty() && stack.peek() > height[i]) {
                    count++;
                    res = Math.max(res, stack.pop() * count);
                }
                while (count-->0) {
                    stack.push(height[i]);
                }
                stack.push(height[i]);
            }
        }
        int count = 1;
        while (!stack.isEmpty()) {
            res = Math.max(res, stack.pop() * count);
            count++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(largestRectangleArea(nums));

    }
}
