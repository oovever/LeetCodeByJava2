package Array;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by OovEver on 2017/11/13.
 * DFS操作，遍历grid数组，当某元素为1时，上下左右遍历该数组，并将访问后的数组置为0，以防止重复访问
 */
public class LeetCode695 {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m=grid.length;
        int n = grid[0].length;
        int max = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, m, n, 0);
                    max = Math.max(area, max);
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j, int m, int n,int area) {
        if (i < 0 || j < 0 || i >= m || j >= n||grid[i][j]==0) {
            return area;
        }
        grid[i][j] = 0;
        area++;
        area = dfs(grid, i + 1, j, m, n, area);
        area = dfs(grid, i - 1, j, m, n, area);
        area = dfs(grid, i, j + 1, m, n, area);
        area = dfs(grid, i, j - 1, m, n, area);
        return area;
    }
}
