class Solution {
    
    public void rotate(int[][] matrix) {
        reverseTranspose(matrix);
    }

    public void reverseTranspose(int[][] matrix) {
        final int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                final int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                final int tmp = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }


}
