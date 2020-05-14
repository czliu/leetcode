// 0198. house robber
// #easy #dp
// -

package _0198;

public class Solution {

    public int rob(int[] nums) {
        // dp(i, 1) = max(dp(i-1,1), dp(i-1,0)+nums(i))
        // dp(i, 0) = max(dp(i-1,1), dp(i-1,0))
        int n = nums.length;
        if (n == 0) return 0;
        int[] dp1 = new int[n];
        int[] dp0 = new int[n];
        dp1[0] = nums[0];
        dp0[0] = 0;
        if (n == 1) return dp1[0];
        for (int i=1;i<n;++i){
            dp1[i] = Math.max(dp1[i-1], dp0[i-1] + nums[i]);
            dp0[i] = Math.max(dp1[i-1], dp0[i-1]);
        }
        return Math.max(dp1[n-1], dp0[n-1]);
    }
    
}