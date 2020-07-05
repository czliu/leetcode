// 96. 不同的二叉搜索树
// #medium
// -

package _0096;

class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<=n;++i) {
            for (int root=1;root<=i;++root) {
                dp[i] += dp[root-1] * dp[i-root];
            }
        }
        return dp[n];
    }
}