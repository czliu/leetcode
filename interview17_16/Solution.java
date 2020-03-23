// interview17_16. 按摩师
// DP 动态规划

package interview17_16;

// import java.util.*;

class Solution {

    public int massage(int[] nums) {
        if (nums.length == 0) return 0;
        int dp0 = 0;
        int dp1 = nums[0];
        for (int i=1;i<nums.length;++i) {
            int tdp0 = Math.max(dp0, dp1); // 计算 dp[i][0]
            int tdp1 = dp0 + nums[i]; // 计算 dp[i][1]

            dp0 = tdp0; // 用 dp[i][0] 更新 dp_0
            dp1 = tdp1; // 用 dp[i][1] 更新 dp_1
        }
        return Math.max(dp0, dp1);
    }

    public static void main(String[] args) {
    }
}
