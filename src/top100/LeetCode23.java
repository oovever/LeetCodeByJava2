package top100;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author OovEver
 * 2018/1/29 17:11
 */
public class LeetCode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for(int i=0;i<lists.length;i++) {
            if (lists[i] != null) {
                minHeap.offer(lists[i]);
            }
        }
        while (!minHeap.isEmpty()) {
            ListNode min = minHeap.poll();
            head.next = min;
            head = head.next;
            if (min.next != null) {
                minHeap.offer(min.next);
                min = min.next;
            }
        }
        return dummy.next;
    }
}
