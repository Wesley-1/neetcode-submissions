class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr : matrix) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = left + ((right - left) / 2);
                int value = arr[mid];

                if (value < target) left = mid + 1;
                else if (value > target) right = mid -1;
                else return true;
            }
        }
        return false;
    }
}
