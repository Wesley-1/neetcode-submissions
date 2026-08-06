class Solution {
    public int subarraySum(int[] nums, int k) {
        final Map<Integer, Integer> count = new HashMap();
        count.put(0, 1);

        int tot = 0;
        int sum = 0;
        for (int n : nums) {
            sum += n;

            final int diff = sum - k;
            tot += count.getOrDefault(diff, 0);
            count.put(sum, count.getOrDefault(sum, 0) + 1);
        }

        return tot;
    }
}