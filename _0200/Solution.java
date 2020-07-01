// 200. 岛屿数量
// #medium
// -

package _0200;

import java.util.Stack;

class Solution {

    int[] x = new int[] {0,0,1,-1};
    int[] y = new int[] {1,-1,0,0};
    int m = 0;
    int n = 0;
    char[][] grid;

    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        if (m == 0) return 0;
        this.n = grid[0].length;
        if (n == 0) return 0;
        int count = 0;
        for (int i=0;i<m;++i) {
            for (int j=0;j<n;++j) {
                if (grid[i][j] == '1') {
                    ++count;
                    helper(i,j);
                }
            }
        }
        return count;
    }

    private void helper(int i, int j) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] {i, j});
        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            grid[cur[0]][cur[1]] = '0';
            for (int k=0;k<=3;++k) {
                if (cur[0] + x[k] >= 0 && cur[0] + x[k] < m && cur[1] + y[k] >= 0 && cur[1] + y[k] < n && grid[cur[0]+x[k]][cur[1]+y[k]] == '1') {
                    stack.push(new int[] {cur[0]+x[k], cur[1]+y[k]});
                }
            }
        }
    }
}