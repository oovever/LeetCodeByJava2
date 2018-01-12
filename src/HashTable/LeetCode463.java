package HashTable;

/**
 * @author OovEver
 * 2018/1/11 13:30
 */
public class LeetCode463 {
    public int islandPerimeter(int[][] grid) {
        int island = 0, neighbors = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if (grid[i][j] == 1) {
                    island++;
                    if (i < grid.length - 1) {
                        if (grid[i + 1][j] == 1) {
                            neighbors++;
                        }
                    }
                    if (j < grid[i].length - 1) {
                        if (grid[i][j + 1] == 1) {
                            neighbors++;
                        }
                    }
                }
            }
        }
        return 4 * island - 2 * neighbors;
    }
}
