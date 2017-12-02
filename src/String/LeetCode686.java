package String;

/**
 * @Author OovEver
 * @Date 2017/12/1 21:30
 */
public class LeetCode686 {
    public static int repeatedStringMatch(String A, String B) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() < B.length()) {
            stringBuilder.append(A);
            count++;
        }
        if (stringBuilder.toString().contains(B)) {
            return count;
        }
        if(stringBuilder.append(A).toString().contains(B)) return ++count;
        return -1;
    }

    public static void main(String[] args) {
        String A = "abcd";
        String B = "abcdb";
        System.out.println(repeatedStringMatch(A, B));

    }
}
