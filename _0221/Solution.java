// 0221. maximal square
// *
// #medium #dp
// related: 1277. count square submatrices with all ones

package _0221;

class Solution {

    public int maximalSquare(char[][] matrix) {
        //if matrix(i,j) ==0, dp(i,j) = 0
        //if matrix(i,j) ==1, dp(i,j) = min(dp(i−1,j),dp(i−1,j−1),dp(i,j−1))+1
        int m = matrix.length;
        if (m == 0) return 0;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i=0;i<m;++i){
            for (int j=0;j<n;++j){
                if (matrix[i][j] == '0') dp[i][j] = 0;
                else { // matrix[i][j] == '1'
                    if (i == 0 || j == 0) dp[i][j] = 1;
                    else dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]), dp[i][j-1]) + 1;
                }
            }
        }
        int ans = 0;
        for (int i=0;i<m;++i){
            for (int j=0;j<n;++j){
                if (dp[i][j] > ans) ans = dp[i][j];
            }
        }
        return ans*ans;
    }
}
