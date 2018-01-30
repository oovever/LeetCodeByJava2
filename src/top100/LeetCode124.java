package top100;

/**
 * @author OovEver
 * 2018/1/29 17:22
 */
public class LeetCode124 {
    int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumCal(root);
        return sum;
    }

    public int maxPathSumCal(TreeNode root) {
        if(root == null) return 0;
        int left = Math.max(0, maxPathSumCal(root.left));
        int right = Math.max(0, maxPathSumCal(root.right));
        sum = Math.max(sum, left + right + root.val);
        return Math.max(left, right) + root.val;
    }

}
