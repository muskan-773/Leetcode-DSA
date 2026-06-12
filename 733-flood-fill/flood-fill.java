class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,image[sr][sc] ,color);
        return image;
    }
    public void dfs(int[][] image, int i, int j, int orgColor, int color){
        int row = image.length;
        int cols = image[0].length;
        if(i < 0 || i >= row || j < 0 || j >= cols) return;
        if(image[i][j] != orgColor) return;
        if(image[i][j] == color) return;
        image[i][j] = color;

        dfs(image, i+1, j,orgColor, color);
        dfs(image, i, j+1,orgColor, color);
        dfs(image, i-1, j,orgColor, color);
        dfs(image, i, j-1,orgColor, color);
    }
}
