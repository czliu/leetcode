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


//这个算法背后的思想是无序子数组中最小元素的正确位置可以决定左边界，最大元素的正确位置可以决定右边界。
//因此，首先我们需要找到原数组在哪个位置开始不是升序的。我们从头开始遍历数组，一旦遇到降序的元素，我们记录最小元素为 min 。
//类似的，我们逆序扫描数组 nums，当数组出现升序的时候，我们记录最大元素为 max。
//然后，我们再次遍历 nums 数组并通过与其他元素进行比较，来找到 min 和 max 在原数组中的正确位置。我们只需要从头开始找到第一个大于 min 的元素，从尾开始找到第一个小于 max 的元素，它们之间就是最短无序子数组。
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
