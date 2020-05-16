// 0342. power of four
// #easy #bit
// *

package _0342;

class Solution {
    public boolean isPowerOfFour(int num) {
        // x 是否为 2 的幂：x > 0 and x & (x - 1) == 0
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0xaaaaaaaa) == 0);
    }
}
