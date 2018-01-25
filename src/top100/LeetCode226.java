package top100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author OovEver
 * 2018/1/23 22:41
 */
public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        TreeNode left = root.left;
//        TreeNode right = root.right;
//        root.left = invertTree(right);
//        root.right = invertTree(left);
//        return root;
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return root;
    }
}
