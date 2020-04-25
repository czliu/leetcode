// 0344. Reverse String

// string

package _0344;

public class Solution {

    public void reverseString(char[] s) {
        int n = s.length;
        if (n == 0) return;
        for (int i = 0; i <= (n-1) / 2; ++i) {
            char tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }
    }
}