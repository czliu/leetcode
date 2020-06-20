// 1408. 数组中的字符串匹配
// #easy
// -

package _1408;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        int[] len = new int[n];
        for (int i=0;i<n;++i) len[i] = words[i].length();
        List<String> list = new LinkedList<>();
        for (int i=0;i<n;++i) {
            for (int j=0;j<n;++j) {
                if (len[i] < len[j] && words[j].contains(words[i])) {
                    list.add(words[i]);
                    break;
                }
            }
        }
        return list;
    }
}