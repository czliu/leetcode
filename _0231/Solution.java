// 0231. Power of two
// *
// #easy #bit 

package _0231;

public class Solution {

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        long x = (long)n;
        return (x & (-x)) == x;
    }

}