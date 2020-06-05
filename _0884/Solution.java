// 884. 两句话中的不常见单词
// #easy
// -

package _0884;

import java.util.*;

class Solution {

    Map<String, Integer> map = new HashMap<>();

    public String[] uncommonFromSentences(String A, String B) {
        allWords(A);
        allWords(B);
        List<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) list.add(s);
        }
        String[] ans = new String[list.size()];
        for (int i=0;i<list.size();++i) ans[i] = list.get(i);
        return ans;
    }

    private void allWords(String A) {
        int start = -1;
        for (int i=0;i<A.length();++i) {
            if (start == -1 && Character.isLetter(A.charAt(i))) start = i;
            else if (start != -1 && A.charAt(i) == ' ') {
                String word = A.substring(start, i);
                map.put(word, map.getOrDefault(word, 0) + 1);
                start = -1;
            }
            if (i == A.length() - 1 && start != -1) {
                String word = A.substring(start);
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
    }
}