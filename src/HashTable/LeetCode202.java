package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * @author OovEver
 * 2018/1/9 10:34
 */
public class LeetCode202 {
    public static boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<>();
        int squareSum=0, remain=0;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                remain = n % 10;
                squareSum += remain * remain;
                n /= 10;
            }
            if (squareSum == 1) {
                return true;
            }else
            n = squareSum;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));

    }
}
