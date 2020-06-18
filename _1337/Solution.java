// 1337. 方阵中战斗力最弱的 K 行
// #easy
// *

package _1337;

import java.util.Arrays;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[] count = new int[m];
        for (int i=0;i<m;++i) {
            for (int j=0;j<n;++j) {
                if (mat[i][j] == 1) ++count[i];
                else break;
            }
            count[i] = count[i] * 1000 + i;
        }
        Arrays.sort(count);
        int[] ans = new int[k];
        for (int i=0;i<k;++i) ans[i] = count[i] % 1000;
        return ans;
    }
}
