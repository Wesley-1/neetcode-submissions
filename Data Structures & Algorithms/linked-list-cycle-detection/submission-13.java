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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null) {
            final ListNode tmp = fast.next;

            if (tmp == null) 
                return false;

            slow = slow.next;
            fast = tmp.next;
            
            if (slow == fast) return true;
        }

        return false;
    }
}
