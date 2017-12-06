package String;

/**
 * @Author OovEver
 * @Date 2017/12/6 14:40
 */
public class LeetCode67 {
    public String addBinary(String a, String b) {
        if (a.length() == 0) {
            return b;
        } else if (b.length() == 0) {
            return a;
        }
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0, j = 0;
        char in = '0';
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == '1' && b.charAt(j) == '1') {
                if (in == '0') {
                    stringBuilder.append('0');
                } else if (in == '1') {
                    stringBuilder.append('1');
                }
                in = '1';
                i++;
                j++;
            } else if (a.charAt(i) == '0' && b.charAt(j) == '1' || a.charAt(i) == '1' && b.charAt(j) == '0') {
                if (in == '0') {
                    stringBuilder.append('1');
                    in = '0';
                } else if (in == '1') {
                    stringBuilder.append('0');
                    in = '1';
                }
                i++;
                j++;
            } else if (a.charAt(i) == 0 && b.charAt(j) == 0) {
                stringBuilder.append(in);
                in = '0';
                i++;
                j++;
            }
        }
        while (i < a.length()) {
            if (in == '1' && a.charAt(i) == '1') {
                stringBuilder.append('0');
                in = '1';
                i++;
            } else if (in == '1' && a.charAt(i) == '0') {
                stringBuilder.append('1');
                in = '0';
                i++;
            }
        }
        return stringBuilder.toString();
    }
}
