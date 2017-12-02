package String;

/**
 * @Author OovEver
 * @Date 2017/12/2 17:21
 */
public class LeetCode551 {
    public static boolean checkRecord(String s) {
        if (s.length() <= 1) {
            return true;
        }
        int countA = 0;
        int countL = 0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == 'A') {
                countA++;
                if (countA > 1) {
                    return false;
                }
                countL = 0;
            }
            if (s.charAt(i) == 'L') {
                countL++;
                if (countL > 2) {
                    return false;
                }
            }else
            countL = 0;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "PPALLL";
        System.out.println(checkRecord(s));
    }
}
