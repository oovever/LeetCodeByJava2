package String;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author OovEver
 * @Date 2017/12/6 22:52
 */
public class LeetCode387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<s.length();i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
