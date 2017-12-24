package DP;

/**
 * @author OovEver
 * 2017/12/24 23:53
 */
public class LeetCode467 {
    public int findSubstringInWraproundString(String p) {
        int[] count = new int[26];
//        以某个字符结尾的字符的最大长度
        int maxLength = 0;
        for(int i=0;i<p.length();i++) {
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i) - p.charAt(i - 1) == -25)) {
                maxLength++;
            } else {
                maxLength = 1;
            }
            int index = p.charAt(i) - 'a';
            count[index] = Math.max(count[index], maxLength);
        }
        int sum = 0;
        for(int i=0;i<26;i++) {
            sum += count[i];
        }
        return sum;
    }
}
