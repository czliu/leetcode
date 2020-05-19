// 0506. relative ranks
// #easy
// -

package _0506;

import java.util.*;

public class Solution {

    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length;
        String[] ans = new String[n];
        if (n == 0) return ans;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;++i) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        for (int i=n-1;i>=0;--i){
            if (i == n-1) ans[map.get(nums[i])] = "Gold Medal";
            else if (i == n-2) ans[map.get(nums[i])] = "Silver Medal";
            else if (i == n-3) ans[map.get(nums[i])] = "Bronze Medal";
            else ans[map.get(nums[i])] = String.valueOf(n-i);
        }
        return ans;
    }
    
}