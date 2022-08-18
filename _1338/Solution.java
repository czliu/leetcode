package _1338;

import java.util.*;

public class Solution {
    public int minSetSize(int[] arr) {
        int len = arr.length;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i=0;i<len;++i) {
            if (m.containsKey(arr[i])) m.put(arr[i], m.get(arr[i])+1);
            else m.put(arr[i], 1);
        }
        List<Integer> a = new ArrayList<>();
        for (int i:m.keySet()) {
            a.add(m.get(i));
        }
        Collections.sort(a);
        int sum = 0, count = 0;
        for (int i=a.size()-1;i>=0;--i) {
            sum += a.get(i);
            count++;
            if (sum >= len / 2) return count;
        }
        return -1;
    }
}
