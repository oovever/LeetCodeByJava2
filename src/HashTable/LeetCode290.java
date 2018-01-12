package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/11 14:06
 */
public class LeetCode290 {
    public static boolean wordPattern(String pattern, String str) {
        String[] word = str.split(" ");
        if (word.length != pattern.length()) {
            return false;
        }
        Map map = new HashMap<>();
//        必须用integer，用int的话，int装箱成integer，在i=129时，会判断为false
//        Integer a = new Integer(129);
//        Integer b = new Integer(129);
//        System.out.println(a == b);返回false
        for(Integer i=0;i<pattern.length();i++) {
            if (map.put(pattern.charAt(i), i)!=map.put(word[i], i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer a = new Integer(129);
        Integer b = new Integer(129);
        System.out.println(a == b);
    }
}
