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

        final Set<ListNode> hasSeen = new HashSet();
        
        ListNode current = head;
        while (current.next != null) {
            
            if (hasSeen.contains(current.next)) 
                return true;
            
            hasSeen.add(current.next);

            current = current.next;
        }

        return false;
    }
}
