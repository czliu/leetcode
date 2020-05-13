// 0371. sum of two integers
// #easy #bit
// *

package _0371;

public class Solution {

    public int getSum(int a, int b) {
        if (a==0) return b;
        if (b==0) return a;
        int cur;
        int carry;
        while (true) {
            cur = a^b;    // 计算低位
            carry = a&b;  // 计算进位
            if (carry==0) break;
            a = cur;
            b = carry << 1;
        }
        return cur;
    }
}