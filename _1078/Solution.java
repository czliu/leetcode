// 1078. Bigram 分词
// #easy
// -

package _1078;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> list = new LinkedList<>();
        for (int i=0;i<=words.length-3;++i) {
            if (words[i].equals(first) && words[i+1].equals(second)) {
                list.add(words[i+2]);
            }
        }
        String[] ans = new String[list.size()];
        int i = 0;
        for (String s : list) ans[i++] = s;
        return ans;
    }
}