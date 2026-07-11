class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> hashMap = new HashMap<>();
        int topFreq = -1;

        for (int i = 0; i < nums.length; i++)  {
            final int element = nums[i];
            hashMap.compute(element, ($, v) -> {
                return v == null ? 1 : v + 1;
            });

            topFreq = Math.max(topFreq, hashMap.get(element));
        }

        final List<Integer>[] buckets = new List[topFreq + 1];
        for (int i = 0; i <= topFreq; i++) 
            buckets[i] = new ArrayList<Integer>();

        for (final Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            final int num = entry.getKey();
            final int freq = entry.getValue();
            buckets[freq].add(num);
        }

        final int[] result = new int[k];
        int added = 0;
        
        for (int i = buckets.length - 1; i > 0 && added != k; i--) {
            final List<Integer> bucket = buckets[i];
            int bucketRemaining = bucket.size();

            while (added != k && bucketRemaining > 0) {
                result[added] = bucket.get(bucketRemaining - 1);
                added++;
                bucketRemaining--;
            }
        }

        return result;
    }
}
