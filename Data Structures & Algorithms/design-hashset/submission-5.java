class MyHashSet {
    private LinkedList<Integer>[] bucket;
    private int size = 1000;
    
    public MyHashSet() {
        bucket = new LinkedList[size];
        for(int i=0;i<size;i++){
            bucket[i]= new LinkedList<Integer>();
        }
    }
    private int hashfunc(int key){
        return key%size;
    }
    
    public void add(int key) {
        int hash = hashfunc(key);
        if(!bucket[hash].contains(key)){
        bucket[hash].add(key);
        }
    }
    
    
    public void remove(int key) {
        int hash = hashfunc(key);
        if(bucket[hash].contains(key)){
            bucket[hash].remove(Integer.valueOf(key));
        }
    }
    
    
    public boolean contains(int key) {
        int hash = hashfunc(key);
        return bucket[hash].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */