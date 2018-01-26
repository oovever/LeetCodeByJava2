package top100;

import java.util.Stack;

/**
 * @author OovEver
 * 2018/1/26 14:16
 */
public class LeetCode114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                root.right = root.left;
                root.left = null;
            } else if (!stack.isEmpty()) {
                root.right = stack.pop();
            }
            root = root.right;
        }
    }

}
