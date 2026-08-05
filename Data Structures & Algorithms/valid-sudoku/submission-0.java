class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Each row must contains the digits 1-9 w/o duplicates.
        // Each column must contain the digits 1-9 w/o duplicates.
        // Each of the nine 3x3 sub boxes of the grid must contain the digits 1-9 w/o duplicates.

        // Validate Rows.
        // Validate Columns.
        // Validate 3x3 boxes. 

        final int rows = board.length;

        // [1, 2, 3, 4, 5, 6]
        // [1, 2, 3, 4, 5, 6]
        // [1, 2, 3, 4, 5, 6]
        // [1, 2, 3, 4, 5, 6]
        // [1, 2, 3, 4, 5, 6]
        // [1, 2, 3, 4, 5, 6]

        // i = 0
        // j = 0
        // board[0 + 0][0 + 0]
        // board[1 + 0][0 + 0]
        // board[0 + 3]
        for (int i = 0; i < rows; i += 3) {
            for (int j = 0; j < rows; j += 3) {
                final Set<Character> boxSet = new HashSet();

                for (int k = 0; k < 3; k++) {
                    for (int o = 0; o < 3; o++) {
                        final Character cell = board[k + i][o + j];
                        
                        if (boxSet.contains(cell) && !cell.equals('.'))
                            return false;

                        System.out.print(cell + ":");
                        boxSet.add(cell);
                    }
                    System.out.println();
                }
                System.out.println("Next Box");
            }
        }

        for (int i = 0; i < rows; i++) {
            final Set<Character> rowSet = new HashSet();
            final Set<Character> colSet = new HashSet();

            for (int j = 0; j < rows; j++) {
                final Character colValidation = board[j][i];
                final Character rowValidation = board[i][j];

                if (rowSet.contains(rowValidation) && !rowValidation.equals('.'))
                    return false;
                
                if (colSet.contains(colValidation) && !colValidation.equals('.'))
                    return false;
                
                rowSet.add(rowValidation);
                colSet.add(colValidation);
            }
        }

        return true;
    }

    // ["1","2","."  ,".","3","."  ,".",".","."]
    // ["4",".","."  ,"5",".","."  ,".",".","."]
    // [".","9","1"  ,".",".","."  ,".",".","3"]
    
    // ["5",".","."  ,".","6","."  ,".",".","4"]
    // [".",".","."  ,"8",".","3" ,".",".","5"]
    // ["7",".","."  ,".","2","."  ,".",".","6"]
   
    // [".",".","."  ,".",".","."  ,"2",".","."]
    // [".",".","."  ,"4","1","9" ,".",".","8"]
    // [".",".","."  ,".","8","."  ,".","7","9"]
}
