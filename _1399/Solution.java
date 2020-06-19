// 1399. 统计最大组的数目
// #easy
// -

package _1399;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=1;i<=n;++i) {
            int k = sum(i);
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        int count = 0, max = 0;
        for (int i : map.values()) {
            if (i > max) {
                count = 1;
                max = i;
            } else if (i == max) ++count;
        }
        return count;
    }

    private int sum(int k) {
        int ans = 0;
        while (k > 0) {
            ans += k % 10;
            k = k / 10;
        }
        return ans;
    }
}
