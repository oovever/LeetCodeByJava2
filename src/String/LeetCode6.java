package String;

import org.omg.CORBA.INTERNAL;

/**
 * @Author OovEver
 * @Date 2017/12/10 21:16
 */
public class LeetCode6 {
    public static String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        StringBuilder []stringBuilder = new StringBuilder[numRows];
        for(int i=0;i<stringBuilder.length;i++) {
            stringBuilder[i] = new StringBuilder();
        }
        int len = c.length;
        int i = 0;
        while (i < len) {
            for(int idx=0;idx<numRows&&i<len;idx++) {
//                处理每列
                stringBuilder[idx].append(c[i++]);
            }
            for(int idx=numRows-2;idx>=1&&i<len;idx--) {
//                处理对角线
                stringBuilder[idx].append(c[i++]);
            }
        }
        for(int j=1;j<numRows;j++) {
            stringBuilder[0].append(stringBuilder[j]);
        }
        return stringBuilder[0].toString();
    }

    public static void main(String[] args) {
    }
}
