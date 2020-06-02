// 832. 翻转图像
// #easy
// -

package _0832;

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0;i<A.length;++i) {
            int left = 0, right = A[0].length - 1;
            while (left <= right) {
                int tmp = A[i][left];
                A[i][left] = 1 - A[i][right];
                A[i][right] = 1 - tmp;
                ++left;
                --right;
            }
        }
        return A;
    }
}