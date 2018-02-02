package top150;

import java.util.*;

/**
 * @author OovEver
 * 2018/2/2 13:03
 */
public class LeetCode140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<String>();

        // 用来记录s.substring(i)这个字符串能否分解
        boolean[] possible = new boolean[s.length() + 1];
        Arrays.fill(possible, true);
        dfs(res, "", s, wordDict,  0, possible);
        return res;
    }

    public static void dfs(List<String> res, String cur, String s, List<String> wordDict, int start, boolean[] possible) {
        if (start == s.length()) {
            res.add(cur);
            return;
        }
        for (int i = start + 1; i <= s.length(); i++) {
            String str = s.substring(start, i);
            if (wordDict.contains(str) && possible[i]) {
                int prevSize = res.size();
                dfs(res, cur + (cur.equals("") ? "" : " ") + str, s, wordDict, i, possible);

                // DFS后面部分结果没有变化，说明后面是没有解的
                if (res.size() == prevSize)
                    possible[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        String s = "catsanddog";
        String []dict = {"cat", "cats", "and", "sand", "dog"};
        List<String> dictList = Arrays.asList(dict);
        LeetCode140 test = new LeetCode140();
        System.out.println(test.wordBreak(s,dictList));
    }
}
