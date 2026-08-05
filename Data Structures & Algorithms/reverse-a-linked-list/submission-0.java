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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        // 1 - 2 - 3
        // 3 - 2 - 1

        // Current = 2
        // Prev = 1
        // 2 --> 1
        // Current = 3
        // Prev = 2
        // 3 --> 2


        while (current != null) {
            ListNode oldNext = current.next;

            current.next = prev;

            prev = current;
            current = oldNext;
        }

        return prev;
    }
}
