// 60. 第k个排列
// #medium
// -

package _0060;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        int m = 1;
        for (int i=1;i<=n-1;++i) m *= i;
        int[] count = new int[n-1];
        --k;
        for (int i=n-1;i>=1;--i) {
            count[n-1-i] = k / m;
            k = k % m;
            m /= i;
        }
        int[] ans = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;++i) list.add(i);
        for (int i=0;i<n-1;++i) {
            ans[i] = list.get(count[i]);
            list.remove(count[i]);
        }
        ans[n-1] = list.get(0);
        String s = "";
        for (int i=0;i<n;++i) {
            s = s + ans[i];
        }
        return s;
    }
}