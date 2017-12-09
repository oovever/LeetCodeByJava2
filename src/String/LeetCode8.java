package String;

/**
 * @Author OovEver
 * @Date 2017/12/9 14:21
 */
public class LeetCode8 {
    public static int myAtoi(String str) {
        int sign = 1, total = 0, index = 0;
//        1.处理空字符串
        if (str.length() == 0) {
            return 0;
        }
//        去掉空格
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }
//      判断符号
        if (index<str.length()&&(str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
//        进行转化
        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
//            判断是否超限
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }

}
