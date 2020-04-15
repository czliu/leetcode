// 0542. 01 Matrix

// BFS, LinkedList

package _0542;

import java.util.*;

public class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        if (matrix == null) return null;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[m][n];
        LinkedList<int[]> list = new LinkedList<>();
        int[] deltaX = {-1, 0, 0, 1};
        int[] deltaY = {0, -1, 1, 0};
        // 初始化ans, 并且将所有的0添加进初始队列中
        for (int i=0;i<m;++i){
            for (int j=0;j<n;++j){
                if (matrix[i][j] == 0) {
                    ans[i][j] = 0;
                    list.add(new int[] {i,j});
                }
                else ans[i][j] = -1;
            }
        }
        // BFS
        while (!list.isEmpty()){
            int[] cur = list.pollFirst();
            for (int k=0;k<4;++k){
                int x = cur[0]+deltaX[k];
                int y = cur[1]+deltaY[k];
                if (x >= 0 && x <= m-1 && y >= 0 && y <= n-1 && ans[x][y] == -1){
                    list.add(new int[] {x, y});
                    ans[x][y] = ans[cur[0]][cur[1]] + 1;
                }
            }
        }
        return ans;
    }
}