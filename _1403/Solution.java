// 1403. 非递增顺序的最小子序列
// #easy
// -

package _1403;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int k : nums) sum += k;
        Arrays.sort(nums);
        int cur = 0;
        List<Integer> list = new LinkedList<>();
        for (int i=n-1;i>=0;--i) {
            list.add(nums[i]);
            cur += nums[i];
            if (cur > sum - cur) break;
        }
        return list;
    }
}
