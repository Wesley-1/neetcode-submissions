class Solution {
    public int longestConsecutive(int[] nums) {        
        // We first turn it to a set. So we dont touch dupes.
        // We then iterate over the nums. If nums - 1 isn't in the set.
        // We know its a candidate for the start.
        // If it is we continue. 
        // We loop until nums + count (0 --> seq size) isn't in set.

        final Set<Integer> set = new HashSet();

        for (int n : nums) {
            set.add(n);
        }

        int max = 0;
        for (int n : nums) {
            int count = 1;

            if (!set.contains(n - 1)) {
                while (set.contains(n + count)) {
                    count++;
                }
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
