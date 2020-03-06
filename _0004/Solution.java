// 0004. Median of Two Sorted Arrays
// 二分法

package _0004;

// import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1 > n2) return findMedianSortedArrays(nums2, nums1);
        // so now we have n1 <= n2
        // nums1: 0~i-1 | i~n1-1
        // nums2: 0~j-1 | j~n2-1
        // condition: nums1[i-1] <= nums2[j]; nums2[j-1] <= nums1[i]
        // special case: i == 0; j == 0; i == n1; j == n2
        if (n1 == 0 && n2 == 0) return 0.0;
        else if (n1 == 0) {
            if (n2 % 2 == 0) return (nums2[n2/2-1] + nums2[n2/2]) / 2.0;
            else return nums2[n2/2];
        }
        int left=0, right=n1-1; // left and right index of nums1
        int k=(n1+n2+1)/2; // total number of items on the left
        while (left <= right) {
            int i = left + (right - left)/2 + 1;
            int j = k - i;
            if (i < right && nums1[i] < nums2[j-1]) left = i + 1;
            else if ( i > left && nums1[i-1] > nums2[j]) right = i - 1;
            else {
                int maxLeft = 0;
                if (i == 0) maxLeft = nums2[j-1];
                else if (j == 0) maxLeft = nums1[i-1];
                else maxLeft = Math.max(nums1[i-1], nums2[j-1]);
                if ((n1+n2)%2 == 1) return maxLeft;
                int minRight = 0;
                if (i == n1) minRight = nums2[j];
                else if (j == n2) minRight = nums1[i];
                else minRight = Math.min(nums1[i], nums2[j]);
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double output = s.findMedianSortedArrays(nums1, nums2);
        System.out.println(output);
        int[] nums3 = {3};
        int[] nums4 = {-2,-1};
        double output2 = s.findMedianSortedArrays(nums3, nums4);
        System.out.println(output2);
    }
}