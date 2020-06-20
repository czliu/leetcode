// 1436. 旅行终点站
// #easy
// -

package _1436;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> list : paths) {
            map.put(list.get(0), list.get(1));
        }
        String cur = paths.get(0).get(0);
        while (map.containsKey(cur)) cur = map.get(cur);
        return cur;
    }
}