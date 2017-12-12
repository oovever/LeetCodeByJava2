package String;

import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/12/10 22:17
 */
public class LeetCode539 {
    public int findMinDifference(List<String> timePoints) {
        boolean[] mark = new boolean[24 * 60];
        for(int i=0;i<timePoints.size();i++) {
            String[] t = timePoints.get(i).split(":");
            int h = Integer.parseInt(t[0]);
            int m = Integer.parseInt(t[1]);
            if (mark[h * 60 + m]) {
                return 0;
            }
            mark[h * 60 + m] = true;
        }
//        前一个数
        int prev = 0;
        int min = Integer.MAX_VALUE;
//        第一个数
        int first = Integer.MAX_VALUE;
//        最后一个数
        int last = Integer.MIN_VALUE;
        for(int i=0;i<24*60;i++) {
            if (mark[i]) {
//                如果前面有时间才可进行i-prev的判断
                if (first != Integer.MAX_VALUE) {
                    min = Math.min(min, i - prev);
                }
                first = Math.min(first, i);
                last = Math.max(last, i);
                prev = i;
            }
        }
        min = Math.min(min, 24 * 60 - last + first);
        return min;
    }
}
