class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final int topFreq = nums.length;
        final List<Integer>[] freq = new List[topFreq];
        
        final Map<Integer, Integer> frequencyMap = new HashMap();

        for (int i : nums)
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            List<Integer> existing = freq[entry.getValue() -1];

            if (existing == null) existing = new ArrayList<Integer>();
            existing.add(entry.getKey());

            freq[entry.getValue() - 1] = existing;
        }
        
        final int[] result = new int[k];

        int count = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            final List<Integer> lst = freq[i];
            if (lst == null) continue;
            for (int val : lst) {
                if (count >= k) return result;
                result[count++] = val;
            }
        }

        
        return result;
    }
}
