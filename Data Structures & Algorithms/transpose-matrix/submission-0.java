class Solution {
    public int[][] transpose(int[][] matrix) {
        final int rows = matrix.length;
        final int cols = matrix[0].length;

        final int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}