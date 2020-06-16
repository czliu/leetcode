// 1252. 奇数值单元格的数目
// #easy
// -

package _1252;

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[] rows = new int[n];
        int[] cols = new int[m];
        for (int[] k : indices) {
            rows[k[0]] = 1 - rows[k[0]];
            cols[k[1]] = 1 - cols[k[1]];
        }
        int onesInRow = 0;
        int onesInCol = 0;
        for (int k : rows) onesInRow += k;
        for (int k : cols) onesInCol += k;
        return onesInRow * (m - onesInCol) + (n - onesInRow) * onesInCol;
    }
}