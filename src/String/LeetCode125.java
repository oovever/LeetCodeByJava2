package String;

/**
 * @Author OovEver
 * @Date 2017/12/2 16:34
 */
public class LeetCode125 {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        char[] arr =   s.toUpperCase().toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            while(l<r&&!Character.isLetterOrDigit(arr[l])) {
                l++;
            }
            while(l<r&&!Character.isLetterOrDigit(arr[r])){
                r--;
            }
            if (arr[l] == arr[r]) {
                l++;
                r--;
            } else {
                if (arr[l] != arr[r]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "0p";
        System.out.println(isPalindrome(a));
    }
}
