package _0387;

import java.util.*;

public class Solution2 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();
        char[] c = s.toCharArray();
        for (int i=0;i<c.length;++i) {
            if (m.containsKey(c[i])) m.put(c[i], m.get(c[i])+1);
            else m.put(c[i], 1);
        }
        for (int i=0;i<c.length;++i) {
            if (m.get(c[i])==1) return i;
        }
        return -1;
    }
}
