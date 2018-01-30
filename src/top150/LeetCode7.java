package top150;

/**
 * @author OovEver
 * 2018/1/30 22:12
 */
public class LeetCode7 {
    public int reverse(int x) {
        long result =0;
        while(x != 0)
        {
            result = (result*10) + (x%10);
            if(result > Integer.MAX_VALUE) return 0;
            if(result < Integer.MIN_VALUE) return 0;
            x = x/10;
        }
        return (int)result;
    }

    public static void main(String[] args) {
//        int x = 1534236469;
////        System.out.println(reverse(x));
        System.out.println(String.valueOf(Integer.MIN_VALUE));
    }

}
