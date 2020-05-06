// 0088. merge sorted array
// -
// #easy

package _0088;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int i = m + n - 1; // the index of merged array
        while (i >= 0) {
            if (index1 >= 0 && index2 >= 0 && nums1[index1] >= nums2[index2]) {
                nums1[i] = nums1[index1];
                --index1;
                --i;
            } else if (index1 >= 0 && index2 >= 0 && nums1[index1] < nums2[index2]) {
                nums1[i] = nums2[index2];
                --index2;
                --i;
            } else if (index1 < 0) {
                nums1[i] = nums2[index2];
                --index2;
                --i;
            } else if (index2 < 0) {
                nums1[i] = nums1[index1];
                --index1;
                --i;
            }
        }
    }

}