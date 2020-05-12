// 0709. to lower case
// #easy #string
// -

package _0709;

public class Solution {

    public String toLowerCase(String str) {
        int n = str.length();
        if (n == 0) return str;
        char[] c = str.toCharArray();
        for (int i=0;i<n;++i){
            if (c[i] - 'A' >= 0 && 'Z' - c[i] >= 0) c[i] = (char)(c[i] - 'A' + 'a');
        }
        return String.valueOf(c);
    }
    
}