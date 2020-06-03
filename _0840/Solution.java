// 840. 矩阵中的幻方
// #easy
// -

package _0840;

class Solution {

    int[][] grid;

    public int numMagicSquaresInside(int[][] grid) {
        if (grid.length < 3 || grid[0].length < 3) return 0;
        this.grid = grid;
        int ans = 0;
        for (int i=1;i<grid.length-1;++i) {
            for (int j=1;j<grid[0].length-1;++j) {
                if (grid[i][j] == 5 && isMagic(i, j)) ++ans;
            }
        }
        return ans;
    }

    private boolean isMagic(int i, int j) {
        int[] tmp = new int[9];
        for (int m=i-1;m<=i+1;++m) {
            int curRow = 0;
            for (int n=j-1;n<=j+1;++n) {
                int cur = grid[m][n];
                curRow += cur;
                if (cur > 9 || cur < 1) return false;
                else {
                    ++tmp[cur-1];
                }
            }
            if (curRow != 15) return false;
        }
        for (int x=0;x<9;++x) {
            if (tmp[x] != 1) return false;
        }
        for (int n=j-1;n<=j+1;++n) {
            int curCol = 0;
            for (int m=i-1;m<=i+1;++m) {
                int cur = grid[m][n];
                curCol += cur;
            }
            if (curCol != 15) return false;
        }
        int diag1 = grid[i-1][j-1] + grid[i+1][j+1];
        int diag2 = grid[i-1][j+1] + grid[i+1][j-1];
        if (diag1 != 10 || diag2 != 10) return false;
        return true;
    }
}