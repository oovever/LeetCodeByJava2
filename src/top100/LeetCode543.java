package top100;

/**
 * @author OovEver
 * 2018/1/24 0:30
 */
public class LeetCode543 {
    public class Solution {
        int max = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            maxDepth(root);
            return max;
        }

        private int maxDepth(TreeNode root) {
            if (root == null) return 0;

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            max = Math.max(max, left + right);

            return Math.max(left, right) + 1;
        }
    }
}
