// 0633. 平方数之和
// #easy
// -

package _0633;

public class Solution {

    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int)Math.sqrt(c - a * a);
        while (a <= b) {
            if (a * a + b * b == c) return true;
            ++a;
            b = (int)Math.sqrt(c - a * a);
        }
        return false;
    }
    
}