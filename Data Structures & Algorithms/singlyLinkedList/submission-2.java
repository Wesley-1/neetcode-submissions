class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
        this.next = next;
    }
}
class LinkedList {
    private Node head;
    private int size;
    
    public LinkedList() {
        head = null;
        size = 0;
    }


    public int get(int index) {
        
        if(index < 0 || index >= size){
            return -1;
        }
        Node curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr.value;       
    }

    public void insertHead(int val) {
        Node curr = new Node(val);
        curr.next = head;
        head = curr;
        size++;
    }

    public void insertTail(int val) {
        Node node = new Node(val);
        Node curr = head;
       if(head == null){
        head = node;
        size++;
        return;
       }
       while(curr.next != null){
            curr = curr.next;
        }
        curr.next = node;
        node.next = null;
        size++;
    }

    public boolean remove(int index) {
        if(index < 0 || index >= size){
            return false;
        }
        Node curr = head;
        Node nxt = null;
        if(index == 0){
            head = head.next;
            size--;
            return true;
        }
        for(int i = 0; i < index - 1; i++){
            curr = curr.next;
        }
        nxt = curr.next.next;
        curr.next = nxt;
        size--;
        return true;

    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head;
        while(curr != null){
            arr.add(curr.value);
            curr = curr.next;
        }
    return arr;
}
}
