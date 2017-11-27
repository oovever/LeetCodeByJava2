package Array;

import java.util.Arrays;

/**
 * @Author OovEver
 * @Date 2017/11/26 22:16
 */
public class LeetCode621 {
    public static int leastInterval(char[] tasks, int n) {

        int[] c = new int[26];
        for(char t : tasks){
            c[t - 'A']++;
        }
        Arrays.sort(c);
        int i = 25;
        while(i >= 0 && c[i] == c[25]) i--;

        return Math.max(tasks.length, (c[25] - 1) * (n + 1) + 25 - i);
    }

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'A','B', 'B','B', 'B', 'C','C', 'C','C','D'};
        System.out.println(leastInterval(tasks, 2));

    }
}
