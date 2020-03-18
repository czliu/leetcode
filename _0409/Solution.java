// 0409. Longest Palindrome
// Hashmap

package _0409;

import java.util.*;

class Solution {

    public int longestPalindrome(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int ans = 0;
        boolean containOdd = false;
        for (Integer value : map.values()) {
            if (value % 2 == 0) ans += value;
            else {
                containOdd = true;
                ans += (value - 1);
            }
        }
        if (containOdd) ans++;
        return ans;
    }

    public static void main(String[] args) {
    }
}
