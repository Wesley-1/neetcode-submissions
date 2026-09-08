class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Do with bucket sort.
        final Map<Integer, Integer> freq = new HashMap();
        final int[] res = new int[k];

        int maximum = 0;
        for (int n : nums) {
            freq.put(
                n, 
                freq.getOrDefault(n, 0) + 1
            );

            maximum = Math.max(maximum, freq.get(n));
        }

        final List[] freqs = new List[maximum + 1];
        for (int i = 0; i <= maximum; i++) freqs[i] = new ArrayList();

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            final int frequency = entry.getValue();
            final List<Integer> lst = freqs[frequency];
            lst.add(entry.getKey());
        }

        int added = 0;
        for (int i = maximum; i >= 0; i--) {
            final List<Integer> lst = freqs[i];
            for (int n : lst) {
                if (added >= k) break;
                res[added++] = n;
            }
        }

        return res;
    }
}
