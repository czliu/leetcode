// 0599. 两个列表的最小索引总和
// #easy
// -

package _0599;

import java.util.*;

public class Solution {

    public String[] findRestaurant(String[] list1, String[] list2) {
        int n1 = list1.length, n2 = list2.length;
        if (n1 == 0 || n2 == 0) return new String[0];
        Map<String, Integer> map = new HashMap<>();
        for (int i=0;i<n1;++i) {
            map.put(list1[i], i);
        }
        int min = -1;
        List<String> list = new LinkedList<>();
        for (int i=0;i<n2;++i) {
            if (map.containsKey(list2[i])) {
                if (min == -1) {
                    min = map.get(list2[i]) + i;
                    list.add(list2[i]);
                } else if (map.get(list2[i]) + i < min) {
                    min = map.get(list2[i]) + i;
                    list.clear();
                    list.add(list2[i]);
                } else if (map.get(list2[i]) + i == min) {
                    list.add(list2[i]);
                }
            }
        }
        String[] ans = new String[list.size()];
        int i = 0;
        for (String s : list) ans[i++] = s;
        return ans;
    }
    
}