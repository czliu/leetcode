package _0121;

public class Solution2 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for (int i=0;i<prices.length;++i) {
            if (prices[i] < min) min = prices[i];
            else if (prices[i] - min > ans) ans = prices[i] - min;
        }
        return ans;
    }
}
