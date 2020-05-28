// 766. 托普利茨矩阵
// #easy
// -

package _0766;

import java.util.Arrays;

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int nRow = matrix.length;
        int nCol = matrix[0].length;
        if (nRow == 1 || nCol == 1) return true;
        int[] pre = Arrays.copyOf(matrix[0], nCol);
        for (int i=1;i<nRow;++i) {
            for (int j=1;j<nCol;++j) {
                if (matrix[i][j] != pre[j-1]) return false;
            }
            pre = Arrays.copyOf(matrix[i], nCol);
        }
        return true;
    }
}