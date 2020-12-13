// 0217. 存在重复元素
// Hashset
// #easy

package _0217;

import java.util.HashSet;
import java.util.Set;

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
}