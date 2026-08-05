class Solution {
    public void setZeroes(int[][] matrix) {
        final int rows = matrix.length;
        final int cols = matrix[0].length;

        int processed = 0;

        final int[][] m = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int c = matrix[row][col];
                m[row][col] = c;
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int c = matrix[row][col];
                if (c == 0) {
                    for (int i = 0; i < rows; i++) {
                        m[i][col] = 0;
                    }

                    for (int i = 0; i < cols; i++) {
                        m[row][i] = 0;
                    }
                }
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = m[i][j];
            }
        }
    }
}
