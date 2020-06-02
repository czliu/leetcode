// 830. 较大分组的位置
// #easy
// -

package _0830;

import java.util.*;

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        char[] C = S.toCharArray();
        List<List<Integer>> ans = new LinkedList<>();
        if (C.length <= 1) return ans;
        int start = 0;
        for (int i = 1; i < C.length; ++i) {
            if (C[i] == C[start] && i < C.length - 1) continue;
            else if (C[i] != C[start]) {
                if (i - start >= 3) {
                    List<Integer> cur = new ArrayList<>();
                    cur.add(start);
                    cur.add(i - 1);
                    ans.add(cur);
                }
                start = i;
            } else if (i == C.length - 1 && C[i] == C[start] && i - start >= 2) {
                List<Integer> cur = new ArrayList<>();
                cur.add(start);
                cur.add(i);
                ans.add(cur);
            }
        }
        return ans;
    }
}