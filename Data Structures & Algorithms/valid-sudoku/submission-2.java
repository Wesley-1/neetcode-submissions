class Solution {
    public boolean isValidSudoku(char[][] board) {
        // row only 1-9
        // col only 1-9
        // 3x3 grid only 1-9

        final Set<String> rowSet = new HashSet();
        final Set<String> colSet = new HashSet();
        final Set<String> cubeSet = new HashSet();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                final char value = board[i][j];
                if (value == '.') continue;

                System.out.println("Value " + value);
                final String rowKey = i + ":" + value;
                final String colKey = j + ":" + value;
                final String boxKey = (j / 3) + ":" + (i / 3) + ":" + value;
                System.out.println("i: " + i + " j: "+ j + " key: " + boxKey);
                if (rowSet.contains(rowKey) ||
                    colSet.contains(colKey) ||
                    cubeSet.contains(boxKey)
                ) return false;

                rowSet.add(rowKey);
                colSet.add(colKey);
                cubeSet.add(boxKey);

            }
        }

        return true;
    }
}
