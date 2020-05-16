// 0392. is subsequence
// #easy
// -

package _0392;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length()) {
            if (j >= t.length()) return false;
            else if (s.charAt(i) == t.charAt(j)) {
                ++i;
                ++j;
            }
            else ++j;
        }
        return true;
    }
    
}