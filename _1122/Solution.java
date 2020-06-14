// 1122. 数组的相对排序
// #easy
// -

package _1122;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : arr1) map.put(k, map.getOrDefault(k, 0) + 1);
        int index = 0;
        for (int k : arr2) {
            int count = map.get(k);
            while (count > 0) {
                arr1[index++] = k;
                --count;
            }
            map.remove(k);
        }
        int start = index;
        for (int k : map.keySet()) {
            int count = map.get(k);
            while (count > 0) {
                arr1[index++] = k;
                --count;
            }
        }
        Arrays.sort(arr1, start, arr1.length);
        return arr1;
    }
}