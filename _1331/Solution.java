// 1331. 数组序号转换
// #easy
// -

package _1331;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        int i = 1;
        for (int k : sorted) {
            if (!map.containsKey(k)) map.put(k, i++);
        }
        for (int j=0;j<arr.length;++j) {
            arr[j] = map.get(arr[j]);
        }
        return arr;
    }
}
