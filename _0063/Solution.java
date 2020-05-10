// 0063. unique paths II
// #medium #dp
// *

package _0063;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid[0].length;
        int n = obstacleGrid.length;
        int[][] ans = new int[n][m];
        if (obstacleGrid[0][0] == 1) return 0;
        else ans[0][0] = 1;
        for (int i=0;i<n;++i) {
            for (int j=0;j<m;++j){
                if (obstacleGrid[i][j] == 1) {
                    ans[i][j] = 0;
                    continue;
                }
                else if (i == 0 && j == 0) continue;
                else if (i == 0) ans[i][j] = ans[i][j-1];
                else if (j == 0) ans[i][j] = ans[i-1][j];
                else ans[i][j] = ans[i-1][j] + ans[i][j-1];
            }
        }
        return ans[n-1][m-1];
    }
}
