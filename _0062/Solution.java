// 0062. unique paths
// #medium #dp
// *

package _0062;

import java.util.*;

class Solution {
    public int uniquePaths(int m, int n) {
        // dp[i][j] = dp[i-1][j] + dp[i][j-1]
        int[] cur = new int[n];
        Arrays.fill(cur,1);
        for (int i = 1; i < m;i++){
            for (int j = 1; j < n; j++){
                cur[j] += cur[j-1] ;
            }
        }
        return cur[n-1];
    }
}
