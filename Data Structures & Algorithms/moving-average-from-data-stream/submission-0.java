class MovingAverage {

    private final Deque<Integer> window;
    private int total;
    private int capacity;

    public MovingAverage(int size) {
        this.window = new ArrayDeque<>();
        this.capacity = size;
        this.total = 0;
    }

    private int size() { return this.window.size(); }
    private boolean canHold() { return size() + 1 <= this.capacity; }
    
    public double next(int val) {
        if (!canHold()) {
            final int first = window.removeFirst();
            this.total -= first;
        }

        window.offer(val);
        this.total += val;

        return (double) this.total / size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
