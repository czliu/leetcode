// 1095. find in mountain array

// #hard #binary search #review

package _1095;

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l = 0, r = mountainArr.length() - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) l = mid + 1;
            else r = mid;
        }
        int peak = l;
        int index = binarySearch(mountainArr, target, 0, peak, 1);
        if (index != -1) return index;
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, -1);
    }

    // 一个reverse变量搞定升序降序，当升序 reverse=1,否则 reverse=-1
    private int binarySearch(MountainArray mountainArr, int target, int l, int r, int reverse){
        target *= reverse;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int cur = reverse * mountainArr.get(mid);
            if (cur == target) return mid;
            else if (cur < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    
}