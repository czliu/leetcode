package _0350;

import java.util.*;

public class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        for (int i=0;i<nums1.length;++i) {
            m.put(nums1[i], m.containsKey(nums1[i])?m.get(nums1[i])+1:1);
        } 
        for (int i=0;i<nums2.length;++i) {
            if (m.containsKey(nums2[i])) {
                intersection.add(nums2[i]);
                if (m.get(nums2[i]) > 1) m.put(nums2[i], m.get(nums2[i])-1);
                else m.remove(nums2[i]);
            }
        }
        int[] ans = new int[intersection.size()];
        for (int i=0;i<intersection.size();++i) {
            ans[i] = intersection.get(i);
        }
        return ans;
    }
}
