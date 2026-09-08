class Solution {
    public int longestConsecutive(int[] nums) {  
        final Set<Integer> numSet = new HashSet();

        for (int n : nums) numSet.add(n);

        int res = 0;
        for (int n : nums) {
            if (numSet.contains(n - 1)) continue;

            int count = 1;
            while (numSet.contains(n + count)) {
                count++;
            }

            res = Math.max(count, res);
        }

        return res;
    }
}
