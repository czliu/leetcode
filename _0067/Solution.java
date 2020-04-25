// 0067. Add binary

// string

package _0067;

import java.util.Arrays;

public class Solution {

    public String addBinary(String a, String b) {
        int na = a.length();
        int nb = b.length();
        if (na < nb) {
            String tmp = a;
            a = b;
            b = tmp;
            int t = na;
            na = nb;
            nb = t;
        }
        // now na >= nb
        char[] c = new char[na + 1];
        char carry = '0';
        for (int i=0;i<=nb-1;++i) {
            if (a.charAt(na-1-i) == b.charAt(nb-1-i)) {
                c[na-i] = carry;
                carry = a.charAt(na-1-i);
            }
            else {// (a.charAt(na-1-i) != b.charAt(nb-1-i)) {
                if (carry == '0') c[na-i] = '1';
                else c[na-i] = '0';
            }
        }
        for (int i=na-nb-1;i>=0;--i){
            if (carry == '0') c[i+1] = a.charAt(i);
            else { // carry == '1'
                if (a.charAt(i) == '1') c[i+1] = '0';
                else {
                    c[i+1] = '1';
                    carry = '0';
                }
            }
        }
        if (carry == '1') {
            c[0] = '1';
        }
        else {
            c = Arrays.copyOfRange(c, 1, c.length);
        };
        String ans = new String(c);
        return ans;
    }
}