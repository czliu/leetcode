// 0461. hamming distance
// #easy
// *

package _0461;

public class Solution {

    public int hammingDistance(int x, int y) {
        int ans = 0;
        int xor = x ^ y;
        while (xor > 0) {
            if (xor % 2 == 1) ++ans;
            xor = xor >> 1;
        }
        return ans;
    }
    
}