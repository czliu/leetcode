// 1300. 转变数组后最接近目标值的数组和
// #medium
// *

package _1300;

import java.util.Arrays;

class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);

        int n = arr.length, sum = 0, res = -1, rest = n; // rest: 还有几个元素可变
        for (int i = 0; i < n; i++, rest--) {
            int r = (target - sum) / rest; // 剩余后面的都变成多少比较接近
            if (r <= arr[i]) { // 比当前元素小（保证 r > arr[i - 1]，否则上一轮已 break）
                res = r; // 当前及以后都改为 r
                break; // 找到就跳出
            }
            sum += arr[i];
        }

        // 都找不到，说明希望 value 比 arr[n - 1] 还要大，则返回最大即可
        if (res == -1) return arr[n - 1];

        // 当前得出的 res 只保证了总和小于 target 的最近
        // 试一试 res + 1 会不会更近
        int dis = target - sum - res * rest;
        if (Math.abs(target - sum - (res + 1) * rest) < dis) return res + 1;
        return res;
    }
}
