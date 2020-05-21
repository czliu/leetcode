// 0581. Shortest Unsorted Continuous Subarray
// #easy
// *

package _0581;

//import java.util.*;

// Time O(nlogn), space O(n)
// public class Solution {

//     public int findUnsortedSubarray(int[] nums) {
//         //int[] sorted = nums;   // this is wrong
//         int[] sorted = Arrays.copyOf(nums, nums.length);
//         Arrays.sort(sorted);
//         int i = 0, j = nums.length - 1;
//         while (i <= j && nums[i] == sorted[i]) ++i;
//         while (i <= j && nums[j] == sorted[j]) --j;
//         return j - i + 1; 
//     }
    
// }

// Time O(n), Space O(1)
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                flag = true;
            if (flag)
                min = Math.min(min, nums[i]);
        }
        flag = false;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1])
                flag = true;
            if (flag)
                max = Math.max(max, nums[i]);
        }
        int l, r;
        for (l = 0; l < nums.length; l++) {
            if (min < nums[l])
                break;
        }
        for (r = nums.length - 1; r >= 0; r--) {
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;
    }
}
