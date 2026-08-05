class Solution {
    public int[] productExceptSelf(int[] nums) {
        final int len = nums.length;

        final Map<Integer, Integer> suffix = new HashMap();

        for (int i = len - 2; i >= 0; i--) {
            final int value = nums[i + 1];
            suffix.put(i, value * suffix.getOrDefault(i + 1, 1));
        }

        int prefix = 1;
        
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = suffix.getOrDefault(i, 1) * prefix;
            prefix *= nums[i];
        }

        return res;
    }
}  
