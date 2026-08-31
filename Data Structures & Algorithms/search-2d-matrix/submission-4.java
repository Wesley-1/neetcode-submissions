class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        final int m = matrix.length;
        final int n = matrix[0].length;

        int left = 0;
        int right = (m * n) - 1;

        while (left <= right) {
            final int mid = left + (right - left) / 2;

            final int row = mid / n;
            final int col = mid % n;

            final int midValue = matrix[row][col];

            if (midValue > target) {
                right = mid - 1;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
