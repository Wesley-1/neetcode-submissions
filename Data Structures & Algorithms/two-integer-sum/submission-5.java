class Solution {
    public int[] twoSum(int[] nums, int target) {
      final Map<Integer, Integer> diffMap = new HashMap();

      for (int i = 0; i < nums.length; i++) {
        final int value = nums[i];
        final int diff = target - value;

        if (diffMap.containsKey(diff)) {
            return new int[]{diffMap.get(diff), i};
        }

        diffMap.put(value, i);
      }

      return new int[]{};
    }
}
