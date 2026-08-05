class Solution {
    public int longestConsecutive(int[] nums) {
        final Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            final int value = nums[i];
            if (map.containsKey(value)) continue;
            map.put(value, map.getOrDefault(value - 1, 0) + map.getOrDefault(value + 1, 0) + 1);
            map.put(value - map.getOrDefault(value - 1, 0), map.get(value));
            map.put(value + map.getOrDefault(value + 1, 0), map.get(value));
        }

        return map.values().stream().max(Integer::compare).orElse(0);
    }
}
