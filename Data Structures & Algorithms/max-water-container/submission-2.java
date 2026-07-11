class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int area = -1;

        while (left <= right) {
            final int leftElement = heights[left];
            final int rightElement = heights[right];
            
            area = Math.max(
                area, 
                Math.min(leftElement, rightElement) * (right - left)
            );

            if (leftElement < rightElement) {
                left++;
            } else {
                right--;
            }
        }

        return area;
    }
}
