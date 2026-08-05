class Solution {
    public int[][] generateMatrix(int n) {
        final int[][] matrix = new int[n][n];

        int left = 0;
        int right = n;
        
        int top = 0;
        int bottom = n;

        int value = 1;
        while (left < right && top < bottom) {
            // process left to right. 
            for (int i = left; i < right; i++) {
                matrix[top][i] = value++;
            }
            
            // we completed the right side. So bring it closer.
            top++;

            // process top to bottom.
            for (int i = top; i < bottom; i++) {
                matrix[i][right - 1] = value++;
            }

            // we finished the bottom now we move it up.
            right--;

            if (!(left < right && top < bottom)) break;

            // process right to left. 
            for (int i = right - 1; i >= left; i--) {
                matrix[bottom - 1][i] = value++;
            }

            // we finished left so now we move it in.
            bottom--;

            // proces bottom to top.
            for (int i = bottom - 1; i >= top; i--) {
                matrix[i][left] = value++;
            }

            // we finished the top so we move it down.
            left++;
        }

        return matrix;
    }
}