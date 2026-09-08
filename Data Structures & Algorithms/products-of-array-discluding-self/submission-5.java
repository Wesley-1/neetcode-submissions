class Solution {
    public int[] productExceptSelf(int[] nums) {
        final Map<Integer, Integer> suffixes = new HashMap();
        final int len = nums.length;


        int suffix = 1;
        for (int i = len - 1; i >= 0; i--) {
            suffixes.put(i, suffix);
            suffix *= nums[i];
        }

        final int[] res = new int[len];

        int prefix = 1;
        for (int i = 0; i < len; i++) {
            res[i] = prefix * suffixes.get(i);
            prefix *= nums[i];
        }

        return res;
    }
}  
