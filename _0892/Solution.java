// 892. 三维形体的表面积
// #easy
// -

package _0892;

class Solution {
    public int surfaceArea(int[][] grid) {
        int ans = 0, n = grid.length;
        for (int i=0;i<n;++i) {
            for (int j=0;j<n;++j) {
                if (grid[i][j] > 0) {
                    ans += 2; // top and bottom
                    if (i == 0) ans += grid[i][j];
                    else if (grid[i][j] > grid[i-1][j]) ans += (grid[i][j] - grid[i-1][j]);
                    if (i == n-1) ans += grid[i][j];
                    else if (grid[i][j] > grid[i+1][j]) ans += (grid[i][j] - grid[i+1][j]);
                    if (j == 0) ans += grid[i][j];
                    else if (grid[i][j] > grid[i][j-1]) ans += (grid[i][j] - grid[i][j-1]);
                    if (j == n-1) ans += grid[i][j];
                    else if (grid[i][j] > grid[i][j+1]) ans += (grid[i][j] - grid[i][j+1]);
                } 
            }
        }
        return ans;
    }
}