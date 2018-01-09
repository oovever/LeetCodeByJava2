package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/9 22:39
 */
public class LeetCode760 {
    public static int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<B.length;i++) {
            map.put(B[i], i);
        }
        int[] res = new int[A.length];
        for(int i=0;i<A.length;i++) {
            res[i] = map.get(A[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        System.out.println(anagramMappings(A, B));
    }
}
