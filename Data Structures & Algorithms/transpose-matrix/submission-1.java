class Solution {
    public int[][] transpose(int[][] matrix) {
      final int m = matrix.length;
      final int n = matrix[0].length;

      final int[][] mat = new int[n][m];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            mat[i][j] = matrix[j][i];
        }
      }

      return mat;
    }
}