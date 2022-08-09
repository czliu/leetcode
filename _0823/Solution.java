package _0823;

import java.util.*;

public class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        double[] dp = new double[len];
        int max = 1_000_000_007;
        Map<Integer, Integer> m = new HashMap<>();
        int ans = 0;
        for (int i=0;i<len;++i) {
            dp[i] = 1;
            for (int j=0;j<i;++j) {
                if (arr[i] % arr[j] == 0 && m.containsKey(arr[i]/arr[j])) {
                    dp[i] += (dp[j] * dp[m.get(arr[i]/arr[j])]);
                }
            }
            dp[i] = dp[i] % max;
            ans += dp[i];
            ans = ans % max;
            m.put(arr[i], i);
        }
        return ans;
    }
}
