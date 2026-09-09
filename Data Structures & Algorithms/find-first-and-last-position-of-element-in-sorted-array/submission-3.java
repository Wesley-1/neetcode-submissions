class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int start = binarySearch(nums, target, nums.length);
        if (start == nums.length || nums[start] != target) {
            return new int[]{-1, -1};
        }


        return new int[]{start, binarySearch(nums, target + 1, nums.length) - 1};
        
    }

    public int binarySearch(int[] nums, int target, int n) {
        int left = 0;
        int right = n;

        while (left < right) {
            final int m = left + (right - left) / 2;
            
            if (nums[m] >= target) right = m;
            else left = m + 1;
        }

        return left;
    }
}