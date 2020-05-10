// 0326. Power of three
// #easy
// -

package _0326;

public class Solution {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n > 1) {
            if (n % 3 != 0) return false;
            n /= 3;
        }
        return true;
    }
    
}