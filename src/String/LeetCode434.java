package String;

/**
 * @Author OovEver
 * @Date 2017/12/6 11:33
 */
public class LeetCode434 {
    public static int countSegments(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++) {
//            前一个字符为空，当前字符不为空
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countSegments(("              ")));
    }
}
