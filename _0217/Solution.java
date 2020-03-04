// 0217. Contains Duplicate
// Hashmap

package _0217;

import java.util.*;

class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if (nums == null || nums.length == 0) return false;
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])) return true;
            else map.put(nums[i], 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean output = s.containsDuplicate(nums);
        System.out.println(output);
        
    }
}
