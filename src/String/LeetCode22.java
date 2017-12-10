package String;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/12/10 20:59
 */
public class LeetCode22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
//open与close分别为左右括号个数
    public void backtrack(List<String> list, String str, int open, int close, int max){
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }
        if (open < max) {
            backtrack(list, str + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(list, str + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        LeetCode22 test = new LeetCode22();
        System.out.println(test.generateParenthesis(3));

    }
}
