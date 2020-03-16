// 1160. Find words that can be formed by characters

package _1160;

import java.util.*;

class Solution {

    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for (int j=0;j<words.length;j++) {
            if (contain(words[j], chars)) count += words[j].length();
        }
        return count;
    }

    private boolean contain(String word, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<chars.length();i++) {
            map.put(chars.charAt(i), map.getOrDefault(chars.charAt(i), 0) + 1);
        }
        for (int j=0;j<word.length();j++) {
            if (!map.containsKey(word.charAt(j)) || map.get(word.charAt(j)) == 0) return false;
            else map.put(word.charAt(j), map.get(word.charAt(j)) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
