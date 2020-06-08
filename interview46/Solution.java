// 面试题46. 把数字翻译成字符串
// #medium
// -

package interview46;

class Solution {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        int[] dp = new int[n];
        dp[0] = 1;
        if (n == 1) return dp[n-1];
        if (Integer.valueOf(s.substring(0,2)) <= 25) dp[1] = 2;
        else dp[1] = 1;
        if (n == 2) return dp[n-1];
        for (int i=2;i<n;++i) {
            int tmp = Integer.valueOf(s.substring(i-1, i+1));
            if (tmp >= 10 && tmp <= 25) dp[i] = dp[i-1] + dp[i-2];
            else dp[i] = dp[i-1];
        }
        return dp[n-1];
    }
}
