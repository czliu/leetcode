package _0566;

public class Solution2 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) return mat;

        int[][] ans = new int[r][c];
        int x=0, y=0;
        for (int i=0;i<m;++i) {
            for (int j=0;j<n;++j) {
                if (y > c-1) {
                    y = 0;
                    x++;
                    ans[x][y++] = mat[i][j];
                }
                else ans[x][y++] = mat[i][j];
            }
        }
        return ans;
    }
}
