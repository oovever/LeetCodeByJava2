package top100;

/**
 * @author OovEver
 * 2018/1/24 0:45
 */
public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode walker = head;
        ListNode runner = head;
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (runner == walker) {
                return true;
            }
        }
        return false;
    }
}
