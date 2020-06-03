// 852. 山脉数组的峰顶索引
// #easy
// -

package _0852;

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int n = A.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (mid == 0 || mid == n-1) break;
            if (A[mid] > A[mid-1] && A[mid] > A[mid+1]) return mid;
            else if (A[mid] < A[mid-1]) right = mid;
            else left = mid; 
        }
        return left;
    }
}