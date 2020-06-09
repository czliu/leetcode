// 977. 有序数组的平方
// #easy
// -

package _0977;

class Solution {
    public int[] sortedSquares(int[] A) {
        int left = 0, right = A.length - 1;
        int[] ans = new int[A.length];
        int index = right;
        while (index >= 0) {
            if (A[left] >= 0) {
                while (left <= right) ans[index--] = A[right] * A[right--];
            } else if (A[right] <= 0) {
                while (left <= right) ans[index--] = A[left] * A[left++];
            } else {
                int r = A[right] * A[right], l = A[left] * A[left];
                if (r > l) {
                    ans[index--] = r;
                    right--;
                } else {
                    ans[index--] = l;
                    left++;
                }
            }
        }
        return ans;
    }
}
