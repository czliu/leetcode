// 0136. Single Number
// Hashmap

package _0136;

import java.util.*;

class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(nums[i])) map.remove(nums[i]);
            else map.put(nums[i], i);
        }
        return map.keySet().iterator().next();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4,1,2,1,2};
        int result1 = s.singleNumber(nums);
        System.out.println(result1);
    }
}
