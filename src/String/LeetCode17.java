package String;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/12/10 23:08
 */
public class LeetCode17 {
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> ret = new LinkedList<String>();
        if(digits == null || digits.length() == 0) return ret;
        combination("", digits, 0, ret);
        return ret;
    }

    private void combination(String prefix, String digits, int offset, List<String> ret) {
        if (offset == digits.length()) {
            ret.add(prefix);
            return;
        }
        String leeters = KEYS[digits.charAt(offset) - '0'];
        for(int i=0;i<leeters.length();i++) {
            combination(prefix + leeters.charAt(i), digits, offset + 1, ret);
        }
    }

    public static void main(String[] args) {
        LeetCode17 test = new LeetCode17();
        System.out.println(test.letterCombinations(""));

    }
}
