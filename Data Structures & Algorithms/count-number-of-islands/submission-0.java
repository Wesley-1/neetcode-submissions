class Solution {
    public int numIslands(char[][] grid) {

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, grid, visited);
                    count++; 
                }
            }
        }

        return count;
    }

    public void dfs(int i, int j, char[][] grid, boolean[][] visited) {
        if (grid[i][j] == '0') {
            return;
        }

        visited[i][j] = true; 

        if (i > 0 && grid[i-1][j] == '1' && !visited[i-1][j]) {
            dfs(i-1, j, grid, visited);
        }

        if (i < grid.length - 1 && grid[i+1][j] == '1' && !visited[i+1][j]) {
            dfs(i+1, j, grid, visited);
        }

        if (j > 0 && grid[i][j-1] == '1' && !visited[i][j-1]) {
            dfs(i, j-1, grid, visited);
        }
        
        if (j < grid[0].length - 1 && grid[i][j+1] == '1' && !visited[i][j+1]) {
            dfs(i, j+1, grid, visited);
        }
    }
}
