// 1018. 可被 5 整除的二进制前缀
// #easy
// -

package _1018;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new LinkedList<>();
        int pre = 0;
        for (int i : A) {
            int cur = (pre * 2 + i) % 5;
            ans.add(cur % 5 == 0);
            pre = cur;
        }
        return ans;
    }
}
