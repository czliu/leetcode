// 819. 最常见的单词
// #easy
// -

package _0819;

import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        Set<String> setBanned = new HashSet<>();
        for (String s : banned) setBanned.add(s);
        int start = -1;
        String curWord = "";
        for (int i=0;i<paragraph.length();++i) {
            if (start == -1 && Character.isLetter(paragraph.charAt(i))) {
                start = i;
            }
            else if (start != -1 && !Character.isLetter(paragraph.charAt(i))) {
                curWord = paragraph.substring(start, i);
                start = -1;
                if (!setBanned.contains(curWord)) map.put(curWord, map.getOrDefault(curWord, 0) + 1);
            }
            else if (start != -1 && i == paragraph.length() - 1) {
                curWord = paragraph.substring(start, i + 1);
                if (!setBanned.contains(curWord)) map.put(curWord, map.getOrDefault(curWord, 0) + 1);
            }
        }
        int max = 0;
        String ans = "";
        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                ans = s;
                max = map.get(s);
            }
        }
        return ans;
    }
}