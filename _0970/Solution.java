// 970. 强整数
// #easy
// -

package _0970;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        int i = 0;
        double a = Math.pow(x, i);
        while (a <= bound) {
            int j = 0;
            double b = Math.pow(y, j);
            while (a + b <= bound) {
                set.add((int)(a + b));
                if (y == 1) break;
                else {
                    ++j;
                    b = Math.pow(y, j);
                }
            }
            if (x == 1) break;
            else {
                ++i;
                a = Math.pow(x, i);
            }
        }
        for (int k : set) list.add(k);
        return list;
    }
}