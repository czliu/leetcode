// 941. 有效的山脉数组
// #easy
// -

package _0941;

class Solution {
    public boolean validMountainArray(int[] A) {
        int n = A.length;
        if (n < 3) return false;
        int i = 0;
        boolean up = false, down = false;
        while (i < n - 1) {
            if (A[i+1] == A[i]) return false;
            else if (A[i+1] < A[i]) break;
            else {
                ++i;
                up = true;
            }
        }
        while (i < n - 1) {
            if (A[i+1] >= A[i]) return false;
            else {
                ++i;
                down = true;
            }
        }
        return (up && down);
    }
}