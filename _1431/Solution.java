// 1431. 拥有最多糖果的孩子
// #easy
// -

package _1431;

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxCandies = 0;
        for (int i = 0; i < n; ++i) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        List<Boolean> ans = new ArrayList<Boolean>();
        for (int i = 0; i < n; ++i) {
            ans.add(candies[i] + extraCandies >= maxCandies);
        }
        return ans;
    }
}
