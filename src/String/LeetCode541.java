package String;

import java.util.jar.JarEntry;

/**
 * @Author OovEver
 * @Date 2017/12/1 21:44
 */
public class LeetCode541 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        int n = s.length();
        while (i < s.length()) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }
    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    public static void main(String[] args) {
        LeetCode541 test = new LeetCode541();
        String s = "abcdefg";
        System.out.println(test.reverseStr(s, 2));
    }
}
