// 1200. 最小绝对差
// #easy
// -

package _1200;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> first = new LinkedList<>();
        first.add(arr[0]);
        first.add(arr[1]);
        list.add(first);
        int diff = arr[1] - arr[0];
        for (int i=2;i<arr.length;++i) {
            if (arr[i] - arr[i-1] == diff) {
                List<Integer> cur = new LinkedList<>();
                cur.add(arr[i-1]);
                cur.add(arr[i]);
                list.add(cur);
            } else if (arr[i] - arr[i-1] < diff) {
                diff = arr[i] - arr[i-1];
                List<Integer> cur = new LinkedList<>();
                cur.add(arr[i-1]);
                cur.add(arr[i]);
                list.clear();
                list.add(cur);
            }
        }
        return list;
    }
}