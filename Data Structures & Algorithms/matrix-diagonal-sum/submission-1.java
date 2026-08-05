class Solution {
    public int diagonalSum(int[][] mat) {
        int tot =0;
        
        tot += diagSum(0, 0, mat);
        tot += diagSum2(0, mat.length - 1, mat);
        
        if (mat.length % 2 == 1) {
            tot -= mat[mat.length / 2][mat.length / 2];
        }        

        return tot;
    }

    public int diagSum2(int row, int col, int[][] mat) {
        int n = mat.length;

        int tot = 0;
        while (row < n && col >= 0) {
            tot += mat[row][col];

            col--;
            row++;
        }

        return tot;
    }

    public int diagSum(int row, int col, int[][] mat) {
        int n = mat.length;

        int tot = 0;
        while (row < n && col < n) {
            tot += mat[row][col];

            col++;
            row++;
        }

        return tot;
    }
}