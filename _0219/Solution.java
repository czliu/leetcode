// 0219. contains duplicate II
// #easy #hashset
// -

package _0219;

import java.util.*;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return false;
        Set<Integer> set = new HashSet<>();
        if (n <= k + 1) {
            for (int i=0;i<n;++i){
                if (set.contains(nums[i])) return true;
                else set.add(nums[i]);
            }
            return false;
        }
        else { // n > k + 1
            for (int i=0;i<=k;++i){
                if (set.contains(nums[i])) return true;
                else set.add(nums[i]);
            }
            for (int i=k+1;i<n;++i){
                set.remove(nums[i-k-1]);
                if (set.contains(nums[i])) return true;
                else set.add(nums[i]);
            }
            return false;
        }
    }

}