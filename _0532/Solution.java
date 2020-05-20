// 0532. K-diff pairs in an array
// #easy
// *

package _0532;

import java.util.*;

public class Solution {

    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return 0;
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;++i) {
            int j = i + 1;
            while (j < n) {
                if (nums[j] - nums[i] == k) map.put(nums[i], nums[j]);
                else if (nums[j] - nums[i] > k) break;
                ++j;
            }
        }
        return map.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.findPairs(new int[] {3,1,4,1,5}, 2);
        System.out.println(ans);
    }
    
}