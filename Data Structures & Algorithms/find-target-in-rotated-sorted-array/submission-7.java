class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int m = (left + right) / 2;

            if (nums[m] > nums[right]) left = m + 1;
            else if (nums[m] <= nums[right]) right = m;
        }

        int pivot = left;

        int search = binarySearch(nums, pivot, nums.length - 1, target);

        return search == -1 ? binarySearch(nums, 0, pivot - 1, target) : search;
    }

    public int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            final int midValue = nums[mid];

            if (midValue == target) return mid;

            if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
