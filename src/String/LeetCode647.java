package String;

/**
 * @Author OovEver
 * @Date 2017/12/8 21:03
 */
public class LeetCode647 {
    int count = 0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++) {
//           i作为middle索引的回文数
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        return count;
    }

    private void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
    }
}
