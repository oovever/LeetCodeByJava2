package top150;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author OovEver
 * 2018/1/31 23:13
 */
public class LeetCode150 {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int a, b;
        for(int i=0;i<tokens.length;i++) {
            if (tokens[i].equals("+")) {
                stack.add(stack.pop() + stack.pop());
            } else if (tokens[i].equals("-")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b - a);
            } else if (tokens[i].equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (tokens[i].equals("/")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }

        }
        return stack.pop();
    }

}
