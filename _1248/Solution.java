// 1248. Count number of nice subarrays

package _1248;

import java.util.*;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || nums == null) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int interval = 0;
        int j = 0;
        for (int i=0;i<n;++i){
            if (nums[i] % 2 == 1) {
                map.put(j, interval);
                ++j;
                interval = 0;
            }
            else ++interval;
        }
        int lastEven = interval; // number of even numbers after the last odd number
        int m = map.size();
        if (m < k) return 0;
        int ans = 0;
        for (int i=0;i<=m-k;++i){
            int cur = 1;
            cur *= (map.get(i)+1);
            if (i+k == m) cur *= (lastEven+1);
            else cur *= (map.get(i+k)+1);
            ans += cur;
        }
        return ans;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        int ans = s.numberOfSubarrays(new int[] {1,1,2,1,1}, 3);
        System.out.println(ans);
    }
}