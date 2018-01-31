package top150;

/**
 * @author OovEver
 * 2018/1/31 17:26
 */
public class LeetCode116 {
    public void connect(TreeLinkNode root) {
        TreeLinkNode level_start = root;
        while (level_start != null) {
            TreeLinkNode cur = level_start;
            while (cur != null) {
                if(cur.left!=null) cur.left.next = cur.right;
                if(cur.right!=null&&cur.next!=null) cur.right.next = cur.next.left;
                cur = cur.next;
            }
            level_start = level_start.left;
        }
    }
}
