package top100;

import java.util.Stack;

/**
 * @author OovEver
 * 2018/1/29 15:07
 */
public class LeetCode84 {
    public int largestRectangleArea(int[] height) {
        if(height.length == 0) return 0;
        Stack<Integer> stk = new Stack<Integer>();
        int i = 1, max = height[0];
        stk.push(0);
        while(i < height.length || (i == height.length && !stk.isEmpty())){
            // i==height.length 说明目前栈顶已经是最后一个竖条，那就要开始pop了
            if(i != height.length && ( stk.isEmpty() || height[i] >= height[stk.peek()] )){
                stk.push(i);
                i++;
            } else {
                // pop后栈为空的话说明之前所有竖条都比刚pop出来的矮
                int top = height[stk.pop()];
                int currMax = !stk.isEmpty() ? top * (i - stk.peek() - 1) : top * i;
                max = Math.max(currMax, max);
            }
        }
        return max;
    }
}
