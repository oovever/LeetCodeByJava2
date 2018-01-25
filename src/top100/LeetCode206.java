package top100;

/**
 * @author OovEver
 * 2018/1/23 23:50
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
