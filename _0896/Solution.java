// 896. 单调数列
// #easy
// -

package _0896;

class Solution {
    public boolean isMonotonic(int[] A) {
        int pre = A[0];
        int i = 0;
        int type = 0; // type = 1: increase; type = 2: decrease
        while (i < A.length) {
            if (type == 0) {
                if (A[i] > pre) type = 1;
                else if (A[i] < pre) type = 2; 
            } else if (type == 1 && A[i] < pre) return false;
            else if (type == 2 && A[i] > pre) return false;
            pre = A[i];
            ++i; 
        }
        return true;
    }
}