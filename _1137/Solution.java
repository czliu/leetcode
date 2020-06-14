// 1137. 第 N 个泰波那契数
// #easy
// -

package _1137;

class Solution {
    public int tribonacci(int n) {
        int[] val = new int[38];
        val[0] = 0;
        val[1] = 1;
        val[2] = 1;
        if (n <= 2) return val[n];
        int i = 3;
        while (i <= n) {
            val[i] = val[i-1] + val[i-2] + val[i-3];
            ++i;
        }
        return val[n];
    }
}