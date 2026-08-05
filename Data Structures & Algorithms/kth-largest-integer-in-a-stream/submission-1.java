class KthLargest {

    private final PriorityQueue<Integer> queue; 
    private final List<Integer> numbers;
    private final int window;

    public KthLargest(int k, int[] nums) {
        this.numbers = new ArrayList();
        this.queue = new PriorityQueue();
        this.window = k;
        
        for (int num : nums)
            add(num);
    }
    
    public int add(int val) {
        if (queue.size() >= window) {
            if (queue.peek() <= val) {
                queue.poll();
                queue.offer(val);
            }
        } else {
            queue.offer(val);
        }
        
        numbers.add(val);

        return queue.peek();
    }
}
