// 961. 重复 N 次的元素
// #easy
// -

package _0961;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            if (set.contains(i)) return i;
            else set.add(i);
        }
        return 0;
    }
}