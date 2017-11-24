package Array;

public class LeetCode59 {
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1;
        int i = 0, j = 0;
        int rows = 0;
        int rowe = n;
        int cols = 0;
        int cole = n;
        while (num != n * n+1) {
            while (j < cole) {
                res[i][j++] = num;
                num++;
            }
            rows++;
            i = rows;
            while (j==cole&&i<rowe) {
                res[i++][j - 1] = num++;
            }
            cole--;
            j = cole;
            while (i==rowe&&j > cols) {
                res[i - 1][--j] = num++;
            }
            rowe--;
            i = rowe;
            while (j == cols && i > rows) {
                res[--i][j] = num++;
            }
            cols++;
            j = cols;

        }
        return res;
    }

    public static void main(String[] args) {
        int[][] res = generateMatrix(4);
        for(int i=0;i<res.length;i++) {
            for(int j=0;j<res[0].length;j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
