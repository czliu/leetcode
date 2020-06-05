// 128. 最长连续序列
// #hard
// *

package _0128;

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int ans = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int curLen = 1;
                while (set.contains(cur + 1)) {
                    ++cur;
                    ++curLen;
                }
                ans = Math.max(ans, curLen);
            }
        }
        return ans;
    }
}