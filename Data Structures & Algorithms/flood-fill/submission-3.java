class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {        
        if (image[sr][sc] == color) return image;

        dfs(
            image, 
            sr, 
            sc, 
            color,
            image[sr][sc]
        );

        return image;
    }

    public void dfs(
        int[][] image, 
        int sr, 
        int sc, 
        int color,
        int startingColor
    ) {
        if (sr >= image.length || sr < 0) return;
        if (sc >= image[0].length || sc < 0) return;
        if (image[sr][sc] != startingColor) return;

        image[sr][sc] = color;

        dfs(image, sr + 1, sc, color, startingColor);
        dfs(image, sr - 1, sc, color, startingColor);
        dfs(image, sr, sc + 1, color, startingColor);
        dfs(image, sr, sc - 1, color, startingColor);
    }
}