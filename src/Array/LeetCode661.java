package Array;

public class LeetCode661 {
    public int[][] imageSmoother(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                int sum = 0;
                int  count= 0;
                for (int r : new int[]{-1, 0, 1}) {
                    for (int c : new int[]{-1, 0, 1}) {
                        if (isValid(i + r, j + c, rows, cols)) {
                            count++;
                            sum += M[i + r][j + c];
                        }
                    }
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }

    boolean isValid(int i, int j, int rows, int cols) {
        if (i >= rows || i < 0 || j >= cols || j < 0) {
            return false;
        }
        return true;
    }
}
