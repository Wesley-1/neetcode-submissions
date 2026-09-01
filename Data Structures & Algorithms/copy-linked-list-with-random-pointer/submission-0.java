/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        final Map<Node, Node> refs = new HashMap();

        Node cur = head;

        while (cur != null) {
            refs.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        // Ref --> Node. 
        
        for (Map.Entry<Node, Node> entry : refs.entrySet()) {
            final Node original = entry.getKey();
            final Node dummy = entry.getValue();

            dummy.next = refs.getOrDefault(original.next, null);
            dummy.random = refs.getOrDefault(original.random, null);
        }

        return refs.get(head);
    }
}
