// 1496. 判断路径是否相交
// #easy
// -

package _1496;

import java.util.HashSet;
import java.util.Set;

// 这里计算hash有两种，一种是把int[]转成String，另一种是转成int x = cur[0] * 20001 + cur[1];
class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int[] cur = new int[] {0, 0};
        set.add(helper(cur));
        for (int i=0;i<path.length();++i) {
            if (path.charAt(i) == 'N') ++cur[1];
            else if (path.charAt(i) == 'S') --cur[1];
            else if (path.charAt(i) == 'E') ++cur[0];
            else --cur[0];
            String s = helper(cur);
            if (set.contains(s)) return true;
            set.add(s);
        }
        return false;
    }

    private String helper(int[] a) {
        return "" + a[0] + "," + a[1];
    }
}
