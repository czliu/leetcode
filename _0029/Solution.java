// 0029. divide two integers
// *
// #medium #bit

package _0029;

public class Solution {

    public int divide(int dividend, int divisor) {
        int sign;
        if ((dividend >= 0 && divisor >0) || (dividend <= 0 && divisor < 0)) sign = 0;
        else sign = 1;
        long a = Math.abs((long)dividend), b = Math.abs((long)divisor);
        long abs_divisor = b;
        long ans = 0, partial_sum = 1;
        if (a < b) return 0;
        while ((b << 1) < a) {
            b = b << 1;
            partial_sum = partial_sum << 1;
        }
        while (a >= abs_divisor) {
            a -= b;
            ans += partial_sum;
            while (b > a) {
                b = b >> 1;
                partial_sum = partial_sum >> 1;
            }
        }
        if (sign == 1) ans = -ans;
        if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int dividend = Integer.MIN_VALUE, divisor = -1;
        int ans = s.divide(dividend, divisor);
        System.out.println(ans);
    }
    
}