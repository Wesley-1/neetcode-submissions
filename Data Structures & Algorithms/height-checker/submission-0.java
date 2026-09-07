class Solution {
    public int heightChecker(int[] heights) {
        final int len = heights.length;

        int[] original = new int[len];

        for (int i = 0; i < len; i++) original[i] = heights[i];

        Arrays.sort(heights);

        int res = 0;
        for (int i = 0; i < len; i++) {
            if (heights[i] != original[i]) res++;
        }

        return res;
    }
}