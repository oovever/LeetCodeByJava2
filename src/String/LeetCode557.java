package String;

import javax.swing.*;

/**
 * @Author OovEver
 * @Date 2017/12/4 9:39
 */
public class LeetCode557 {
    public  String reverseWords(String s) {
        String[] arrS = s.split(" ");
        String res = "";
        for (int i = 0; i < arrS.length; i++) {
            if (i != arrS.length - 1) {
                res += reverseWord(arrS[i]) + " ";
            } else {
                res += reverseWord(arrS[i]);
            }
        }
        return res;
    }

    private String reverseWord(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] sArr = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while (low <= high) {
            char temp = sArr[low];
            sArr[low] = sArr[high];
            sArr[high] = temp;
            low++;
            high--;
        }
        return String.valueOf(sArr);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        LeetCode557 test = new LeetCode557();
        System.out.println(test.reverseWords(s));
    }


}
