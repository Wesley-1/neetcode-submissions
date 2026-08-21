class Node{
    int value;
    Node next;
    Node prev;

    public Node(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class Deque {
    Node head;
    Node tail;
    int size;

    public Deque() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }else return false;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            tail = newNode;              
            size++;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;             
        tail = newNode;                  
        size++;
    }

    public void appendleft(int value) {
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            tail = newNode;              
            size++;
            return;
        }

        Node curr = head;
        head = newNode;
        newNode.next = curr;
        curr.prev = newNode;             
        size++;
    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }

        if(head.next == null){
            int val = head.value;
            head = null;
            tail = null;                 
            size--;
            return val;
        }

        Node curr = head;

        while(curr.next != null){        
            curr = curr.next;
        }

        int val1 = curr.value;
        curr.prev.next = null;
        tail = curr.prev;                
        size--;                          
        return val1;
    }

    public int popleft() {
        if(isEmpty()){
            return -1;
        }

        if(head.next == null){
            int val = head.value;
            head = null;
            tail = null;                 
            size--;
            return val;
        }

        Node curr = head;
        int val1 = curr.value;
        curr = curr.next;
        curr.prev = null;                
        head = curr;
        size--;                          
        return val1;
    }
}