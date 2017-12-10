package String;

import java.util.Stack;

/**
 * @Author OovEver
 * @Date 2017/12/10 16:20
 */
public class LeetCode227 {
        public static int calculate(String s) {
            int len = 0;
            if (s == null || (len = s.length()) == 0) {
                return 0;
            }
            Stack<Integer> stack = new Stack<>();
            char sign = '+';
            int num = 0;
            for(int i=0;i<s.length();i++) {
                if (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                }
                if (!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i) || i == len - 1) {
                    switch (sign) {
                        case '+':
                            stack.push(num);
                            break;
                        case '-':
                            stack.push(-num);
                            break;
                        case '*':
                            stack.push(stack.pop()*num);
                            break;
                        case '/':
                            stack.push(stack.pop()/num);
                            break;
                    }
                    sign = s.charAt(i);
                    num = 0;
                }
            }
            int re = 0;
            for(int i:stack){
                re += i;
            }
            return re;
        }


    public static void main(String[] args) {
        System.out.println(calculate("1"));

    }
}
