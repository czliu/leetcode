// 0575. Distribute candies
// #easy
// -

package _0575;

import java.util.*;

public class Solution {

    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        int n = candies.length;
        for (int i=0;i<n;++i) {
            set.add(candies[i]);
        }
        int kinds = set.size();
        if (kinds >= n / 2) return n / 2;
        else return kinds;
    }
    
}