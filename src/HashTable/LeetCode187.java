package HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author OovEver
 * 2018/1/9 11:04
 */
public class LeetCode187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new HashSet<>();
        Set<String> set = new HashSet<>();
        for(int i=0;i<=s.length()-10;i++) {
            if(!set.contains(s.substring(i, i + 10)))
            set.add(s.substring(i, i + 10));
            else result.add(s.substring(i, i + 10));
        }
        return new ArrayList<>(result);
    }

}
