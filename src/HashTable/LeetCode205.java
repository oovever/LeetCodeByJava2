package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/9 23:25
 */
public class LeetCode205 {
    public static boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for(int i=0;i<s.length();i++) {
//            判断字符出现位置
            if(m1[s.charAt(i)]!=m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println('A'-'0');
        String s = "aba";
        String t = "baa";
        System.out.println(isIsomorphic(s, t));
    }
}