class LRUCache {

    class Node {
    
        private int value;
        private final int key;

        public Node next;
        public Node prev;

        public Node(
            int value,
            int key,
            Node next,
            Node prev
        ) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public int getKey() { return this.key; }
        public int getValue() { return this.value; }
        public void setValue(int value) { this.value = value; }
    }

    private Node head;
    private Node tail;

    private final Map<Integer, Node> storage;
    private final int capacity;

    public LRUCache(int capacity) {
        this.storage = new HashMap<>(capacity);
        this.head = new Node(0, 0, null, null);
        this.tail = new Node(0, 0, null, null);
        this.capacity = capacity;

        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public void insert(Node node) {
        final Node oldHead = this.head.next;
        final Node oldPrev = this.head;
        this.head.next = node;
        node.next = oldHead;
        node.prev = oldPrev;
        oldHead.prev = node;        
    }

    public void remove(Node node) {
        final Node prev = node.prev;
        final Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }
    
    public int get(int key) {
        final Node node = storage.get(key);

        if (node != null) {
            remove(node);
            insert(node);
            return node.getValue();
        }

        return -1;
    }
    
    public void put(int key, int value) {
        final Node added = new Node(value, key, head.next, head);

        final Node existing = storage.get(key);

        if (capacity < storage.size() + 1 && existing == null) {
            final Node prevTail = tail.prev;
            storage.remove(prevTail.getKey());
            remove(prevTail);
        }

        if (existing != null) {
            remove(existing);
        }
        
        insert(added);
        storage.put(key, added);
    }
}
