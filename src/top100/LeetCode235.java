package top100;

/**
 * @author OovEver
 * 2018/1/26 23:28
 */
public class LeetCode235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
