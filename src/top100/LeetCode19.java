package top100;

/**
 * @author OovEver
 * 2018/1/26 21:09
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0), fast, slow;
        dummy.next = head;
        fast = dummy;
        slow = dummy;
        while (n-->0) fast = fast.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
