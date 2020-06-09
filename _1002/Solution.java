// 1002. 查找常用字符
// #easy
// -

package _1002;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] A) {
        int[] ans = new int[26];
        for (int i=0;i<A[0].length();++i) {
            ++ans[A[0].charAt(i) - 'a'];
        }
        for (int i=1;i<A.length;++i) {
            int[] cur = new int[26];
            for (int j=0;j<A[i].length();++j) {
                ++cur[A[i].charAt(j) - 'a'];
            }
            for (int j=0;j<26;++j) {
                ans[j] = Math.min(ans[j], cur[j]);
            }
        }
        List<String> list = new LinkedList<>();
        for (int i=0;i<26;++i) {
            while (ans[i] > 0) {
                list.add(Character.toString((char)('a' + i)));
                --ans[i];
            }
        }
        return list;
    }
}