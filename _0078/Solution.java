// 0078. subsets

// #medium #linkedlist #review

package _0078;

import java.util.*;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> cur = new LinkedList<>();
        ans.add(cur);
        if (nums.length == 0) return ans;
        for (int num : nums) {
            List<List<Integer>> newList = new LinkedList<>();
            for (List<Integer> a : ans) {
                List<Integer> b = new LinkedList<>(a);
                b.add(num);
                newList.add(b);
            }
            for (List<Integer> a : newList) {
                ans.add(a);
            }
        }
        return ans;
    }
}