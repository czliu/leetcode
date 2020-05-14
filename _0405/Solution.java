// 0405. convert a number to hexadecimal
// #easy
// *

package _0405;

public class Solution {

    public String toHex(int num) {
        if (num == 0) return "0";
        String ans = "";
        while (num != 0) {
            // ans = oneHex(num % 16) + ans;  //toHex(-1) = fffffff-1
            ans = oneHex(num&15) + ans;
            num = num >>> 4;
        }
        return ans;
    }

    private String oneHex(int n) {
        if (n < 10) return String.valueOf(n);
        return String.valueOf((char)('a' + n - 10)); 
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        String a1 = s.toHex(26);
        String a2 = s.toHex(-1);
        System.out.println(a1 + " " + a2);
    }
}