// 0031. Next Permutation
// 

package _0031;

import java.util.*;

class Solution {

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) return;
        boolean finished = false;
        for (int i = n - 2; i >= 0; i--) {
            if (finished) break;
            if (nums[i] >= nums[i + 1]) continue;
            else { // nums[i] < nums[i + 1]
                for (int j=i+1;j<=n-1;j++) {
                    if (finished) break;
                    if (j<=n-2 && nums[i]<nums[j] && nums[i]>=nums[j+1]) {
                        swap(nums, i, j);
                        // Arrays.sort(Arrays.copyOfRange(nums, i+1, n-1));
                        // the above will create a new subarray, not sort the original array
                        reverse(nums, i+1);
                        finished = true;
                    }
                }
                if (!finished) {  // for example, 1,5,4,3,2
                    swap(nums, i, n-1);
                    reverse(nums, i+1);
                    finished = true;                    
                }
            }
        }
        if (!finished) Arrays.sort(nums);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,3,2};
        s.nextPermutation(nums);
        for (int i:nums) System.out.println(i);
        int[] nums2 = {2,3,1};
        s.nextPermutation(nums2);
        for (int i:nums2) System.out.println(i);
    }
}
