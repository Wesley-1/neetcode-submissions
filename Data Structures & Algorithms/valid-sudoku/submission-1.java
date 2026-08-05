class Solution {
    public boolean isValidSudoku(char[][] board) {
        final Set<String> cols = new HashSet();
        final Set<String> rows = new HashSet();
        final Set<String> boxes = new HashSet();

        final int rowLen = board.length;

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < rowLen; j++) {
                final Character cell = board[i][j];

                if (cell.equals('.')) continue;

                final String rowKey = i + "," + cell;
                final String colKey = j + "," + cell;

                // 3 
                // 0
                final String boxKey = (i / 3) + "," + (j / 3) + "," + cell;

                if (rows.contains(rowKey)) return false;
                if (cols.contains(colKey)) return false;
                if (boxes.contains(boxKey)) return false;

                boxes.add(boxKey);
                cols.add(colKey);
                rows.add(rowKey);
            }
        }

        return true;

        // // [1, 2, 3, 4, 5, 6]
        // // [1, 2, 3, 4, 5, 6]
        // // [1, 2, 3, 4, 5, 6]
        // // [1, 2, 3, 4, 5, 6]
        // // [1, 2, 3, 4, 5, 6]
        // // [1, 2, 3, 4, 5, 6]

        // // i = 0
        // // j = 0
        // // board[0 + 0][0 + 0]
        // // board[1 + 0][0 + 0]
        // // board[0 + 3]
        // for (int i = 0; i < rows; i += 3) {
        //     for (int j = 0; j < rows; j += 3) {
        //         final Set<Character> boxSet = new HashSet();

        //         for (int k = 0; k < 3; k++) {
        //             for (int o = 0; o < 3; o++) {
        //                 final Character cell = board[k + i][o + j];
                        
        //                 if (boxSet.contains(cell) && !cell.equals('.'))
        //                     return false;

        //                 boxSet.add(cell);
        //             }
        //             System.out.println();
        //         }
        //     }
        // }

        // for (int i = 0; i < rows; i++) {
        //     final Set<Character> rowSet = new HashSet();
        //     final Set<Character> colSet = new HashSet();

        //     for (int j = 0; j < rows; j++) {
        //         final Character colValidation = board[j][i];
        //         final Character rowValidation = board[i][j];

        //         if (rowSet.contains(rowValidation) && !rowValidation.equals('.'))
        //             return false;
                
        //         if (colSet.contains(colValidation) && !colValidation.equals('.'))
        //             return false;
                
        //         rowSet.add(rowValidation);
        //         colSet.add(colValidation);
        //     }
        // }

        // return true;
    }
}
