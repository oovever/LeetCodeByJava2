package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/14 17:35
 */
public class LeetCode554 {
    public static int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int res = wall.size();
        for (int key : map.keySet()) {
            res = Math.min(wall.size() - map.get(key), res);
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        res.add(new ArrayList<Integer>(temp));
        temp = new ArrayList<>();
        temp.add(2);
        temp.add(1);
        res.add(new ArrayList<>(temp));
        System.out.println(leastBricks(res));

    }
}
