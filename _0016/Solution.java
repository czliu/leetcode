// 0016. 3Sum Closest
// 双指针

package _0016;

import java.util.*;

class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length < 3) return -1;
        int ans = nums[0]+nums[1]+nums[2];
        int minDiff = Math.abs(ans - target);   
        for (int i=0;i<nums.length-2;i++) {
            int left = i+1;
            int right = nums.length-1;         
            while (left < right) {
                int sum = nums[i]+nums[left]+nums[right];
                int newDiff = Math.abs(sum - target);
                if (newDiff < minDiff) {
                    minDiff = newDiff;
                    ans = sum;
                }
                if (sum == target) return sum;
                else if (sum > target) {
                    right--;
                }
                else left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    }
}
