package String;

/**
 * @Author OovEver
 * @Date 2017/12/7 22:15
 */
public class LeetCode443 {
    public static int compress(char[] chars) {
        if (chars.length <= 1) {
            return chars.length;
        }
        int idx = 1;
        int count = 1;
        for(int i=1;i<chars.length;i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if(count!=1)
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[idx++] = c;
                }
                chars[idx++] = chars[i];
                count = 1;
            }
        }
        if(count!=1)
            for (char c : String.valueOf(count).toCharArray()) {
                chars[idx++] = c;
            }
        return idx;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }
}
