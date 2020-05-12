// 0171. Excel sheet column number
// #easy
// -
// related: 0168. Excel sheet column title
package _0171;

public class Solution {

    public int titleToNumber(String s) {
        int ans = 0;
        int n = s.length();
        if (n == 0) return ans;
        int i = 0;
        while (i <= n-1){
            ans *= 26;
            ans += s.charAt(i) - 'A' + 1;
            ++i;
        }
        return ans;
    }
    
}