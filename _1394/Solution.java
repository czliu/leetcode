// 1394. 找出数组中的幸运数
// #easy
// -

package _1394;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : arr) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        int ans = -1;
        for (int k : map.keySet()) {
            if (k == map.get(k)) ans = Math.max(k, ans);
        }
        return ans;
    }
}
