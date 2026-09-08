class LRUCache {

    public static class Node {
        public int key;
        public int value;
        public Node next;
        public Node prev;

        public Node(
            int key,
            int value,
            Node next,
            Node prev
        ) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    private final Map<Integer, Node> nodes;
    private final int capacity;
    private Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.nodes = new HashMap<>();
        this.capacity = capacity;

        this.tail = new Node(-1, -1, null, null);
        this.head = new Node(-1, -1, this.tail, null);

        this.tail.prev = this.head;
    }

    public void insert(Node node) {
        final Node tmp = this.tail.prev;
        node.next = this.tail;
        node.prev = tmp;
        node.value = node.value;
        this.tail.prev = node;
        tmp.next = node;
        nodes.put(node.key, node);
    }

    public void remove(Node node) {
        final Node prev = node.prev;
        final Node next = node.next;
        prev.next = next;
        next.prev = prev;
        nodes.remove(node.key);
    }
    
    public int get(int key) {
        final Node cur = nodes.get(key);
        if (cur == null) 
            return -1;

        remove(cur);
        insert(cur);

        return cur.value;
    }
    
    public void put(int key, int value) {

        if (nodes.containsKey(key))
            remove(nodes.get(key));

        if (this.nodes.size() + 1 > capacity) {
            remove(this.head.next);
        }

        final Node node = new Node(key, value, null, null);
        insert(node);
    }
}
