class Solution {
    
    public void rotate(int[][] matrix) {
        reverseTranspose(matrix);
    }

    public void reverseTranspose(int[][] matrix) {
        final int rows = matrix.length;
        final int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                final int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows / 2; j++) {
                final int tmp = matrix[i][rows - j - 1];
                matrix[i][rows - j - 1] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }


}
