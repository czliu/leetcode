// 0048. rotate image
// *
// #medium

package _0048;

public class Solution {

    int n;

    public void rotate(int[][] matrix) {
        n = matrix.length;
        if (n == 0) return;
        if (n == 1) return;
        for (int k=0;k<=(n/2)-1;++k) {
            helper(matrix, k);
        }
    }

    private void helper(int[][] matrix, int k) {
        int j = k;
        for (int i=k;i<=n-k-2;++i){
            rotateNum(matrix, i, j);
        }
    }

    private void rotateNum(int[][] matrix, int i, int j) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[n-1-j][j];
        matrix[n-1-i][j] = matrix[n-1-i][n-1-j];
        matrix[n-1-i][n-1-j] = matrix[i][n-1-j];
        matrix[i][n-1-j] = tmp;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] matrix = {{1,2}, {3,4}};
        s.rotate(matrix);
    }
}