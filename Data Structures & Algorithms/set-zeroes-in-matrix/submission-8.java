class Solution {
    public void setZeroes(int[][] matrix) {
        final int rows = matrix.length;
        final int cols = matrix[0].length;

        boolean zeroRow = false;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                final int val = matrix[r][c];

                if (val == 0) {
                    if (r > 0) matrix[r][0] = 0;
                    else zeroRow = true;

                    matrix[0][c] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

        if (zeroRow) {
            for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}
