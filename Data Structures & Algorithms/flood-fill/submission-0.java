class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        final int rowLen = image.length;
        final int colLen = image[0].length; 
        return dfs(image, sr, sc, color, image[sr][sc], new boolean[rowLen][colLen]);
    }

    public int[][] dfs(int[][] image, int sr, int sc, int color, int startingColor, boolean[][] visited) {
        final int rowLen = image.length;
        final int colLen = image[0].length;

        if (sr >= rowLen || sc >= colLen || sr < 0 || sc < 0) return image;

        if (visited[sr][sc]) return image;

        if (image[sr][sc] != startingColor) return image;

        visited[sr][sc] = true;
        
        dfs(image, sr + 1, sc, color, startingColor, visited);
        dfs(image, sr, sc + 1, color, startingColor, visited);
        dfs(image, sr - 1, sc, color, startingColor, visited);
        dfs(image, sr, sc - 1, color, startingColor, visited);

        image[sr][sc] = color;

        return image;
    }
}