// 1304. 和为零的N个唯一整数
// #easy
// -

package _1304;

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int i = 0, count = 1;
        while (i+1 < n) {
            ans[i++] = count;
            ans[i++] = 0 - count;
            ++count;
        }
        return ans;
    }
}
