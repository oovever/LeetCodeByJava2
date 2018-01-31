package top150;

import top100.TreeNode;

/**
 * @author OovEver
 * 2018/1/31 11:26
 */
public class LeetCode230 {
    int count = 0;
    int number = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            helper(root.left);
        }
        count--;
        if (count == 0) {
            number = root.val;
            return;
        }
        if (root.right != null) {
            helper(root.right);

        }
    }

}
