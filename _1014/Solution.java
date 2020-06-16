// 1014. 最佳观光组合
// #medium
// -

package _1014;

class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int dp = A[0] + A[1] + 0 - 1;
        int maxLeft = (A[0]-1 > A[1])? 0: 1;
        for (int i=2;i<A.length;++i) {
            dp = Math.max(A[maxLeft]+A[i]+maxLeft-i, dp);
            maxLeft = (A[maxLeft]+maxLeft-i > A[i])? maxLeft : i;
        }
        return dp;
    }
}