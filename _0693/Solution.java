// 693. 交替位二进制数
// #easy
// -

package _0693;

public class Solution {

    public boolean hasAlternatingBits(int n) {
        int pre = -1;
        while (n != 0) {
            int cur = n & 1;
            n = n >> 1;
            if (pre == -1) pre = cur;
            else if (pre == cur) return false;
            else pre = cur;
        }
        return true;
    }
    
}