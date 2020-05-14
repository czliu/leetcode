// 0172. Factorial trailing zeroes
// #easy
// *

package _0172;

public class Solution {

    // time O(logn), space O(1)
    public int trailingZeroes(int n) {
        int ans = 0;
        long cur = 5;
        while (n >= cur) {
            ans += (n / cur);
            cur *= 5;
        }
        return ans;
    }
    
}