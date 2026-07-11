class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        int maximum = Integer.MIN_VALUE;

        for (int num : nums) set.add(num);
        
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) 
                    length++;
                maximum = Math.max(maximum, length);
            }
        }

        for (Integer element : set) {
            System.out.println(element);
        }

        return maximum;
    }
}
