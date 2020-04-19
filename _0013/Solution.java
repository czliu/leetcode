// 0013. Roman to Integer

// String

package _0013;

import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        if (s.length() == 0 || s == null)
            return ans;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; ++i) {
            switch (c[i]) {
                case 'I':
                    if (i < c.length - 1 && c[i + 1] == 'V') {
                        ans += 4;
                        ++i;
                    } else if (i < c.length - 1 && c[i + 1] == 'X') {
                        ans += 9;
                        ++i;
                    } else
                        ans += 1;
                    break;
                case 'V':
                    ans += 5;
                    break;
                case 'X':
                    if (i < c.length - 1 && c[i + 1] == 'L') {
                        ans += 40;
                        ++i;
                    } else if (i < c.length - 1 && c[i + 1] == 'C') {
                        ans += 90;
                        ++i;
                    } else
                        ans += 10;
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    if (i < c.length - 1 && c[i + 1] == 'D') {
                        ans += 400;
                        ++i;
                    } else if (i < c.length - 1 && c[i + 1] == 'M') {
                        ans += 900;
                        ++i;
                    } else
                        ans += 100;
                    break;
                case 'D':
                    ans += 500;
                    break;
                case 'M':
                    ans += 1000;
                    break;
            }
        }
        return ans;
    }
}