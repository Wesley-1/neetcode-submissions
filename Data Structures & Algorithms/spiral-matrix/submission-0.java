class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length;

        int top = 0;
        int bottom = matrix.length;

        List<Integer> values = new ArrayList();

        while (left < right && top < bottom) {
            for (int i = left; i < right; i++) {
                values.add(matrix[top][i]);
            }

            top += 1;

            for (int i = top; i < bottom; i++) {
                System.out.println(i);
                values.add(matrix[i][right - 1]);
            }

            right -= 1;
            
            if (!(left < right && top < bottom))
                break;
            
            for (int i = right - 1; i >= left; i--) {
                values.add(matrix[bottom - 1][i]);
            }

            bottom -= 1;

            for (int i = bottom - 1; i >= top; i--) {
                values.add(matrix[i][left]);
            }

            left += 1;
        }

        return values;
    }
}
