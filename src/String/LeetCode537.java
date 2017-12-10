package String;

/**
 * @Author OovEver
 * @Date 2017/12/8 21:20
 */
public class LeetCode537 {
    public static String complexNumberMultiply(String a, String b) {
        String[] A = a.split("\\+");
        String[] B = b.split("\\+");
        int a1 = Integer.parseInt(A[0]);
        int b1 = Integer.parseInt(A[1].replace("i", ""));
        int a2 = Integer.parseInt(B[0]);
        int b2 = Integer.parseInt(B[1].replace("i", ""));
        int a1a2 = a1 * a2;
        int b1b2 = b1 * b2;
        int a1a2b1b2 = a1 * b2 + a2 * b1;
        String aFinal = (a1a2 - b1b2) + "";
        String bFinal = a1a2b1b2 + "i";
        return aFinal + "+" + bFinal;
    }

    public static void main(String[] args) {
        System.out.println(complexNumberMultiply("1+0i", "1+0i"));
    }
}
