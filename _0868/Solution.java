// 868. 二进制间距
// #easy
// -

package _0868;

class Solution {
    public int binaryGap(int N) {
        int ans = 0, cur = 0;
        while (N != 0) {
            int bit = N & 1;
            if (cur == 0 && bit == 1) cur = 1;
            else if (cur > 0 && bit == 0) ++cur;
            else if (cur > 0 && bit == 1) {
                ans = Math.max(ans, cur);
                cur = 1;
            }
            N = N >> 1;
        }
        return ans;
    }
}