package String;

import java.util.*;

/**
 * @Author OovEver
 * @Date 2017/12/8 21:53
 */
public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] srtToChar = str.toCharArray();
            Arrays.sort(srtToChar);
            String keyStr = String.valueOf(srtToChar);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new LinkedList<String>());
            }
            map.get(keyStr).add(str);

        }
        return new ArrayList<>(map.values());
    }

}
