class Solution {
    public int longestConsecutive(int[] nums) {  
        final Set<Integer> iSet = new HashSet();

        for (int i : nums) iSet.add(i);

        int max = 0;
        for (int n : nums) {
            int c = 1;
            if (!iSet.contains(n - 1)) {
                while (iSet.contains(n + c)) {
                    c++;
                }
            }

            max = Math.max(max, c);
        }     

        return max; 
    }
}
