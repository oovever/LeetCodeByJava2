package String;

/**
 * @Author OovEver
 * @Date 2017/12/1 21:51
 */
public class LeetCode520 {
    public static boolean detectCapitalUse(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
            for(int i=1;i<word.length();i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    return false;
                }
            }
        } else if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            boolean hasUpper = false;
            boolean hasLower = false;
            for(int i=1;i<word.length();i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    hasUpper = true;
                }
                if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                    hasLower = true;
                }
                if (hasLower && hasUpper) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "FlaG";
        System.out.println(detectCapitalUse(word));

    }
}
