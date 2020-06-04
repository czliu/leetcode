// 867. 转置矩阵
// #easy
// -

package _0867;

class Solution {
    public int[][] transpose(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int[][] ans = new int[c][r];
        for (int i=0;i<r;++i) {
            for (int j=0;j<c;++j) {
                ans[j][i] = A[i][j];
            }
        }
        return ans;
    }
}