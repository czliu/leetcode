// 1128. 等价多米诺骨牌对的数量
// #easy
// -

package _1128;

import java.util.*;

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int[] k : dominoes) {
            List<Integer> list = new ArrayList<>();
            list.add(Math.min(k[0], k[1]));
            list.add(Math.max(k[0], k[1]));
            map.put(list, map.getOrDefault(list, 0) + 1);
        }
        int ans = 0;
        for (int val : map.values()) {
            if (val >= 2) ans += (val * (val-1) / 2);
        }
        return ans;
    }
}
