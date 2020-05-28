// 771. 宝石与石头
// #easy
// -

package _0771;

import java.util.*;

class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        int nJ = J.length(), nS = S.length();
        if (nJ == 0 || nS == 0) return 0;
        for (int i=0;i<nJ;++i) {
            set.add(J.charAt(i));
        }
        int ans = 0;
        for (int i=0;i<nS;++i) {
            if (set.contains(S.charAt(i))) ++ans;
        }
        return ans;
    }
}