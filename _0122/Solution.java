// 0122. best time to buy and sell stock II
// #easy #dp
// -

package _0122;

public class Solution {

    public int maxProfit(int[] prices) {
        // dp(i,0) = max(dp(i-1,0), dp(i-1,1)+prices(i))
        // dp(i,1) = max(dp(i-1,0)-prices(i), dp(i-1,1))
        int n = prices.length;
        if (n <= 1) return 0;
        int[] dp0 = new int[n];
        int[] dp1 = new int[n];
        dp0[0] = 0;
        dp1[0] = 0 - prices[0];
        int i = 1;
        while (i <= n-1) {
            dp0[i] = Math.max(dp0[i-1], dp1[i-1] + prices[i]);
            dp1[i] = Math.max(dp0[i-1] - prices[i], dp1[i-1]);
            ++i;
        }
        return dp0[n-1];
    }
    
}