package String;

import java.util.Arrays;

/**
 * @Author OovEver
 * @Date 2017/12/8 22:22
 */
public class LeetCode556 {
    public static int nextGreaterElement(int n) {
        char[] intToChar = String.valueOf(n).toCharArray();
        if (intToChar.length == 0) {
            return n;
        }
        int i = intToChar.length - 1;
        while (i > 0) {
            if (intToChar[i] > intToChar[i - 1]) {
                break;
            }
            i--;
        }
        if (i == 0) {
            return -1;
        }
        int maxIndex = i;
        for(int k=maxIndex-1;k>=0;k--) {
        for(int j=intToChar.length-1;j>=maxIndex;j--) {
                if (intToChar[k] < intToChar[j]) {
                    char temp = intToChar[k];
                    intToChar[k] = intToChar[j];
                    intToChar[j] = temp;
                    Arrays.sort(intToChar,k+1,intToChar.length);
                    if (Long.valueOf(String.valueOf(intToChar))>Long.valueOf(String.valueOf(Integer.MAX_VALUE))) {
                        return -1;
                    }
                    return Integer.valueOf(String.valueOf(intToChar));
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(Integer.valueOf("9199999999"));
        System.out.println(nextGreaterElement(21));
    }
}
