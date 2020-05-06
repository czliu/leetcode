// 0070. climbing stairs
// -
// #easy #dp

package _0070;

public class Solution {

    public int climbStairs(int n) {
        // dp[n] = dp[n-1] + dp[n-2]
        int[] dp = new int[n+1];
        if (n == 1) return 1;
        if (n == 2) return 2;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        int i = 3;
        while (i <= n) {
            dp[i] = dp[i-1] + dp[i-2];
            ++i;
        }
        return dp[n];
    }
    
}