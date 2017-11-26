package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author OovEver
 * @Date 2017/11/26 23:09
 */
public class LeetCode54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        int rstart = 0;
        int rend = matrix.length - 1;
        int cstart = 0;
        int cend = matrix[0].length - 1;
        int i = 0;
        int count = 0;
        while (count < matrix.length * matrix[0].length) {
            i = cstart;
            while (count < matrix.length * matrix[0].length&&i <= cend) {
                res.add(matrix[rstart][i++]);
                count++;
            }
            rstart++;
            i = rstart;
            while (count < matrix.length * matrix[0].length&&i <= rend) {
                res.add(matrix[i++][cend]);
                count++;
            }
            cend--;
            i = cend;
            while (count < matrix.length * matrix[0].length&&i >= cstart) {
                res.add(matrix[rend][i--]);
                count++;
            }
            rend--;
            i = rend;
            while (count < matrix.length * matrix[0].length&&i >= rstart) {
                res.add(matrix[i--][cstart]);
                count++;
            }
            cstart++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}};
        System.out.println(spiralOrder(nums));
    }
}
