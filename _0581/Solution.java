// 0581. Shortest Unsorted Continuous Subarray
// #easy
// -

package _0581;

import java.util.*;

public class Solution {

    public int findUnsortedSubarray(int[] nums) {
        //int[] sorted = nums;   // this is wrong
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int i = 0, j = nums.length - 1;
        while (i <= j && nums[i] == sorted[i]) ++i;
        while (i <= j && nums[j] == sorted[j]) --j;
        return j - i + 1; 
    }
    
}