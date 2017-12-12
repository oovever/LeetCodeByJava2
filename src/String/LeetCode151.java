package String;

/**
 * @Author OovEver
 * @Date 2017/12/9 17:06
 */
public class LeetCode151 {
    public static String reverseWords(String s) {
        String[] tmp = s.split("\\s");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<tmp.length;i++) {
            if (tmp[tmp.length - i - 1] .equals("")) {
                continue;
            }
            stringBuilder.append(tmp[tmp.length - i - 1]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords( "a  b"));
    }
}
