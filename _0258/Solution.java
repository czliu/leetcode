// 0258. add digits
// #easy
// *

package _0258;

public class Solution {

    // public int addDigits(int num) {
    //     int ans = 0;
    //     while (num > 0) {
    //         ans += (num % 10);
    //         num = num / 10;
    //     }
    //     if (ans <= 9) return ans;
    //     else return addDigits(ans);
    // }

    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
    
}