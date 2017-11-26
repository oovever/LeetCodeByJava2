package Array;

/**
 * @Author OovEver
 * @Date 2017/11/26 21:27
 */
public class LeetCode48 {
    public static void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++) {
            for(int j=i;j<n;j++) {
                if (i != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i=0;i<m;i++) {
            for(int j=0;j<n/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(nums);
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[0].length;j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }
}
