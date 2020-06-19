// 1365. 有多少小于当前数字的数字
// #easy
// -

package _1365;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sorted = Arrays.copyOf(nums, n);
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;++i) {
            if (!map.containsKey(sorted[i])) map.put(sorted[i], i);
        }
        for (int i=0;i<n;++i) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
