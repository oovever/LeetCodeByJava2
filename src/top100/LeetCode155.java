package top100;

import java.util.Stack;

/**
 * @author OovEver
 * 2018/1/25 13:10
 */
public class LeetCode155 {
    class MinStack {
        int min = Integer.MAX_VALUE;
        Stack<Integer> stack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
        }

        public void push(int x) {
            if (x <= min) {
                stack.push(min);
                min = x;
            }
            stack.push(x);
        }

        public void pop() {
            if(stack.pop() == min) min=stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }
}
