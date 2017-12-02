package String;

/**
 * @Author OovEver
 * @Date 2017/12/2 17:04
 */
public class LeetCode14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String res = "";
        String preRes = "";
        for(int i=0;i<strs[0].length();i++) {
            res += strs[0].charAt(i);
            for(int j=1;j<strs.length;j++) {
                if (i >= strs[j].length()) {
                    res = preRes;
                    return res;
                }
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    res = preRes;
                    return res;
                }

            }
            preRes = res;
        }
        return res;

    }

    public static void main(String[] args) {
        String[] s = {"aca", "cba"};
        String s1 = "acgdsa";
        String s2 = "acgd";
        System.out.println(s1.indexOf(s2));
        System.out.println(longestCommonPrefix(s));

    }
}
