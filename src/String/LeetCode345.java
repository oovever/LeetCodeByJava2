package String;

/**
 * @Author OovEver
 * @Date 2017/12/4 11:13
 */
public class LeetCode345 {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int low = 0;
        int high = s.length() - 1;
        char[] sToChar = s.toCharArray();
        while (low < high) {
            while (low < high && vowels.indexOf(s.charAt(low)) == -1) {
                low++;
            }
            while (low < high && vowels.indexOf(s.charAt(high)) == -1) {
                high--;
            }
            char temp = sToChar[low];
            sToChar[low] = sToChar[high];
            sToChar[high] = temp;
            low++;
            high--;
        }
        return String.valueOf(sToChar);
    }
}
