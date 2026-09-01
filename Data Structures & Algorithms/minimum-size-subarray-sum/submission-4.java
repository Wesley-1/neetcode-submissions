class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minimum = Integer.MAX_VALUE;

        int sum = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            final int n = nums[i];
            sum += n;

            while (left < nums.length && sum >= target) {
                minimum = Math.min(minimum, (i - left) + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minimum == Integer.MAX_VALUE ? 0 : minimum;
    }
}