package String;

/**
 * @Author OovEver
 * @Date 2017/12/4 17:06
 */
public class LeetCode459 {
    public  boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i=len/2;i>0;i--) {
//            只有len%i==0才代表当前的i个元素可以重复的组成s字符
            if (len % i == 0) {
                String subS = s.substring(0, i);
//                假设可以组成s字符，需要m个长度为i的子字符串
                int m = len / i;
                int j;
                for(j=1;j<m;j++) {
//                    0到i的字符与i * j到 i * j + i不相等
                    if (!subS.equals(s.substring(i * j, i * j + i))) {
                        break;
                    }
                }
                if (j == m) {
                    return true;
                }
            }
        }
        return false;
    }


}
