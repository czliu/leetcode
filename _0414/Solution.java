// 0414. third maximum number
// #easy
// *

package _0414;

import java.util.*;

public class Solution {

    // Time O(n * log3) = O(n)
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) throw new RuntimeException("error");

        TreeSet<Integer> set = new TreeSet<>();
        for (Integer elem : nums) {
            set.add(elem);
            if (set.size() > 3) set.remove(set.first());
        }
        
        return set.size() < 3 ? set.last() : set.first();   // set.last(): set里面最大的元素
    }
}