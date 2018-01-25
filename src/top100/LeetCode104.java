package top100;

/**
 * @author OovEver
 * 2018/1/23 22:39
 */
public class LeetCode104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
