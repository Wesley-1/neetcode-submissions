class Solution {
    public int maxArea(int[] heights) {
        final int n = heights.length;

        int left = 0;
        int right = n - 1;

        int maximum = 0;
        while (left < right) {
            final int length = right - left;

            final int leftHeight = heights[left];
            final int rightHeight = heights[right];

            final int width = Math.min(leftHeight, rightHeight);

            if (leftHeight < rightHeight) left++;
            else right--;

            maximum = Math.max(length * width, maximum);
        }

        return maximum;
    }
}
