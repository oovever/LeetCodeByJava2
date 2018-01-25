package top100;

/**
 * @author OovEver
 * 2018/1/23 23:37
 */
public class LeetCode538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    private void convert(TreeNode root) {
        if (root == null) {
            return;
        }
        convert(root.right);
        root.val += sum;
        sum = root.val;
        convert(root.left);
    }
}
