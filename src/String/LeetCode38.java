package String;

/**
 * @Author OovEver
 * @Date 2017/12/4 10:28
 */
public  class LeetCode38 {
    public static String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");
        StringBuilder prev;
//        记录次数
        int count;
        char say;
        for(int i=1;i<n;i++) {
            prev = curr;
            count = 1;
            curr = new StringBuilder();
            say = prev.charAt(0);
            for(int j=1;j<prev.length();j++) {
                if (prev.charAt(j) != say) {
                    curr.append(count).append(say);
                    count = 1;
                    say = prev.charAt(j);
                } else {
                    count++;
                }
            }
            curr.append(count).append(say);
        }
        return curr.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(6));

    }
}
