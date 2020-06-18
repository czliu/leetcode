// 1346. 检查整数及其两倍数是否存在
// #easy
// -

package _1346;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int k : arr) {
            if (set.contains(k * 2)) return true;
            else if (k != 0 && k % 2 == 0 && set.contains(k / 2)) return true;
            set.add(k);
        }
        return false;
    }
}