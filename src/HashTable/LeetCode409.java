package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author OovEver
 * 2018/1/8 23:19
 */
public class LeetCode409 {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            if (set.contains(s.charAt(i))) {
                count++;
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        if (set.isEmpty()) {
            return 2 * count;
        } else {
            return 2 * count + 1;
        }

    }
}
