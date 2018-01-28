package top100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author OovEver
 * 2018/1/28 21:45
 */
public class LeetCode297 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        String left = serialize(root.left);
        String right = serialize(root.right);
        sb.append(",");
        sb.append(left);
        sb.append(",");
        sb.append(right);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>();
        String[] strs = data.split(",");
        for (String str : strs) {
            q.add(str);
        }
        return helper(q);
    }

    // 从queue中依次取值建node, 顺序为preorder
    public TreeNode helper(Queue<String> q) {
        String s = q.remove();
        if (s.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = helper(q);
        root.right = helper(q);
        return root;
    }

    public static void main(String[] args) {

    }
}
