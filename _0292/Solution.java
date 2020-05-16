// 0292. Nim game
// #easy
// -

package _0292;

public class Solution {

    public boolean canWinNim(int n) {
        return (n % 4) != 0;
    }

    // this consume too much time, or stack overflow
    // public boolean canWinNim(int n) {
    //     if (n <= 3) return true;
    //     return !canWinNim(n-1) || !canWinNim(n-2) || !canWinNim(n-3);
    // }
    
}