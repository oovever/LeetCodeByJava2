package DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/7 20:54
 */
public class LeetCode464 {
//    标记当前情况是否出现过，出现过就直接返回当前情况
    static Map<String, Boolean> map;
//    标记当前数字是否被使用
    static boolean[] used;

    public static boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = (1 + maxChoosableInteger) * maxChoosableInteger / 2;
        if(sum<desiredTotal) return false;
        if (desiredTotal <= 0) {
            return true;
        }
        map = new HashMap<>();
        used = new boolean[maxChoosableInteger + 1];
        return helper(desiredTotal);
    }

    private static boolean helper(int desiredTotal) {
        if (desiredTotal <= 0) return false;
        String key = Arrays.toString(used);
//        如果当前情况没有出现过
        if (!map.containsKey(key)) {
            for(int i=1;i<used.length;i++) {
                if (!used[i]) {
                    used[i] = true;
//                    如果另一个人的选择无法获胜,则当前的人可以获胜
                    if (!helper(desiredTotal - i)) {
                        map.put(key, true);
                        used[i] = false;
                        return true;
                    }
                    used[i] = false;
                }
            }
            map.put(key, false);
        }
//        当前情况已经出现过
        return map.get(key);
    }

    public static void main(String[] args) {
        System.out.println(canIWin(18, 171));
    }
}
