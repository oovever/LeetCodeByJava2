package String;

/**
 * @Author OovEver
 * @Date 2017/12/6 10:55
 */
public class LeetCode28 {
    public int strStr(String haystack, String needle) {
        for(int i=0;;i++) {
            for(int j=0;;j++) {
                if (j == needle.length()) {
                    return i;
                }
                if (i + j == haystack.length()) {
                    return -1;
                }
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
        }
    }
}
