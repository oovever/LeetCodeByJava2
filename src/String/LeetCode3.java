package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author OovEver
 * @Date 2017/12/8 23:47
 */
public class LeetCode3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
//        upper记录
        for(int i=0,upper=0;i<s.length();i++) {
            if (map.containsKey(s.charAt(i))) {
                upper = Math.max(upper, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - upper + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
