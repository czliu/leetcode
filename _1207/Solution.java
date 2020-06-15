// 1207. 独一无二的出现次数
// #easy
// -

package _1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : arr) map.put(k, map.getOrDefault(k, 0) + 1);
        Set<Integer> set = new HashSet<>();
        for (int k : map.values()) {
            if (set.contains(k)) return false;
            set.add(k);
        }
        return true;
    }
}