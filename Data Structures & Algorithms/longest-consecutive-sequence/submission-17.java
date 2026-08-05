class Solution {
    public int longestConsecutive(int[] nums) {        
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
