package String;

/**
 * @Author OovEver
 * @Date 2017/12/5 23:50
 */
public class LeetCode680 {
    public static boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int low = 0;
        int high = s.length() - 1;
        int count = 0;
        while (low <= high) {
            if (s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else {
                if ( low+1 <= high && s.charAt(low + 1) == s.charAt(high)&&s.charAt(high-1)==s.charAt(low)) {
                    if (low + 2 <= high && s.charAt(low + 2) == s.charAt(high - 1)) {
                        low++;
                        count++;
                    } else {
                        high--;
                        count++;
                    }

                } else if (low + 1 <= high && s.charAt(low + 1) == s.charAt(high) && s.charAt(high - 1) != s.charAt(low)) {
                    low++;
                    count++;
                } else {
                    high--;
                    count++;
                }
            }
            if (count > 1) {
                return false;
            }
        }

        if (count > 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        String s1 = "aguokepatgbnvfqmgmlcup";
        System.out.println(s.charAt(19));
        System.out.println(s.charAt(81));
        System.out.println(s.substring(0, 21));
        System.out.println(s.substring(80, 101));
        System.out.println(validPalindrome(s));
    }


}
