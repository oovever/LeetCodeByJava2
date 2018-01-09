package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/8 23:39
 */
public class LeetCode447{
    public int numberOfBoomerangs(int[][] points) {
        if (points == null || points.length == 0 || points[0].length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i=0;i<points.length;i++) {
            for(int j=0;j<points.length;j++) {
                if (i == j) {
                    continue;
                }
                int distance = getDistance(points[i], points[j]);
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }
            for (int value : map.values()) {
                result += value * (value - 1);
            }
            map.clear();
        }
        return result;
    }

    private int getDistance(int[] a, int[] b) {
      return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }
}
