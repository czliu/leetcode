// 953. 验证外星语词典
// #easy
// -

package _0953;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Character, Integer> map = new HashMap<>();

    public boolean isAlienSorted(String[] words, String order) {
        for (int i=0;i<26;++i) {
            map.put(order.charAt(i), i);
        }
        for (int i=0;i<words.length-1;++i) {
            if(compare(words[i], words[i+1]) == false) return false;
        }
        return true;
    }

    private boolean compare(String a, String b) {
        int i = 0;
        while (i < Math.min(a.length(), b.length())) {
            if (map.get(a.charAt(i)) > map.get(b.charAt(i))) return false;
            if (map.get(a.charAt(i)) < map.get(b.charAt(i))) return true;
            ++i;
        }
        if (i < a.length()) return false;
        return true;
    }
}