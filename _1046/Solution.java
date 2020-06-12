// 1046. 最后一块石头的重量
// #easy
// -

package _1046;

import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer> list = new ArrayList<>();
        for (int i : stones) list.add(i);
        int count = list.size();
        while (count > 1) {
            if (list.get(count-1) == list.get(count-2)) {
                list.remove(count-1);
                list.remove(count-2);
                count -= 2;
            }
            else {
                int val = list.get(count-1) - list.get(count-2);
                list.remove(count-1);
                list.remove(count-2);
                count -= 2;
                int i=0;
                while (i < count && list.get(i) < val) ++i;
                list.add(i, val);
                ++count;
            }
        }
        if (count == 0) return 0;
        else return list.get(0);
    }
}
