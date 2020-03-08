// 0121. Best Time to Buy and Sell Stock
// DP table 动态规划

package _0121;

// import java.util.*;

class Solution {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = 0 - prices[0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(0 - prices[i], dp[i-1][1]);
        }
        return dp[n-1][0];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices1 = {7,1,5,3,6,4};
        int output1 = s.maxProfit(prices1);
        System.out.println(output1);
        int[] prices2 = {7,6,4,3,1};
        int output2 = s.maxProfit(prices2);
        System.out.println(output2);

    }
}
