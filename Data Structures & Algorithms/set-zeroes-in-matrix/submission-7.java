class Solution {
    public void setZeroes(int[][] matrix) {
        final int rows = matrix.length;
        final int cols = matrix[0].length;

        boolean zeroFirst = false;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int c = matrix[row][col];

                if (c == 0) {
                    matrix[0][col] = 0;
                    if (row > 0)
                        matrix[row][0] = 0;
                    else
                        zeroFirst = true;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        

        if (matrix[0][0] == 0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

        if (zeroFirst) {
            for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}
