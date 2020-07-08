// 89. 格雷编码
// #medium
// *

package _0089;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        if (n == 0) return list;
        int preCount = 1;
        for (int i=1;i<=n;++i) {
            for (int j=preCount-1;j>=0;--j) {
                list.add(list.get(j) + preCount);
            }
            preCount *= 2;
        }
        return list;
    }
}
