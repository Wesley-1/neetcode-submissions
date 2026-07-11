class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        final int rowLen = image.length;
        final int colLen = image[0].length; 

        final int startingColor = image[sr][sc];
        
        if (startingColor == color) return image;

        dfs(image, sr, sc, color, startingColor, rowLen, colLen);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int startingColor, int m, int n) {
        if (sr < 0 || sr >= m || sc < 0 || sc >= n || image[sr][sc] != startingColor) return;
        
        image[sr][sc] = color;

        dfs(image, sr + 1, sc, color, startingColor, m, n);
        dfs(image, sr - 1, sc, color, startingColor, m, n);
        dfs(image, sr, sc + 1, color, startingColor, m, n);
        dfs(image, sr, sc - 1, color, startingColor, m, n);
    }
}