package String;

import java.util.*;

/**
 * @Author OovEver
 * @Date 2017/12/8 18:22
 */
public class LeetCode522 {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        Set<String> duplicates = getDuplicates(strs);
        for(int i=0;i<strs.length;i++) {
            if (!duplicates.contains(strs[i])) {
                if (i == 0) {
                    return strs[0].length();
                }
                for(int j=0;j<i;j++) {
                    if (isSubsequence(strs[j], strs[i])) {
                        break;
                    }
                    if(j == i-1) return strs[i].length();
                }
            }
        }
        return -1;
    }
    private boolean isSubsequence(String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == b.length();
    }
    private Set<String> getDuplicates(String[] strs) {
        Set<String> set = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String s : strs) {
            if(set.contains(s)) duplicates.add(s);
            set.add(s);
        }
        return duplicates;
    }

    public static void main(String[] args) {

    }
}
