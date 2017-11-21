package Array;

public class LeetCode717 {
    public static boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        while (i < n - 1) {
            if (bits[i] == 0) {
                i++;
            } else {
                i += 2;
            }
        }
        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] bits = {1, 1, 1, 1, 0};
        System.out.println(isOneBitCharacter(bits));

    }
}
