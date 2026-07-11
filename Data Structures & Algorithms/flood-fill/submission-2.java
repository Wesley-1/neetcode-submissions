class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        final int rowLen = image.length;
        final int colLen = image[0].length; 

        if (image[sr][sc] == color) return image;

        return dfs(image, sr, sc, color, image[sr][sc]);
    }

    public int[][] dfs(int[][] image, int sr, int sc, int color, int startingColor) {
        final int rowLen = image.length;
        final int colLen = image[0].length;

        if (sr >= rowLen || sc >= colLen || sr < 0 || sc < 0) return image;

        if (image[sr][sc] != startingColor) return image;
        
        image[sr][sc] = color;

        dfs(image, sr + 1, sc, color, startingColor);
        dfs(image, sr, sc + 1, color, startingColor);
        dfs(image, sr - 1, sc, color, startingColor);
        dfs(image, sr, sc - 1, color, startingColor);

        return image;
    }
}