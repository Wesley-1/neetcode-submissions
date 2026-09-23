class Solution {
    public int[] sortArray(int[] nums) {
        // base case: 0 or 1 elements are already sorted
        if (nums.length < 2) {
            return nums;
        }
 
        int pivot = nums.length / 2;
        int[] left_sub = new int[pivot];
        int[] right_sub = new int[nums.length - pivot];
 
        // copy the two halves out of nums
        System.arraycopy(nums, 0, left_sub, 0, pivot);
        System.arraycopy(nums, pivot, right_sub, 0, right_sub.length);
 
        // recursively sort each half, capturing the sorted result
        left_sub = sortArray(left_sub);
        right_sub = sortArray(right_sub);
 
        // merge the two sorted halves back into one sorted array
        return merge(left_sub, right_sub);
    }
 
    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
 
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
 
        // copy any leftovers (only one of these loops actually runs)
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}