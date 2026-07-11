class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue(
            Comparator.comparingInt(Map.Entry<Integer, Integer>::getValue).reversed()
        );

        final Map<Integer, Integer> cache = new HashMap();

        for (int i : nums)
            cache.put(i, cache.getOrDefault(i, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : cache.entrySet()) {
            queue.offer(entry);
        }

        final int[] finalTopK = new int[k];
        
        for (int i = 0; i < k; i++) {
            if (queue.isEmpty())
                break;
            
            finalTopK[i] = Integer.valueOf(queue.poll().getKey());
        }

        return finalTopK;
    }
}
