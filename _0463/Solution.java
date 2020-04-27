// 0463. Island perimeter
// #easy

package _0463;

public class Solution {

    int[][] grid;
    int x, y;

    public int islandPerimeter(int[][] grid) {
        this.x = grid.length;
        this.y = grid[0].length;
        this.grid = grid;
        int ans = 0;
        for (int i=0;i<x;++i){
            for (int j=0;j<y;++j){
                if (grid[i][j] == 1) ans += count(i, j);
            }
        }
        return ans;
    }

    private int count(int i, int j){
        int ans = 0;
        int[] a = new int[] {-1, 0, 0, 1};
        int[] b = new int[] {0, -1, 1, 0};
        for (int k=0;k<4;++k) {
            if (i+a[k] < 0) ++ans;
            else if (i+a[k] > x-1) ++ans;
            else if (j+b[k] < 0) ++ans;
            else if (j+b[k] > y-1) ++ans;
            else if (grid[i+a[k]][j+b[k]] == 0) ++ans;
        }
        return ans;
    }

}