package HashTable;

/**
 * @author OovEver
 * 2018/1/9 10:49
 */
public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] num = new int[26];
        s = s.toLowerCase();
        t = t.toLowerCase();
        for(int i=0;i<s.length();i++) {
            num[s.charAt(i) - 'a']++;
            num[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++) {
            if (num[i] != 0) {
                return false;
            }
        }
        return true;
    }


}
