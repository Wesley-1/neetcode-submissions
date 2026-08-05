class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // At most nums.length freq. 

        final List[] freq = new List[nums.length];
        final Map<Integer, Integer> numToFreq = new HashMap();

        for (int i : nums) { 

            final Integer cur = numToFreq.get(i);
            final int adder = (cur == null ? 0 : cur) + 1;

            numToFreq.put(i, adder);
        }

        for (Map.Entry<Integer, Integer> entry : numToFreq.entrySet()) {
            final int number = entry.getKey();
            final int freqVal = entry.getValue() - 1;

            final List<Integer> current = freq[freqVal];
            final List<Integer> lst = current == null ? new ArrayList() : current;

            lst.add(number);

            freq[freqVal] = lst;
        }

        final int[] topK = new int[k];
        int added = 0;

        for (int i = nums.length - 1; i >= 0 && added < k; i--) {
            final List<Integer> lst = freq[i];

            if (lst == null) continue;

            for (int n : lst) {
                System.out.println(n);
                if (added >= k) break;
                topK[added++] = n;
            }
        }

        return topK;
    }   
}
