// 0389. Find the Difference
// Hashmap

package _0389;

import java.util.*;

class Solution {

    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) map.put(c,1);
            else map.put(c, map.get(c)+1);
        }
        for (Character c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)-1);
                if (map.get(c) == 0) map.remove(c);
            }
            else return c;
        }
        throw new IllegalArgumentException("Invalid input");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        char result1 = s.findTheDifference("a","aa");
        System.out.println(result1);
    }
}
