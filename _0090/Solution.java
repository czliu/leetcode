// 90. 子集 II
// #medium
// -

package _0090;

import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int k : nums) map.put(k, map.getOrDefault(k, 0)+1);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new LinkedList<>());
        int n = nums.length;
        if (n == 0) return list;
        int count = 1;
        for (int k : map.keySet()) {
            int kcount = map.get(k);
            for (int i=0;i<count;++i) {
                List<Integer> cur = new LinkedList<>(list.get(i));
                for (int j=0;j<kcount;++j) {
                    cur.add(k);
                    list.add(new LinkedList<>(cur));
                }
            }
            count *= (kcount + 1);
        }
        return list;
    }
}
