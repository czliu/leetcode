// 942. 增减字符串匹配
// #easy
// -

package _0942;

class Solution {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int max = 0, min = 0;
        int[] ans = new int[n+1];
        for (int i=1;i<=n;++i) {
            if (S.charAt(i-1) == 'I') ans[i] = (max++) + 1;
            else ans[i] = (min--) - 1;
        }
        for (int i=0;i<=n;++i) {
            ans[i] -= min;
        }
        return ans;
    }
}

class Solution2 {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }
        ans[N] = lo;
        return ans;
    }
}