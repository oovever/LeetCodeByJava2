package Array;

import java.util.HashMap;
import java.util.Map;

public class LeetCode729 {
    class MyCalendar {
        Map<Integer, Integer> map;
        public MyCalendar() {
            map = new HashMap<>();
        }

        public boolean book(int start, int end) {
            for (int key : map.keySet()) {
                if (start <= key && end >key) {
                    return false;
                } else if (start >= key && start < map.get(key)) {
                    return false;
                }
            }
            map.put(start, end);
            return true;
        }
    }
}
