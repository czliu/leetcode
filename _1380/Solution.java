// 1380. 矩阵中的幸运数
// #easy
// -

package _1380;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new LinkedList<>();
        for (int i=0;i<m;++i) {
            int min = matrix[i][0];
            int minInd = 0;
            for (int j=0;j<n;++j) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minInd = j;
                }
            }
            for (int k=0;k<m;++k) {
                if (matrix[k][minInd] > min) {
                    min = matrix[k][minInd];
                    break;
                };
            }
            if (min == matrix[i][minInd]) list.add(min);
        }
        return list;
    }
}
