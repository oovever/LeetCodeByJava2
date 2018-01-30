package top150;

/**
 * @author OovEver
 * 2018/1/30 20:12
 */
public class LeetCode171 {
    public static int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int res = 0;
        for(int i=0;i<s.length();i++) {
            res = res * 26 + s.charAt(i) - 'A' + 1;
        }
        return res;
    }

}
