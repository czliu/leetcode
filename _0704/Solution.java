// 0704.二分查找
// #easy
// -

package _0704;

public class Solution {

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) return -1;
        if (target < nums[0] || target > nums[n-1]) return -1;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (target > nums[mid]) left = mid + 1;
            else if (target < nums[mid]) right = mid - 1;
            else return mid;
        }
        return -1;
    }
    
}