class Solution {
    public int[] twoSum(int[] nums, int target) {
       // i = t - j
       final Map<Integer, Integer> cache = new HashMap();

       for (int i = 0; i < nums.length; i++) {
            final int form = target - nums[i];
            final Integer val = cache.get(form);

            if (val != null) {
                return new int[]{val, i};
            }
            
            cache.put(nums[i], i);
       }

       return null;
    }
}
