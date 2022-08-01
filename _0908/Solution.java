// 908. 最小差值 I
// #easy
// -

package _0908;

class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = A[0], max = A[0];
        int i = 0;
        while (i < A.length) {
            if (A[i] < min) min = A[i];
            else if (A[i] > max) max = A[i];
            ++i;
        }
        int ans = (max - K) - (min + K);
        return Math.max(ans, 0);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.smallestRangeI(new int[] {0,10}, 2);
        System.out.println(ans);
    }
}