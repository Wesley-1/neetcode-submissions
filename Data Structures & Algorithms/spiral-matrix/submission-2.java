class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        final List<Integer> res = new ArrayList();

        final int rows = matrix.length;
        final int cols = matrix[0].length;

        int top = 0;
        int right = cols;

        int bottom = rows;
        int left = 0;

        while (res.size() != rows * cols) {
            // go over top
            for (int i = left; i < right; i++) {
                res.add(matrix[top][i]);
            }

            top++;

            // go top to bottom.
            for (int i = top; i < bottom; i++) {
                res.add(matrix[i][right - 1]);
            }

            right--;

            if (!(left < right && top < bottom)) break;

            // go left to right.
            for (int i = right - 1; i >= left; i--) {
                res.add(matrix[bottom - 1][i]);
            }

            bottom--;

            for (int i = bottom - 1; i >= top; i--) {
                res.add(matrix[i][left]);
            }

            left++;
        }

        return res;
    }
}
