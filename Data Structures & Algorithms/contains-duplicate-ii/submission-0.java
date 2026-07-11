class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if ((i - left) > k) {
                hs.remove(nums[left]);
                left++;
            }

            if (hs.contains(nums[i])) return true;
            hs.add(nums[i]);
        }
       
        return false;
    }
}