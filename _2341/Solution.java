package _2341;

import java.util.*;

public class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int count = 0;
        for (int i=0;i<nums.length;++i) {
            if (s.contains(nums[i])) {
                s.remove(nums[i]);
                count++;
            }
            else s.add(nums[i]);
        }
        int[] ans = new int[]{count, s.size()};
        return ans;
    }
}
