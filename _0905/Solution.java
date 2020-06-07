// 905. 按奇偶排序数组
// #easy
// -

package _0905;

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0, right = A.length - 1;
        while (left < right) {
            while (left < right && A[left] % 2 == 0) ++left;
            while (left < right && A[right] % 2 == 1) --right;
            if (A[left] % 2 == 1 && A[right] % 2 == 0) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
                ++left;
                --right;
            }
        }
        return A;
    }
}