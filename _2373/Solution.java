package _2373;

public class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for (int i=0;i<n-2;++i) {
            for (int j=0;j<n-2;++j) {
                int max = grid[i][j];
                for (int x=0;x<3;++x) {
                    for (int y=0;y<3;++y) max = Math.max(max, grid[i+x][j+y]);
                }
                ans[i][j] = max;
            }
        }
        return ans;
    }
}
