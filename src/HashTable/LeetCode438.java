package HashTable;

import java.util.*;

/**
 * @author OovEver
 * 2018/1/11 14:32
 */
public class LeetCode438 {
    public static List<Integer> findAnagrams(String s, String t) {
            List<Integer> result = new LinkedList<>();
            if(t.length()> s.length()) return result;
            Map<Character, Integer> map = new HashMap<>();
            for(char c : t.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int counter = map.size();

            int begin = 0, end = 0;
            int head = 0;
            int len = Integer.MAX_VALUE;


            while(end < s.length()){
                char c = s.charAt(end);
                if( map.containsKey(c) ){
                    map.put(c, map.get(c)-1);
                    if(map.get(c) == 0) counter--;
                }
                end++;

                while(counter == 0){
                    char tempc = s.charAt(begin);
                    if(map.containsKey(tempc)){
                        map.put(tempc, map.get(tempc) + 1);
                        if(map.get(tempc) > 0){
                            counter++;
                        }
                    }
                    if(end-begin == t.length()){
                        result.add(begin);
                    }
                    begin++;
                }

            }
            return result;
        }


    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
