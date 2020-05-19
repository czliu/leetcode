// 0500. keyboard row
// #easy
// -

package _0500;

import java.util.*;

public class Solution {

    List<String> list = new LinkedList<>();
    
    public String[] findWords(String[] words) {
        int n = words.length;
        if (n == 0) return new String[0];
        for (int i=0;i<words.length;++i){
            if (isSameRow(words[i])) list.add(words[i]);
        }
        String[] ans = new String[list.size()];
        int i = 0;
        for (String s : list) ans[i++] = s;
        return ans;
    }

    private boolean isSameRow(String s) {
        int n = s.length();
        if (n <= 1) return true;
        int m = row(s.charAt(0));
        for (int i=1;i<s.length();++i) {
            int k = row(s.charAt(i));
            if (k != m) return false;
        }
        return true;

    }

    private int row(char c) {
        if (c - 'A' >= 0 && 'Z' - c >= 0) c = (char)(c - 'A' + 'a');
        String a = "qwertyuiop";
        for (int i=0;i<a.length();++i){
            if (c == a.charAt(i)) return 1;
        }
        a = "asdfghjkl";
        for (int i=0;i<a.length();++i){
            if (c == a.charAt(i)) return 2;
        }
        // a = "zxcvbnm";
        // for (int i=0;i<a.length();++i){
        //     if (c == a.charAt(i)) return 3;
        // }
        return 3;
    }

}