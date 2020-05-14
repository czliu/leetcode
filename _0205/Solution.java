// 0205. isomorphic strings
// #easy #hashmap
// *

package _0205;

import java.util.*;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        return isIsomorphicHelper(s, t) && isIsomorphicHelper(t, s); // don't forget two directional mapping
    }

    private boolean isIsomorphicHelper(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        int n = s.length();
        int m = t.length();
        if (n != m) return false;
        if (n == 0) return true;
        for (int i=0;i<n;++i){
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
    
}