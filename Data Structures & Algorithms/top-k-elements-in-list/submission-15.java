class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        final PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.getValue(), b.getValue())
        );

        final int[] res = new int[k];

        final Map<Integer, Integer> freq = new HashMap();

        for (int n : nums) freq.put(
            n,
            freq.getOrDefault(n, 0) + 1
        );

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            heap.offer(entry);
            
            if (heap.size() > k)
                heap.poll();
        }

        for (int i = 0; i < k && !heap.isEmpty(); i++)
            res[i] = heap.poll().getKey();
        
        return res;
    }
}
