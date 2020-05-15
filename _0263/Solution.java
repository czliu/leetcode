// 0263. ugly number
// #easy
// -

package _0263;

public class Solution {
    
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        if (num == 1) return true;
        num = helper(num, 2);
        num = helper(num, 3);
        num = helper(num, 5);
        return (num == 1)? true: false;
    }

    private int helper(int n, int k) {
        while (n % k == 0) {
            n = n / k;
        }
        return n;
    }

}