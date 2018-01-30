package top150;

import top100.ListNode;

/**
 * @author OovEver
 * 2018/1/30 20:57
 */
public class LeetCode237 {
    public void deleteNode(ListNode node) {
        if(node != null && node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
