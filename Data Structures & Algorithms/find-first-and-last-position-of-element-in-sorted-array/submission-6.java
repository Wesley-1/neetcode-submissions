class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums, target, true), binarySearch(nums, target, false)};
    }

    public int binarySearch(int[] nums, int target, boolean leftBias) {
        int left = 0;
        int right = nums.length - 1;

        int i = -1;
        while (left <= right) {
            final int mid = left + (right - left) / 2;

            if (target > nums[mid]) 
                left = mid + 1;
            else if (target < nums[mid]) 
                right = mid - 1;
            else {
                i = mid;
                if (leftBias)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }

        return i;
    }
}