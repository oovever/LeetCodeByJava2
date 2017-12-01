package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/12/1 20:17
 */
public class LeetCode57 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        for (Interval i : intervals) {
            if (newInterval == null || i.end < newInterval.start) {
                result.add(i);
            } else if (i.start > newInterval.end) {
                result.add(newInterval);
                result.add(i);
                newInterval = null;
            } else {
                newInterval.start = Math.min(i.start, newInterval.start);
                newInterval.end = Math.max(i.end, newInterval.end);
            }
        }
        if (newInterval != null)
            result.add(newInterval);
        return result;
    }
}
