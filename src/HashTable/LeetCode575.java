package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author OovEver
 * 2018/1/9 9:42
 */
public class LeetCode575 {
    public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for(int i=0;i<candies.length;i++) {
            kinds.add(candies[i]);
        }
        return kinds.size() > candies.length / 2 ? candies.length / 2 : kinds.size();
    }
}
