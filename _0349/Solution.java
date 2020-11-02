// 349. 两个数组的交集
// #easy
// -


package _0349;

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i:nums1) set.add(i);
        Set<Integer> intsec = new HashSet<>();
        for (int i:nums2) {
            if (set.contains(i)) intsec.add(i);
        }
        int[] ans = new int[intsec.size()];
        int i = 0;
        for (int k:intsec) ans[i++] = k;
        return ans;
    }
}