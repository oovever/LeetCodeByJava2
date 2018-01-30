package top100;

import java.util.Stack;

/**
 * @author OovEver
 * 2018/1/29 15:45
 */
public class LeetCode85 {
    public static int maximalRectangle(char[][] matrix) {
        int max = 0;
        if(matrix.length == 0) return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                // 如果是第一行就是自身，如果遇到0则停止累加
                dp[i][j] =  i == 0 ? matrix[i][j] - '0' : matrix[i][j] == '1' ? dp[i-1][j] + matrix[i][j] - '0' : 0;
            }
        }
        for(int i = 0; i < dp.length; i++){
            //找每行的最大矩形
            int tmp = largestRectangleArea(dp[i]);
//            int tmp = findRowMax(i, dp);
            max = Math.max(max, tmp);
        }
        return max;
    }
    public static int largestRectangleArea(int[] height) {
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

    public static void main(String[] args) {
        char[][] nums = {{'1', '0', '1', '0', '0'}, {'1', '0', '1','1','1'}, {'1','1', '1','1','1'}, {'1', '0', '0', '1', '0',}};
        System.out.println(maximalRectangle(nums));

    }
}
