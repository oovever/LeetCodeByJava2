package top150;

import top100.ListNode;

import java.util.List;

/**
 * @author OovEver
 * 2018/1/31 13:03
 */
public class LeetCode328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while (even != null && even.next != null) {
            odd.next = even.next;
            even.next = even.next.next;
            even = even.next;
            odd = odd.next;
        }
        odd.next = evenHead;
        return head;
    }
}
