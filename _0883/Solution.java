// 883. 三维形体投影面积
// #easy
// -

package _0883;

class Solution {
    public int projectionArea(int[][] grid) {
        int len = grid.length; // 1 <= grid.length = grid[0].length <= 50
        // xy
        int areaxy = 0;
        for (int i=0;i<len;++i) {
            for (int j=0;j<len;++j) {
                if (grid[i][j] > 0) ++areaxy;
            }
        }
        // yz
        int areayz = 0;
        for (int j=0;j<len;++j) {
            int max = 0;
            for (int i=0;i<len;++i) {
                max = Math.max(max, grid[i][j]);
            }
            areayz += max;
        }
        // zx
        int areazx = 0;
        for (int i=0;i<len;++i) {
            int max = 0;
            for (int j=0;j<len;++j) {
                max = Math.max(max, grid[i][j]);
            }
            areazx += max;
        }
        return areaxy + areayz + areazx;
    }
}