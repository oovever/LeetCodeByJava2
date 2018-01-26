package top100;

/**
 * @author OovEver
 * 2018/1/26 22:37
 */
public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        if(head==null) return null;
        ListNode runner = head, walker = head;
        while(runner.next!=null && runner.next.next!=null){
            runner = runner.next.next;
            walker = walker.next;
            if (walker == runner) {
                ListNode temp = head;
                while(temp!=walker){
                    temp = temp.next;
                    walker = walker.next;
                }
                return temp;
            }
        }
        return null;
    }
}
