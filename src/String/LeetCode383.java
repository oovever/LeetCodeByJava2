package String;

/**
 * @Author OovEver
 * @Date 2017/12/6 23:02
 */
public class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] record = new char[26];
        for(int i=0;i<magazine.length();i++) {
            record[magazine.charAt(i) - 'a']++;
        }
        for(int i=0;i<ransomNote.length();i++) {
            if (record[ransomNote.charAt(i) - 'a'] < 1) {
                return false;
            }
            record[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
