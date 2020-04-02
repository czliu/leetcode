// 0914. X of a kind in a deck of cards
// 最大公约数, 辗转相除法

package _0914;

import java.util.*;

class Solution {

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int x = map.get(deck[0]);
        for (int value : map.values()) {
            if (x < 2) return false;
            else if (value == x) continue;
            else if (gcd(x, value) < 2) return false;
            else x = gcd(x, value);
        }
        return true;
    }

    // Greatest common divisor
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] deck = {1,1,2,2,2,2};
        boolean ans = s.hasGroupsSizeX(deck);
        System.out.println(ans);
    }
}
