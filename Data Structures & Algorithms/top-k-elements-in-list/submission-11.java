class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       final Map<Integer, Integer> freq = new HashMap();

       for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);
       
       final PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue(Comparator.comparingInt(Map.Entry<Integer, Integer>::getValue));

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            final int freqVal = entry.getValue();

            queue.offer(entry);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        
        final int[] res = new int[k];

        for (int i = 0; i < k && queue.size() > 0; i++) {
            res[i] = queue.poll().getKey();
        }

        return res;
    }   
}
