package top150;

/**
 * @author OovEver
 * 2018/1/30 23:50
 */
public class LeetCode378 {
    public static int kthSmallest(int[][] matrix, int k) {
        int lo = matrix[0][0];
        int hi = matrix[matrix.length - 1][matrix[0].length - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 0;
            for(int i=0;i<matrix.length;i++) {
                int j = matrix[0].length - 1;
                while (j >= 0&&matrix[i][j]>mid) {
                    j--;
                }
                count += j + 1;
            }
            if(count<k) lo = mid + 1;
            else hi = mid - 1;

        }
        return lo;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int[][] matrix = {{2000000000}};
        System.out.println(kthSmallest(matrix,1));
    }
}
