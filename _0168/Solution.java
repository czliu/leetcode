// 0168. Excel sheet column title
// #easy
// *
// related: 0171. Excel sheet column number

package _0168;

public class Solution {

    public String convertToTitle(int n) {
        String ans = "";
        if (n == 0) return ans;
        while (n > 0) {
            --n;
            ans = (char)('A' + (n%26)) + ans;
            n = n / 26;
        }
        return ans;
    }
    
}