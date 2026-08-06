class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> freq = new HashMap();

        for (int n : nums) freq.put(
            n,
            freq.getOrDefault(n, 0) + 1
        );

        final PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        queue.addAll(freq.entrySet());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            if (queue.isEmpty()) break;
            res[i] = queue.poll().getKey();
        }

        return res;
    }
}
