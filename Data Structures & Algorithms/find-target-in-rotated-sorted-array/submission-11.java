class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            final int mid = left + (right - left) / 2;

            if (nums[mid] >= nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int pivot = left;

        int result = binarySearch(nums, 0, pivot, target);

        return result == -1 ? binarySearch(nums, pivot, nums.length - 1, target) : result;
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            final int mid = left + (right - left) / 2;
            final int value = nums[mid];

            if (value == target) 
                return mid;

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
