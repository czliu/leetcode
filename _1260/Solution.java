// 1260. 二维网格迁移
// #easy
// -

package _1260;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int rightCol = n-1;
        rightCol = (n - 1) - k % n;
        int leftCol = (rightCol + 1) % n;
        int downCount = (k / n) % m;
        // [0, rightCol] should move down downCount times
        // other col should move down downCount+1 times
        for (int i=0;i<=rightCol;++i) {
            moveDown(grid, i, downCount);
        }
        for (int i=rightCol+1;i<n;++i) {
            moveDown(grid, i, downCount+1);
        }
        List<List<Integer>> list = new LinkedList<>();
        for (int i=0;i<m;++i) {
            List<Integer> cur = new LinkedList<>();
            for (int j=0;j<n;++j) {
                cur.add(grid[i][(leftCol+j) % n]);
            }
            list.add(cur);
        }
        return list;
    }

    private void moveDown(int[][] grid, int col, int downCount) {
        int m = grid.length;
        int[] tmp = new int[m];
        for (int i=0;i<m;++i) {
            tmp[(i+downCount) % m] = grid[i][col];
        }
        for (int i=0;i<m;++i) grid[i][col] = tmp[i];
    }
}