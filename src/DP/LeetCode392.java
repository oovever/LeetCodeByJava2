package DP;

/**
 * @author OovEver
 * 2018/1/3 11:11
 */
public class LeetCode392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (s.charAt(indexS) == t.charAt(indexT)) {
                indexS++;
                if (indexS == s.length()) {
                    return true;
                }
            }

            indexT++;
        }
        return false;
    }
}
