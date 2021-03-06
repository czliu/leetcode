// 0076. 最小覆盖子串
// #hard
// *

package _0076;

import java.util.*;

public class Solution {

    Map<Character, Integer> ori = new HashMap<>();
    Map<Character, Integer> cur = new HashMap<>();

    public String minWindow(String s, String t) {
        
        int tLen = t.length();
        for (int i=0;i<tLen;++i) {
            char c = t.charAt(i);
            ori.put(c, ori.getOrDefault(c, 0) + 1);
        }
        int l = 0, r = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        int sLen = s.length();
        while (r < sLen) {
            ++r;
            if (r < sLen && ori.containsKey(s.charAt(r))) {
                cur.put(s.charAt(r), cur.getOrDefault(s.charAt(r), 0) + 1);
            }
            while (check() && l <= r) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ansL = l;
                    ansR = l + len;
                }
                if (ori.containsKey(s.charAt(l))) {
                    cur.put(s.charAt(l), cur.getOrDefault(s.charAt(l), 0) - 1);
                }
                ++l;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);

    }

    public boolean check() {
        for (Character c : ori.keySet()) {
            if (cur.getOrDefault(c, 0) < ori.get(c)) return false;
        }
        return true;
    }
    
}