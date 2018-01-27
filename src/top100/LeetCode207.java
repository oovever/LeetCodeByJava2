package top100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author OovEver
 * 2018/1/27 22:48
 */
public class LeetCode207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0 || prerequisites[0].length == 0) {
            return true;
        }
        int[]       indegree = new int[numCourses];
        ArrayList[] graph    = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        //写入有向图的next节点
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            count++;
            ArrayList<Integer> list = graph[cur];
            for (Integer tem : list) {
                indegree[tem]--;
                if (indegree[tem] == 0) {
                    queue.offer(tem);
                }
            }
        }
        return count == numCourses;
    }

    public static void main(String[] args) {

    }
}
