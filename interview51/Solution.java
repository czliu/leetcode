// interview51

// review

package interview51;

public class Solution {
    public int reversePairs(int[] nums) {
        int[] tmp = new int[nums.length];
        int ans = mergeSort(nums, tmp, 0, nums.length - 1);
        return ans;
    }

    private int mergeSort(int[] nums, int[] tmp, int l, int r){
        if (l >= r) return 0;
        int mid = l + (r - l)/2;
        int count = mergeSort(nums, tmp, l, mid) + mergeSort(nums, tmp, mid+1, r);
        int i = l, j = mid + 1, pos = l;
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]){
                tmp[pos] = nums[i];
                ++i;
                count += (j - (mid + 1));
            }
            else { // nums[i] > nums[j]
                tmp[pos] = nums[j];
                ++j;
            }
            ++pos;
        }
        for (int k=i;k<=mid;++k){
            tmp[pos] = nums[k];
            ++pos;
            count += (j - (mid + 1));
        }
        for (int k=j;k<=r;++k){
            tmp[pos] = nums[k];
            ++pos;
        }
        for (int k=l;k<=r;++k) nums[k] = tmp[k];
        return count;
    }

}