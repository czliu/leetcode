// 1287. 有序数组中出现次数超过25%的元素
// #easy
// -

package _1287;

class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        if (count(arr, n / 2) > n / 4) return arr[n/2];
        if (count(arr, n / 4) > n / 4) return arr[n/4];
        if (count(arr, n - n / 4) > n / 4) return arr[n - n/4];
        return 0;
    }

    private int count(int[] arr, int index) {
        int count = 1;
        int i = index - 1;
        while (i >= 0 && arr[i] == arr[index]) {
            ++count;
            --i;
        }
        i = index + 1;
        while (i < arr.length && arr[i] == arr[index]) {
            ++count;
            ++i;
        }
        return count;
    }
}
