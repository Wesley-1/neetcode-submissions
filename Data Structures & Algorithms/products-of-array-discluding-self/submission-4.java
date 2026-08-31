class Solution {
    public int[] productExceptSelf(int[] nums) {
        final Map<Integer, Integer> sMap = new HashMap();

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            sMap.put(i, suffix);
            suffix *= nums[i];
        }
        
        int prefix = 1;
        
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            nums[i] = sMap.getOrDefault(i, 1) * prefix;
            prefix *= tmp;
        }

        return nums;
    }
}  
