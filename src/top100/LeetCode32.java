package top100;

import java.util.Stack;

/**
 * @author OovEver
 * 2018/1/29 21:47
 */
public class LeetCode32 {
    public static int longestValidParentheses_dynamicProgramming(String s) {
        int[] maxCount = new int[s.length()];
        int maxLength = 0;
        for(int i = 1 ; i<s.length() ; i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i-1)=='('){
                    maxCount[i] = (i>=2? maxCount[i-2]+2 : 2);
                    maxLength = Math.max(maxCount[i], maxLength);
                }else{
                    if(i-maxCount[i-1]-1>=0 && s.charAt(i-maxCount[i-1]-1)=='('){
                        maxCount[i] = maxCount[i-1]+2 + ((i-maxCount[i-1]-2 >= 0)?maxCount[i-maxCount[i-1]-2]:0);
                        maxLength = Math.max(maxCount[i], maxLength);
                    }
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "()((()))";
        System.out.println(longestValidParentheses_dynamicProgramming(s));
    }
}
