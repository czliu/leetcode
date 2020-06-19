// 1385. 两个数组间的距离值
// #easy
// -

package _1385;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int k : arr1) {
            if (check(k, arr2, d)) ++count;
        }
        return count;
    }

    private boolean check(int a1, int[] arr2, int d) {
        for (int k : arr2) {
            if (Math.abs(a1 - k) <= d) return false;
        }
        return true;
    }
}
