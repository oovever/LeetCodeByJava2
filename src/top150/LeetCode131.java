package top150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OovEver
 * 2018/1/31 21:13
 */
public class LeetCode131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        helper(result, list, s);
        return result;
    }

    private void helper(List<List<String>> result, List<String> list, String s) {
        if (s.length() == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=1;i<=s.length();i++) {
            if (!isPalindrome(s.substring(0, i))) {
                continue;
            }
            list.add(s.substring(0, i));
            helper(result, list, s.substring(i));
            list.remove(list.size() - 1);
        }
    }
    private boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
