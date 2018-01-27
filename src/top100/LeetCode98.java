package top100;

/**
 * @author OovEver
 * 2018/1/27 20:31
 */
public class LeetCode98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    private boolean isValidBST(TreeNode root, Integer max, Integer min){
        if (root == null) {
            return true;
        }
        if (max != null && root.val >= max) {
            return false;
        }
        if (min != null && root.val <= min) {
            return false;
        }
        return isValidBST(root.left, root.val, min) && isValidBST(root.right, max, root.val);
    }
}
