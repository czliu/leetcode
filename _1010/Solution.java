// 1010. 总持续时间可被 60 整除的歌曲
// #easy
// -

package _1010;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : time) {
            int t = val % 60;
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        int ans = 0;
        for (int t : map.keySet()) {
            if (t == 0 || t == 30) {
                int k = map.get(t);
                ans += (k * (k-1) / 2);
            } else if (t < 30 && map.containsKey(60-t)) {
                ans += (map.get(t) * map.get(60-t));
            }
        }
        return ans;
    }
}
