package Array;

import java.util.jar.JarEntry;

public class LeetCode289 {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        int m = board.length;
        int n = board[0].length;
        int[][] tempBoard = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                tempBoard[i][j] = board[i][j];
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                int live = 0;
                for (int r : new int[]{-1, 0, 1}) {
                    for (int c : new int[]{-1, 0, 1}) {
                        if (r == 0 && c == 0) {
                            continue;
                        }
                            if (isVaild(i + r, j + c, m, n)) {
                                live += tempBoard[i + r][j + c];
                            }

                    }
                }
                if (live < 2 && tempBoard[i][j] == 1) {
                    board[i][j] = 0;
                } else if (live == 2 || live == 3 && tempBoard[i][j] == 1) {
                    continue;
                } else if (live > 3 && tempBoard[i][j] == 1) {
                    board[i][j] = 0;
                } else if (live == 3 && tempBoard[i][j] == 0) {
                    board[i][j] = 1;
                }
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.println(board[i][j]+" ");
            }
        }

    }

    private boolean isVaild(int i, int j, int m, int n) {
        if (i >= m || i < 0 || j >= n || j < 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] nums = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        LeetCode289 test = new LeetCode289();
        test.gameOfLife(nums);

    }
}
