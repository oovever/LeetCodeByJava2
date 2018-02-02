package top150;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author OovEver
 * 2018/2/1 22:07
 */
public class LeetCode127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++) {
                String temp = queue.poll();
                if(temp.equals(endWord)) return steps + 1;
                for(Iterator<String> iterator = wordList.iterator() ; iterator.hasNext();){
                    String current = iterator.next();
                    if(canTransform(current, temp)){
                        iterator.remove();
                        queue.offer(current);
                    }
                }
            }
            steps++;
        }
        return 0;
    }
    public boolean canTransform(String word1, String word2){
        for(int i=0,count=0;i<word1.length();i++) {
            if(word1.charAt(i)!=word2.charAt(i) && ++count>1) return false;
        }
        return true;
    }
}
