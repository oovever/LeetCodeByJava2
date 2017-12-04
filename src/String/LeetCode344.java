package String;

/**
 * @Author OovEver
 * @Date 2017/12/4 9:33
 */
public class LeetCode344 {
    public String reverseString(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int low = 0;
        int high = s.length() - 1;
        char[] arr = s.toCharArray();
        while (low <= high) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return String.valueOf(arr);
    }
}
