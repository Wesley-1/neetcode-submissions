class Solution {
    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> hashed = new HashMap<>();

        for (int i = 0; i < nums.length; i++) { 
            int num = nums[i];
            int diff = target - num;

            if (hashed.containsKey(diff))
                return new int[] {
                    hashed.get(diff), 
                    i
                };

            hashed.put(num, i);
        }

        return new int[]{};
    }
}
