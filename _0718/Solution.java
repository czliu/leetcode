// 718. 最长重复子数组
// #medium
// *

package _0718;

// 超出时间限制
class Solution {
    public int findLength(int[] A, int[] B) {
        int lenA = A.length;
        int lenB = B.length;
        int ans = 0;
        for (int i=0;i<lenA;++i) {
            for (int j=0;j<lenB;++j) {
                if (A[i] == B[j]) {
                    int delta = 1, cur = 1;
                    while (i+delta < lenA && j+delta < lenB && A[i+delta] == A[j+delta]) {
                        ++cur;
                        ++delta;
                    }
                    ans = Math.max(ans, cur);
                }
            }
        }
        return ans;
    }
}

class Solution2 {
    public int findLength(int[] A, int[] B) {
        int max = 0;
        int[] dp = new int[B.length + 1];
        for (int i = 1; i <= A.length; i++) {
            for (int j = B.length; j >= 1; j--) {
                if (A[i - 1] == B[j - 1])
                    dp[j] = dp[j - 1] + 1;
                else
                    dp[j] = 0;
                max = Math.max(max, dp[j]);
            }
        }
        return max;
    }
}