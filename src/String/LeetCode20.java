package String;

import java.util.Stack;

/**
 * @Author OovEver
 * @Date 2017/12/2 18:21
 */
public class LeetCode20 {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (stack.size() == 0) {
                    return false;
                }
                if (s.charAt(i) == ')') {
                    if (stack.pop() != '(') {
                        return false;
                    }
                } else   if (s.charAt(i) == '}') {
                    if (stack.pop() != '{') {
                        return false;
                    }
                }else if (s.charAt(i) == ']') {
                    if (stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.size() == 0 ? true : false;
    }

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
}
