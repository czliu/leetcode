// 0014. Longest common prefix

// string

package _0014;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0 || strs == null) return "";
        int m = strs[0].length();
        for (String s : strs) {
            if (s.length() < m) m = s.length();
        }
        if (m == 0) return "";
        String ans = "";
        outerloop:
        for (int i=0;i<m;++i){
            char c = strs[0].charAt(i);
            for (String s : strs){
                if (s.charAt(i) != c) break outerloop;
            }
            ans += c;
        }
        return ans;
    }
}