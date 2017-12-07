package String;

/**
 * @Author OovEver
 * @Date 2017/12/6 16:51
 */
public class LeetCode521 {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
