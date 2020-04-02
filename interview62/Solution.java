// interview62. 圆圈中最后剩下的数字
// 递归

package interview62;

class Solution {
    public int lastRemaining(int n, int m) {
        if (n == 1) return 0;
        else return (m%n + lastRemaining(n-1, m)) % n;
    }
}