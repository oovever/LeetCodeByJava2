package String;

/**
 * @Author OovEver
 * @Date 2017/12/6 14:40
 */
public class LeetCode67 {
    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            stringBuilder.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }

}
