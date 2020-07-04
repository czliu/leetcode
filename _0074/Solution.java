// 74. 搜索二维矩阵
// #medium
// -

package _0074;

class Solution {

    int m,n;
    int[][] matrix;

    public boolean searchMatrix(int[][] matrix, int target) {
        this.matrix = matrix;
        this.m = matrix.length;
        if (m == 0) return false;
        this.n = matrix[0].length;
        if (n == 0) return false;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int val = getVal(mid);
            if (val < target) left = mid + 1;
            else if (val > target) right = mid - 1;
            else return true;
        }
        return false;
    }

    private int getVal(int index) {
        return matrix[index / n][index % n];
    }
}
