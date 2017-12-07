package String;

/**
 * @Author OovEver
 * @Date 2017/12/6 16:52
 */
public class LeetCode696 {
    public static int countBinarySubstrings(String s) {
        int preLength = 0, currLength = 1, res = 0;
        for(int i=1;i<s.length();i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currLength++;
            } else {
//              preLength前面连续字符长度，currLength当前字符长度
                preLength = currLength;
                currLength = 1;
            }
            if(preLength>=currLength) res++;

        }
        return res;
    }

    public static void main(String[] args) {
        String s = "00110011";
        System.out.println(countBinarySubstrings(s));

    }

}
