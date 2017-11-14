package Array;

/**
 * Created by OovEver on 2017/11/13.
 * 思路
 * 如果nums的元素小于r*c则直接返回nums
 * 否则将二维数组nums当作一维数组赋值给result数组
 */
public class LeetCode566 {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
//        int m=nums.length;
//        int n = nums[0].length;
//        if (m * n < r * c) {
//            return nums;
//        }
//        int[][] result = new int[r][c];
//        int rowN = 0;
//        int colN = 0;
//        for(int i=0;i<r;i++) {
//            for(int j=0;j<c;j++) {
//                if (rowN < m) {
//                    if (colN < n) {
//                        result[i][j] = nums[rowN][colN++];
//                    }
//                    else{
//                        if (colN >= n) {
//                            rowN++;
//                            colN = 0;
//                            result[i][j] = nums[rowN][colN++];
//                        }
//                    }
//                }
//            }
//        }
//        return result;
        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }
        int[][] result = new int[r][c];
        for(int i=0;i<r*c;i++) {
            result[i / c][i % c] = nums[i / n][i % n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][]nums = {{1, 2}, {3, 4}};
        nums=matrixReshape(nums, 2, 4);
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[0].length;j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
