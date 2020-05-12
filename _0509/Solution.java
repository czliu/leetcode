// 0509. Fibonacci number
// #easy
// -

package _0509;

public class Solution {

    public int fib(int N){
        int f0 = 0;
        int f1 = 1;
        if (N == 0) return f0;
        if (N == 1) return f1;
        int ans = 0;
        int i = 2;
        while (i <= N) {
            ans = f0 + f1;
            f0 = f1;
            f1 = ans;
            ++i;
        }
        return ans;
    }
    
}