// 1446. 连续字符
// #easy
// -

package _1446;

class Solution {
    public int maxPower(String s) {
        int n= s.length();
        if (n == 0) return 0;
        int ans = 1, cur = 1;
        for (int i=1;i<n;++i) {
            if (s.charAt(i) == s.charAt(i-1)) {
                ++cur;
            }
            else {
                ans = Math.max(ans, cur);
                cur = 1;
            }
            if (i == n-1) {
                ans = Math.max(ans, cur);
            }
        }
        return ans;
    }
}
