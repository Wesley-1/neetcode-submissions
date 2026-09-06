public class Node {
    public final int key;
    public final int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class MyHashMap {

    private final Node Tombstone = new Node(-1, -1);

    private Node[] arr;
    private int size;
    private int capacity;

    public MyHashMap() {
        this.arr = new Node[100];
        this.capacity = 100;
        this.size = 0;
    }

    public void put(int key, int value) {
        final int existing = find(key);

        if (existing != -1) {
            this.arr[existing] = new Node(key, value);
            return;
        }

        rehash();

        final int pos = probe(key, this.arr);
        this.arr[pos] = new Node(key, value);
        this.size++;
    }

    private int hash(int key, int capacity) {
        return key % capacity;
    }

    private int probe(int key, Node[] arr) {
        final int start = hash(key, arr.length);

        for (int i = 0; i < arr.length; i++) {
            final int pos = hash(start + i, arr.length);
            
            if (arr[pos] == Tombstone || arr[pos] == null) 
                return pos;
        }

        throw new RuntimeException("Map is full!");
    }

    private int find(int key) {
        final int start = hash(key, this.capacity);
        for (int i = 0; i < capacity; i++) {
            final int pos = hash(start + i, this.capacity);

            if (arr[pos] == Tombstone || arr[pos] == null) 
                continue;

            if (arr[pos].key == key) 
                return pos;
        }

        return -1;
    }

    public int get(int key) {
        final int pos = find(key);

        if (pos == -1) return -1;
        
        return arr[pos].value;
    }

    public void remove(int key) {
        final int pos = find(key);

        if (pos == -1) return;

        this.arr[pos] = Tombstone;
        this.size--;
    }

    public void rehash() {
        if (size <= capacity * 0.70) return;
        
        final Node[] copy = new Node[capacity * 2];

        for (int i = 0; i < capacity; i++) {
            final Node node = this.arr[i];

            if (node == null || node == Tombstone) continue;

            copy[probe(node.key, copy)] = node;
        }

        this.capacity *= 2;
        this.arr = copy; 
    }

    
}

