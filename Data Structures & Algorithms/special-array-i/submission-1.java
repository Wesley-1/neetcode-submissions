class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            final int left = nums[i];
            final int right = nums[i + 1];

            if ((left & 1) != (right & 1)) continue;

            return false;
        }

        return true;
    }
}