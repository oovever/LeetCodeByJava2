package String;

import java.util.Stack;

/**
 * @Author OovEver
 * @Date 2017/12/8 18:57
 */
public class LeetCode678 {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
       for(int i=0;i<s.length();i++) {
           if (s.charAt(i) == '(') {
               low++;
               high++;
           } else if (s.charAt(i) == ')') {
               if (low > 0) {
                   low--;
               }
               high--;
           } else {
               if (low > 0) {
                   low--;
               }
               high++;
           }
           if (high < 0) {
               return false;
           }
       }
        return low == 0;
    }
}
