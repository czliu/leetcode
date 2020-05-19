// 0504. base 7
// #easy
// -

package _0504;

public class Solution {

    public String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean negative = false;
        if (num < 0) {
            num = 0 - num;
            negative = true;
        }
        String ans = "";
        while (num != 0) {
            int cur = num % 7;
            num = num / 7;
            ans = String.valueOf(cur) + ans;
        }
        if (negative == true) ans = "-" + ans;
        return ans;
    }
    
}