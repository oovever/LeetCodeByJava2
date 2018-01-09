package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/9 0:10
 */
public class LeetCode389 {
    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        map.put(t.charAt(s.length()), map.getOrDefault(t.charAt(s.length()), 0) - 1);
        for (char key : map.keySet()) {
            if (map.get(key) < 0) {
                return key;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        System.out.println(findTheDifference(s, t));
    }
}
