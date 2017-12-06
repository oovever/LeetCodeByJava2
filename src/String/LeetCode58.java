package String;

/**
 * @Author OovEver
 * @Date 2017/12/5 23:41
 */
public class LeetCode58 {
    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int count = 0;
        boolean hasWord = false;
        for(int i=s.length()-1;i>=0;i--) {
            if (s.charAt(i) != ' ') {
                count++;
                hasWord = true;
            } else if(hasWord){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Hello World".trim().length());
        System.out.println("Hello World".trim().lastIndexOf(" "));
        System.out.println(lengthOfLastWord("a "));

    }
}
