/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        final Deque<ListNode> nodes = new ArrayDeque<>();

        ListNode cur = head.next;
        while (cur != null) {
            nodes.push(cur);
            cur = cur.next;
        }
        
        cur = head;
        boolean alternator = true;
        while (!nodes.isEmpty()) {
            if (!alternator) {
                cur.next = nodes.pollLast();
            } else {
                cur.next = nodes.pollFirst();
            }
            
            alternator = !alternator;
            cur = cur.next;
        }

        cur.next = null;
    }
}
