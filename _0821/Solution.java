// 821. 字符的最短距离
// #easy
// -

package _0821;

class Solution {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int pre = -1;
        int[] ans = new int[n];
        for (int i=0;i<n;++i) {
            if (S.charAt(i) == C && pre == -1) {
                for (int j=0;j<=i;++j) ans[j] = i-j;
                pre = i;
            }
            else if (S.charAt(i) == C) {
                for (int j=pre;j<=i;++j) ans[j] = Math.min(j-pre, i-j);
                pre = i;
            }
            else if (i == n - 1) {
                for (int j=pre;j<=i;++j) ans[j] = j-pre;
            }
        }
        return ans;
    }
}