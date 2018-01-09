package HashTable;

import java.util.Stack;

/**
 * @author OovEver
 * 2018/1/10 0:03
 */
public class LeetCode739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4};
        System.out.println(dailyTemperatures(nums));

    }
}
