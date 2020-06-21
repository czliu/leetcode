// 1460. 通过翻转子数组使两个数组相等
// #easy
// -

package _1460;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : target) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        for (int k : arr) {
            if (map.getOrDefault(k, 0) != 0) map.put(k, map.get(k) - 1);
            else return false;
        }
        return true;
    }
}