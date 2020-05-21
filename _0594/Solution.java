// 0594. Longest Harmonious Subsequence
// #easy
// -

package _0594;

import java.util.*;

public class Solution {

    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        if (n == 0) return 0;
        for (int i=0;i<n;++i) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0;
        for (int i : map.keySet()) {
            if (map.containsKey(i+1)) ans = Math.max(ans, map.get(i) + map.get(i+1));
        }
        return ans;

    }
    
}