package String;

import java.util.Random;

/**
 * @Author OovEver
 * @Date 2017/12/4 10:00
 */
public class LeetCode657 {
    public boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0) {
            return true;
        }
        int left = 0;
        int up = 0;
        for(int i=0;i<moves.length();i++) {
            if (moves.charAt(i) == 'U') {
                up++;
            } else if (moves.charAt(i) == 'D') {
                up--;
            } else if (moves.charAt(i) == 'L') {
                left++;
            } else if (moves.charAt(i) == 'R') {
                left--;
            }
        }
        return left == 0 && up == 0 ? true : false;
    }
}
