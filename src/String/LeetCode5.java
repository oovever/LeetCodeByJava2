package String;

/**
 * @Author OovEver
 * @Date 2017/12/9 16:39
 */
public class LeetCode5 {
    private int lo, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        for(int i=0;i<s.length();i++) {
            extendPalindrome(s, i, i);//奇数
            extendPalindrome(s, i, i + 1);//偶数
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }


}
