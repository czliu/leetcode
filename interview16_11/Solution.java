// 面试题 16.11. 跳水板
// #easy
// -

package interview16_11;

class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return new int[0];
        if (shorter == longer) {
            return new int[] {shorter * k};
        }
        else {
            int[] ans = new int[k+1];
            for (int i=0;i<k+1;++i) {
                ans[i] = shorter * k + i * (longer - shorter);
            }
            return ans;
        }
    }
}