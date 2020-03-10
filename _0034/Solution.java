// 0034. Find First and Last Position of Element in Sorted Array
// binary search


package _0034;

// import java.util.*;

class Solution {

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int start = -1;
        int end = -1;
        while (left <= right){
            int mid = left + (right-left)/2;
            if (nums[mid] == target && mid == 0) {
                start = 0;
                break;
            }
            else if (nums[mid] == target && nums[mid-1] < target) {
                start = mid;
                break;
            }
            else if (nums[mid] < target) left = mid+1;
            else if (nums[mid] > target) right = mid-1;
            else { // nums[mid] == target && nums[mid-1] == target
                right = mid-1;
            }
        }
        left = 0;
        right = nums.length-1;
        while (left <= right){
            int mid = left + (right-left)/2;
            if (nums[mid] == target && mid == nums.length-1) {
                end = mid;
                break;
            }
            else if (nums[mid] == target && nums[mid+1] > target) {
                end = mid;
                break;
            }
            else if (nums[mid] < target) left = mid+1;
            else if (nums[mid] > target) right = mid-1;
            else { // nums[mid] == target && nums[mid+1] == target
                left = mid+1;
            }
        }
        int[] range = new int[] {start, end};
        return range;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {5,7,7,8,8,10};
        int[] range = s.searchRange(nums, 6);
        for (int i:range) System.out.println(i);
    }
}
