// 0001. Two Sum
// Hashmap

package _0001;

import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,7,11,15};
        int[] result1 = s.twoSum(nums, 9);
        System.out.println(result1);
        for (int i : result1) System.out.println(i);
    }
}
