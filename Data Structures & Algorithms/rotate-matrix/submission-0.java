class Solution {
    
    public void rotate(int[][] matrix) {
        // if it can't go down, it cant go left it must go up. (--i >= rowLen, --j < 0)
        // if it cant go up it must go right. 
        // if it can't go right it must go down.
        // if it cant go down it must go left. 
        
        final int len = matrix.length;
        // X X X X X (0, 0), (0, 4)
        // X X X X X len - i
        // X X O X X
        // X X X X X
        // X X X X X

        // X X
        // X X

        // 2 / 2

        // 1 2 3
        // 4 5 6
        // 7 8 9

        // 7 4 1
        // 8 5 2
        // 9 6 3

        // Taking columns as rows. 

        // first column becomes first row. 

        final int[][] arr = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {            
            for (int j = 0; j < matrix.length; j++) {
                arr[i][j] = matrix[matrix.length - j - 1][i];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = arr[i][j];
            }
        }

    }


}
