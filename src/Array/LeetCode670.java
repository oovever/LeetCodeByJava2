package Array;

/**
 * @Author OovEver
 * @Date 2017/11/25 17:29
 */
public class LeetCode670 {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int[] buckets = new int[10];
        for(int i=0;i<digits.length;i++) {
            buckets[digits[i] - '0'] = i;
        }
        for(int i=0;i<digits.length;i++) {
            for (int k = 9; k > digits[i] - '0'; k--) {
                if (buckets[k] > i) {
                    char temp = digits[i];
                    digits[i] = digits[buckets[k]];
                    digits[buckets[k]] = temp;
                    return Integer.valueOf(new String(digits));

                }
            }
        }
        return num;
    }
}
