package DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author OovEver
 * 2018/1/7 20:54
 */
public class LeetCode464 {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal<=0) return true;
        if (maxChoosableInteger*(maxChoosableInteger+1)/2<desiredTotal) return false;
        return canIWin(desiredTotal, new int[maxChoosableInteger], new HashMap<>());
    }
    private boolean canIWin(int total, int[] state, HashMap<String, Boolean> hashMap) {
        String curr=Arrays.toString(state);
        if (hashMap.containsKey(curr)) return hashMap.get(curr);
        for (int i=0;i<state.length;i++) {
            if (state[i]==0) {
                state[i]=1;
//                另一个人不能赢
                if (total<=i+1 || !canIWin(total-(i+1), state, hashMap)) {
                    hashMap.put(curr, true);
                    state[i]=0;
                    return true;
                }
                state[i]=0;
            }
        }
        hashMap.put(curr, false);
        return false;
    }

}
