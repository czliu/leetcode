// 0050. Pow(x,n)
// #medium
// *

package _0050;

public class Solution {

/*  基本暴力算法，超出时间限制   
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        double ans = 1;
        while (n > 0) {
            ans *= x;
            --n;
            if (n == 0) return ans;
        }
        while (n < 0) {
            ans /= x;
            ++n;
            if (n == 0) return ans;
        }
        return ans;
    } 
*/
    
    public double quickMul(double x, long N) {
        double ans = 1.0;
        // 贡献的初始值为 x
        double x_contribute = x;
        // 在对 N 进行二进制拆分的同时计算答案
        while (N > 0) {
            if (N % 2 == 1) {
                // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
                ans *= x_contribute;
            }
            // 将贡献不断地平方
            x_contribute *= x_contribute;
            // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
            N /= 2;
        }
        return ans;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

}